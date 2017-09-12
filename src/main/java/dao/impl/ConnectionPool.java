package dao.impl;

import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Properties;

import dao.DataSource;

public class ConnectionPool implements DataSource {
	private static LinkedList<Connection> listConnections = new LinkedList<Connection>();
	static{
		try {
			InputStream in = ConnectionPool.class.getClassLoader().getResourceAsStream("propertiesFolder/db.properties");
			Properties prop = new Properties();
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username=prop.getProperty("username");
			String password = prop.getProperty("password");
			int PoolInitSize = Integer.parseInt(prop.getProperty("PoolInitSize"));
			//��ȡ���ݿ���Ϣ
			Class.forName(driver);//JVMִ�о�̬�����
			for(int i=0;i<PoolInitSize;i++){
				//�������ݿ���Ϣ�����뵽����
				Connection conn = DriverManager.getConnection(url,username,password);
				System.out.println("�õ�����"+conn);
				listConnections.add(conn);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Connection getConnection(){
		// TODO Auto-generated method stub
		if(listConnections.size()>0){
			final Connection conn = listConnections.removeFirst();//�ӳ��л��һ������
			System.out.println("���ݿ����ӳش�С"+listConnections.size());
			return (Connection)Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(), conn.getClass().getInterfaces(), 
					new InvocationHandler(){
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							// TODO Auto-generated method stub
							if(!method.getName().equals("close")){
								return method.invoke(conn, args);
							}
							else{
								listConnections.add(conn);
								System.out.println(conn+"���������ݿ����ӳ���");
								System.out.println("���ݿ����ӳش�СΪ"+listConnections.size());
								return null;
							}
						}
			});
		}
		else{
			throw new RuntimeException("");
		}
	}
	@Override
	public Connection getConnection(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}

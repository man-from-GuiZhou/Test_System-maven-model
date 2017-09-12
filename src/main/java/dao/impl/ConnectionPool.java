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
			//读取数据库信息
			Class.forName(driver);//JVM执行静态代码段
			for(int i=0;i<PoolInitSize;i++){
				//连接数据库信息并加入到集合
				Connection conn = DriverManager.getConnection(url,username,password);
				System.out.println("得到链接"+conn);
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
			final Connection conn = listConnections.removeFirst();//从池中获得一个连接
			System.out.println("数据库连接池大小"+listConnections.size());
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
								System.out.println(conn+"还给了数据库连接池了");
								System.out.println("数据库连接池大小为"+listConnections.size());
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

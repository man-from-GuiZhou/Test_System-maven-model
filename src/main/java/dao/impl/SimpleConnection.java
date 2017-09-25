package dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import dao.DataSource;

public class SimpleConnection implements DataSource {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		
		//当出现空指针问题是不妨先检查配置文件路径，这个地方出错的概率相当大
		InputStream in = SimpleConnection.class.getClassLoader().getResourceAsStream("db.properties");
		//InputStream ins = SimpleConnection.class.getClassLoader().getResourceAsStream("db.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("conn null!");
		return null;
	}

	@Override
	public Connection getConnection(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}

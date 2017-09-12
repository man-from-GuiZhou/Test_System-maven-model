package dao;

import java.sql.Connection;

public interface DataSource {
	public Connection getConnection();
	public Connection getConnection(String name,String password);
}

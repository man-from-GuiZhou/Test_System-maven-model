package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import dao.impl.ConnectionPool;
import dao.impl.SimpleConnection;
//import dao.impl.SimpleConnection;

public class JDBCUtils {
	//数据库池连接
	//private static ConnectionPool cp;
	//简单数据库连接
	private static SimpleConnection sc = new SimpleConnection();
	
	public static Connection getConnection() {
		//return cp.getConnection();
		return sc.getConnection();
	}
	
	public static void release(Connection conn,PreparedStatement st,ResultSet rs){
		 if(rs!=null){
	            try{//关闭存储查询结果的ResultSet对象
	                rs.close();
	            }catch (Exception e) {
	                e.printStackTrace();
	            }
	            rs = null;
	        }
	        if(st!=null){
	            try{
	                //关闭负责执行SQL命令的Statement对象
	                st.close();
	            }catch (Exception e) {
	                e.printStackTrace(); 
	            }
	        }
	        
	        if(conn!=null){
	            try{
	                //关闭Connection数据库连接对象
	                conn.close();
	            }catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	}
	
}

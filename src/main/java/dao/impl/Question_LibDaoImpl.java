package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import dao.Question_lib;
import dao.Question_libDao;
import domain.Question_Lib;
import utils.JDBCUtils;

public class Question_LibDaoImpl implements Question_libDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	@Override
	public int addLib(Question_Lib qLib) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeLib(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateLib(Question_Lib qLib) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Question_Lib> findList() {
		// TODO Auto-generated method stub
		ArrayList<Question_Lib> libList = new ArrayList<Question_Lib>();
		String sql="select * from question_lib";
		try {
			conn=JDBCUtils.getConnection();
			Question_Lib tempLib = (Question_Lib) Class.forName("domain.Question_Lib").newInstance();
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				tempLib.setQuestion_lib_id(rs.getInt(1));
				tempLib.setTestpage_type(rs.getString(2));
				/*之前这里写错了，都取了第二行*/
				tempLib.setTestpage_job(rs.getString(3));
				tempLib.setQuestion_num(rs.getInt(4));
				libList.add(tempLib);
				tempLib =(Question_Lib) Class.forName("domain.Question_Lib").newInstance();
			}
			return libList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtils.release(conn, pst, rs);
		return null;
	}

	@Override
	public Question_Lib findLib(int id) {
		// TODO Auto-generated method stub
		try {
			String sql="SELECT * from question_lib where question_lib_id=?";
			conn= JDBCUtils.getConnection();
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs=pst.executeQuery();
			rs.next();
			System.out.println(rs.getString(3));
			Question_Lib ql = new Question_Lib();
			ql.setQuestion_lib_id(id);
			ql.setTestpage_type(rs.getString(2));
			ql.setTestpage_job(rs.getString(3));
			ql.setQuestion_num(rs.getInt(4));
			return ql;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("为空");
		return null; 
	}

}

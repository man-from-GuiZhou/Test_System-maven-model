package dao;

import java.util.ArrayList;

import domain.Question_Lib;

public interface Question_libDao { 
	
	//添加题库数据条目
	public int addLib(Question_Lib qLib);
	//删除条目
	public int removeLib(int id);
	//更改条目
	public int updateLib(Question_Lib qLib);
	//查询题库表所有信息
	public ArrayList<Question_Lib> findList();
	//根据id查出单条题库信息
	public Question_Lib findLib(int id);
	
}

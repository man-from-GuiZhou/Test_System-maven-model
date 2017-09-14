package dao;

import java.util.ArrayList;

public interface Question_lib {
	
	//添加题库数据条目
	public int addLib(Question_lib qLib);
	//删除条目
	public int removeLib(int id);
	//更改条目
	public int updateLib(Question_lib qLib);
	//查询题库表所有信息
	public ArrayList<Question_lib> findList();
	//根据id查出单条题库信息
	public Question_lib findLib(int id);
	
}

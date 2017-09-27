package service;

import java.util.ArrayList;

import domain.Question_Lib;

public interface QuestionLibService {
	
	/*显示所有表的题库项*/
	public ArrayList<Question_Lib> showLibList();
	/*添加题库项*/
	public int addLib(String lib_type,String lib_job);
	/*修改题库项*/
	public int updateLib(int id,String lib_type,String lib_job);
	/*根据id号移除题库项*/
	public int removeLib(int id);
	/*根据题库名移除题库项*/
	public int removeLib(String lib_job);

	public Question_Lib findLib(int id);
}

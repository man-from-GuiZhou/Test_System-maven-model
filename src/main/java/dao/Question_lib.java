package dao;

import java.util.ArrayList;

public interface Question_lib {
	
	public int addLib(Question_lib qLib);
	
	public int removeLib(int id);
	
	public int updateLib(Question_lib qLib);
	
	public ArrayList<Question_lib> findList();
	
	public Question_lib findLib(int id);
	
}

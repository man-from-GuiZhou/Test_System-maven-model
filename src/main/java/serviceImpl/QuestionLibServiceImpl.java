package serviceImpl;

import java.util.ArrayList;

import dao.Question_libDao;
import dao.impl.Question_LibDaoImpl;
import domain.Question_Lib;
import service.QuestionLibService;
/*
 * 这部分由  controller.QuestionLibCenter调用,该类负责题库Question_Lib的相关业务操作
 * 目前主要是数据库相关操作
 * 2017/9/15
 * */
public class QuestionLibServiceImpl implements QuestionLibService {
	/*dao类*/
	private Question_libDao qld = new Question_LibDaoImpl();
	
	/*该方法用于检索题库表当中的所有题库*/
	@Override
	public ArrayList<Question_Lib> showLibList() {
		// TODO Auto-generated method stub
		return qld.findList(); 
	}

	@Override
	public int addLib(String libType, String libName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateLib(int id, String libType, String libName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeLib(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeLib(String libName) {
		// TODO Auto-generated method stub
		return 0;
	}

}

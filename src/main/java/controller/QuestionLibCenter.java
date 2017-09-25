package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Question_libDao;
import domain.Question_Lib;
import service.QuestionLibService;
import serviceImpl.QuestionLibServiceImpl;

/**
 * Servlet implementation class QuestionLibCenter
 */
@WebServlet("/QuestionLibCenter")
public class QuestionLibCenter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Question_Lib> libList = new ArrayList<Question_Lib>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionLibCenter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		if(request.getParameter("operate")==null) {
		//System.out.println("get方法接收");
		QuestionLibService qls = new QuestionLibServiceImpl();
		this.libList=qls.showLibList();
		request.setAttribute("libList", libList);
		RequestDispatcher rd = request.getRequestDispatcher("/QuestionAdmin/QuestionLibCenter.jsp");
		//rd.forward(request, response);
		System.out.println(libList);
		rd.forward(request, response);
		}*/
		//else {
			
			//在这里通过携带的参数来判断需要的功能，通过这样来减少servlet的数量
			String operate=request.getParameter("operate");
			System.out.println(operate);
			if(operate!=null){
				switch(operate){
					case "enterEdit":
						try {
							Question_libDao qld = (Question_libDao) Class.forName("dao.impl.Question_LibDaoImpl").newInstance();
							Question_Lib ql = qld.findLib(Integer.parseInt(request.getParameter("lib_id")));
							request.setAttribute("lib_info", ql);
						} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						RequestDispatcher rd = request.getRequestDispatcher("/QuestionAdmin/QuestionLibEdit.jsp");
						rd.forward(request, response);
						break;
				}
			}

		//}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub 
		//doGet(request, response);
		 	System.out.println("POST方法接收");
			//Question_libDao qld = (Question_libDao) Class.forName("dao.impl.Question_LibDaoImpl").newInstance();
			QuestionLibService qls = new QuestionLibServiceImpl();
			String operate=request.getParameter("operate");
			switch(operate) {
			//添加题库
			case "add":
				String addType=request.getParameter("testpage_type");
				System.out.println("servlet:"+addType);
				String addJob=request.getParameter("testpage_job");
				qls.addLib(addType, addJob);			
				break;
			case "edit":
				int editId = Integer.parseInt(request.getParameter("testpage_lib_id"));
				String editType=request.getParameter("testpage_type");
				System.out.println("servlet:"+editType);
				String editJob=request.getParameter("testpage_job");
				qls.updateLib(editId, editType, editJob);
				break;
			case "remove":
				int removeId = Integer.parseInt(request.getParameter("testpage_lib_id"));
				qls.removeLib(removeId);
			}
			//这里跳转以后不能更新管理页的页面
			RequestDispatcher rd = request.getRequestDispatcher("/QuestionAdmin/QuestionLibCenter.jsp");
			rd.forward(request, response);
		} 
}

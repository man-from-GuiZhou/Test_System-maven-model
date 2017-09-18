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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		if(request.getParameter("operate")==null) {
		System.out.println("get方法接收");
		QuestionLibService qls = new QuestionLibServiceImpl();
		ArrayList<Question_Lib> libList=qls.showLibList();
		request.setAttribute("libList", libList);
		RequestDispatcher rd = request.getRequestDispatcher("/QuestionAdmin/QuestionLibCenter.jsp");
		//rd.forward(request, response);
		System.out.println(libList);
		rd.forward(request, response);
		}
		else {
			
			//在这里通过携带的参数来判断需要的功能，通过这样来减少servlet的数量
			String operate=request.getParameter("operate");
			System.out.println(operate);
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
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub 
		//doGet(request, response);
		//System.out.println("POST方法接收");
		try {
			Question_libDao qld = (Question_libDao) Class.forName("dao.impl.Question_LibDaoImpl").newInstance();
			String operate=request.getParameter("operate");
			switch(operate) {
			//添加题库
			case "add":
				String type=request.getParameter("testpage_type");
				String job=request.getParameter("testpage_job");
				Question_Lib ql = new Question_Lib();
				ql.setTestpage_type(type);
				ql.setTestpage_job(job);
				qld.addLib(ql);
				break;
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

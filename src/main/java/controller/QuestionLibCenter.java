package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		System.out.println("get方法接收");
		
		QuestionLibService qls = new QuestionLibServiceImpl();
		ArrayList<Question_Lib> libList=qls.showLibList();
		request.setAttribute("libList", libList);
		RequestDispatcher rd = request.getRequestDispatcher("/QuestionAdmin/QuestionLibCenter.jsp");
		System.out.println(libList);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//System.out.println("POST方法接收");
	}

}

package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "QuestionCenter")
public class QuestionCenter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operate=request.getParameter("operate");
        if(operate!=null){
            switch (operate){
                case "enterQuestionLib":
                    RequestDispatcher rd = request.getRequestDispatcher("QuestionAdmin/QuestionCenter");
            }
        }
    }
}

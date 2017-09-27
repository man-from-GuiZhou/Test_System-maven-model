package filter;

import domain.Question;
import service.QuestionService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

@WebFilter(filterName = "QuestionListLoadFilter")
/*
拦截所有到题库题目列表页面的请求，填充对应的数据
 */
public class QuestionListLoadFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        int lib_Id = Integer.parseInt(req.getParameter("id"));
        //需要初始化
        try {
            QuestionService qs  = (QuestionService) Class.forName("serviceImpl.QuestionLibServiceImpl").newInstance();
            ArrayList<?extends Question> questionLinkedList = qs.findQuestionList(lib_Id);
            req.setAttribute("questionList","questionLinkedList");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

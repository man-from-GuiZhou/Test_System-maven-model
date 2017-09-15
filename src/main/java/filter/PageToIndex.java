package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PageToIndex implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("过滤器已就位");
		//RequestDispatcher rd = request.getRequestDispatcher("/QuestionAdmin/QuestionLibCenter.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/QuestionLibCenter");
		
		System.out.println("过滤器开始转发");
		rd.forward(request, response);
		//chain.doFilter(request, response);
	}
}

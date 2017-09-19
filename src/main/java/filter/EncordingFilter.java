package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class EncordingFilter
 */
@WebFilter("/EncordingFilter")
public class EncordingFilter implements Filter {
 
    /**
     * Default constructor. 
     */
	
	//设置一个默认的编码
	private String encording ="UTF-8";
	protected FilterConfig filterConfig;
	
	
    public EncordingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		//HttpServletRequest httpRequest = (HttpServletRequest) request;
		request.setCharacterEncoding(encording); 
		response.setCharacterEncoding(encording);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = fConfig;
		if(filterConfig.getInitParameter("encording")!=null) {
			encording=filterConfig.getInitParameter("encording");
		}
	}

}

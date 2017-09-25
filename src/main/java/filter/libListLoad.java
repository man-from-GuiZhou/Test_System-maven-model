package filter;

import service.QuestionLibService;
import serviceImpl.QuestionLibServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "libListLoad")
public class libListLoad implements Filter {
    QuestionLibService qs;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //qs=Class.forName("serviceImpl.QuestionLibServiceImpl").newInstance();
        qs = new QuestionLibServiceImpl();
        req.setAttribute("libList",qs.showLibList());
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

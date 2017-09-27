package filter;

import service.QuestionLibService;
import serviceImpl.QuestionLibServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "libListLoad")
/*
拦截所有到题库中心的页面，为页面填充数据
 */
public class libListLoad implements Filter {
    //qs=Class.forName("serviceImpl.QuestionLibServiceImpl").newInstance();
    QuestionLibService qs = new QuestionLibServiceImpl();
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setAttribute("libList",qs.showLibList());
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

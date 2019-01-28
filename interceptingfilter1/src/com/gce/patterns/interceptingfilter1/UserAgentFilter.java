package com.gce.patterns.interceptingfilter1;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "/*")
public class UserAgentFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String userAgentHeader = ((HttpServletRequest) req).getHeader("User-Agent");
        if (userAgentHeader.contains("Chrome")) {
            chain.doFilter(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("badBrowser.jsp");
            dispatcher.forward(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}


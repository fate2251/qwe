package com.filter;

import com.bean.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//@WebFilter(filterName="HelloFilter" ,urlPatterns= {"/*"})
public class HelloFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse) res;
        User user = (User) request.getSession().getAttribute("u");
        String url = request.getServletPath();
        if(url.equals("/login")){
            filterChain.doFilter(request, response);
        }
        String[] urlArr = url.split("\\.");
        if(urlArr.length > 1){
            if(urlArr[urlArr.length-1].equals("js") ||
                    urlArr[urlArr.length-1].equals("css") ||
                    urlArr[urlArr.length-1].equals("png")
            ){
                filterChain.doFilter(request, response);
            }
        }
        if(user == null){
            String requestType = request.getHeader("X-Requested-With");
            //判断是否是ajax请求
            if(requestType!=null && "XMLHttpRequest".equals(requestType)){
                filterChain.doFilter(request, response);
            }
            response.sendRedirect(request.getContextPath()+"/login");
            return;
        }
        filterChain.doFilter(request, response);
    }
}

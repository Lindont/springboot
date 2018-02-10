package com.example.demo.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * @Author : HuangHaoXin
 * @Description : 自定义过滤器
 * @Date : Create in 2018-02-10
 */


/**
 * 把自定义过滤器注入Spring容器的第一种方式, 加 @Component 注解
 */
//@Component
public class TimeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //System.out.println("过滤器 TimeFilter init...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //System.out.println("过滤器 TimeFilter start...");
        //long start = new Date().getTime();
        chain.doFilter(request, response);
        //System.out.println("过滤器 TimeFilter耗时: " + (new Date().getTime() - start));
        //System.out.println("过滤器 TimeFilter end...");
    }

    @Override
    public void destroy() {
        //System.out.println("过滤器 TimeFilter destroy...");
    }
}

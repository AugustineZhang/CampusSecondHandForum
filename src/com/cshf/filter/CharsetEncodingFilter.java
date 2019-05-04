/**
 * 
 */
package com.cshf.filter;

import javax.servlet.*;
import java.io.IOException;


public class CharsetEncodingFilter implements Filter {
  
    //定义成员变量.  
    private String encoding;  
  
    /** 
     * 过滤器初始化时候调用. 
     * 我们在初始化的时候调用 
     * 从web.xml中读取配置文件 读取encoding数据. 
     */  
    @Override  
    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding = filterConfig.getInitParameter("encoding");  
    }  
    
      
    /** 
     * 过滤器真正执行的处理功能. 
     */  
    @Override  
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        //设置字符集.  
        request.setCharacterEncoding(encoding);  
        response.setCharacterEncoding(encoding);

        //拿到链条继续向下调用.  
         chain.doFilter(request, response); 
    } 
    
    //销毁.  
    @Override  
    public void destroy() {  
    }  
  
}

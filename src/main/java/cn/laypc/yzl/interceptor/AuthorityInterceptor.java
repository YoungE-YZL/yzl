package cn.laypc.yzl.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 * @time 2020/2/5 11:50
 */
@Component
public class AuthorityInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取Httpsession对象
		String url = request.getRequestURL().toString();
		System.err.println(url);
		url = url.replace("//","");
		url = url.substring(url.indexOf('/')+1);
		HttpSession session = request.getSession();
		//判断session中是否有登录信息
		if(session.getAttribute("uid") == null) {
			//没有登录信息,则重定向到登录页
			response.sendRedirect("/login.html");
			//执行拦截
			return false;
		}

		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

}

package cn.laypc.yzl.config;


import cn.laypc.yzl.interceptor.AuthorityInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * SpringBoot配置拦截器
 * @time 2020/2/5 11:50
 */
@Configuration
public class InterceptorConfigurer implements WebMvcConfigurer{
	@Autowired
	private AuthorityInterceptor loginInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration addInterceptor =
				registry.addInterceptor(loginInterceptor);
		List<String> patterns = new ArrayList<>();

		patterns.add("/");
		patterns.add("/css/**");
		patterns.add("/img/**");
		patterns.add("/js/**");
		patterns.add("/layui/**/**");

		patterns.add("/login.html");
		patterns.add("/reg.html");
		patterns.add("/index.html");

		addInterceptor.addPathPatterns("/**").excludePathPatterns(patterns);
	}



}


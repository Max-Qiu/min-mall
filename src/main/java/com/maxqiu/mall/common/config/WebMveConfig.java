package com.maxqiu.mall.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.maxqiu.mall.common.interceptor.CorsInterceptor;

/**
 * Web配置
 *
 * @author Max_Qiu
 */
@Configuration
public class WebMveConfig implements WebMvcConfigurer {
    @Autowired
    private CorsInterceptor corsInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 跨域拦截器（放在最上面）
        registry.addInterceptor(corsInterceptor).addPathPatterns("/**");
    }
}

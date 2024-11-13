package com.jingfu.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    //表示根应用上下文的配置类
    //表示没有根配置类（即不需要全局非 Web 配置）

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }
    /*
            表示 MvcConfig 类是 Servlet 上下文的配置类。
MvcConfig 类应该包含 Spring MVC 的相关配置（例如启用注解驱动的控制器、视图解析等），即定义与 Web 应用有关的 Bean。

              */

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

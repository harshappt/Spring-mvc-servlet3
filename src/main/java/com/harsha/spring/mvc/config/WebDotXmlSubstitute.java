package com.harsha.spring.mvc.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class WebDotXmlSubstitute extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}

	
	@Override
	protected WebApplicationContext createServletApplicationContext(){
		AnnotationConfigWebApplicationContext awac = new AnnotationConfigWebApplicationContext();
		awac.setConfigLocation("com.harsha.spring.mvc.config.DispatcherServletSubstitute");
		return awac;
	}


	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}

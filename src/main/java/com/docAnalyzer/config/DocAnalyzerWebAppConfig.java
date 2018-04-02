package com.docAnalyzer.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DocAnalyzerWebAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}
	
	/**
	@Override
	protected Filter[] getServletFilters() {
	return new Filter[] { new MyFilter() };
	}
	*/
	
	@Override
	protected void customizeRegistration(Dynamic registration) 
	{
		registration.setMultipartConfig(
				new MultipartConfigElement("/tmp/spittr/uploads",
				2097152, 4194304, 0));
	}
}

package com.docAnalyzer.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Used when deploying to a servlet 3.0 specification. 
 * Alternatively override AbstractAnnotationConfigDispatcherServletInitializer getServletFilters method
 * @author oonyimadu
 *
 */
public class MyFilterInitialization implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
	throws ServletException 
	{
	javax.servlet.FilterRegistration.Dynamic filter =
	servletContext.addFilter("myFilter", MyFilter.class);
	filter.addMappingForUrlPatterns(null, false, "/custom/*");
	}
}
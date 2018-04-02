package com.docAnalyzer.services;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SearchQueryObject 
{
	@NotNull
	@Size(min=5, message="{queryTerm.size}")
	private String queryTerm;
	private String queryType;
	
	public String getQueryTerm() {
		return queryTerm;
	}
	public void setQueryTerm(String queryTerm) {
		this.queryTerm = queryTerm;
	}
	public String getQueryType() {
		return queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	
	
	
}

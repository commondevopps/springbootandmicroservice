package com.org.compnay.apizuul.netflixzuulapigatewayserver.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


@Component
public class ZuulLoggingFilter extends ZuulFilter	{
	private static final Logger LOGGER = LogManager.getLogger(ZuulLoggingFilter.class);

	@Override
	public boolean shouldFilter() {
		//should this filer be executed on not
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// original logic of the filter
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();
		LOGGER.info("request {} RequestURL {}",request,request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
	//when should be filtering happens.i.e. pre ,post, error
		return "pre";
	}

	@Override
	public int filterOrder() {
		//order of filter execution in case of multiple filter
		return 1;
	}

}

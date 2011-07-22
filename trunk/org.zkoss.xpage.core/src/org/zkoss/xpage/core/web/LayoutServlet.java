/* 
{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		July 13, 2011 , Created by dennischen
}}IS_NOTE

Copyright (C) 2010 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.xpage.core.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.zkoss.xpage.core.util.Log;
import org.zkoss.zk.ui.http.DHtmlLayoutServlet;
/**
 * wrap {@link DHtmlLayoutServlet}
 * @author Dennis Chen
 *
 */
public class LayoutServlet extends DHtmlLayoutServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(final ServletConfig config) throws ServletException {
		Log.log(this,"init::" + this+",context = "+config.getServletContext());
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		try {
			Thread.currentThread().setContextClassLoader(LayoutServlet.class.getClassLoader());
			super.init(config);
		}catch(Exception x){
			Log.error(this,x.getMessage(),x);
			throw new ServletException(x.getMessage(),x);
		}finally{
			Thread.currentThread().setContextClassLoader(cl);
		}
		Log.log(this,"init end::" + this);
	}

}

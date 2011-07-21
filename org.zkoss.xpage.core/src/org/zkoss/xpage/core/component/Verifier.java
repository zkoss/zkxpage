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
package org.zkoss.xpage.core.component;

import org.zkoss.xpage.core.Constants;


public class Verifier extends ZKComponentBase {
	private static final long serialVersionUID = 1L;

	public Verifier() {
		super();
		setRendererType("org.zkoss.xpage.verifier");
	}

	@Override
	public String getFamily() {
		return Constants.COMPONENT_FAMILY;
	}

}
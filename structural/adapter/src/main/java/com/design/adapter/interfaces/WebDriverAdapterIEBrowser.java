package com.design.adapter.interfaces;

import com.design.adapter.object.ie.IEBrowser;
/**
 * 
 * @author nurzamanindra
 * adapter class for IE Browser
 *
 */
public class WebDriverAdapterIEBrowser implements WebDriver {

	IEBrowser ie;
	
	public WebDriverAdapterIEBrowser(IEBrowser ie) {
		this.ie = ie;
	}
	
	public void getElement() {
		// TODO Auto-generated method stub
		ie.IEFindElement();
		
	}

	public void selectElement() {
		// TODO Auto-generated method stub
		ie.IEClick();
		
	}

}

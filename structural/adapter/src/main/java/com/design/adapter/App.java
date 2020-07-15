package com.design.adapter;

import com.design.adapter.interfaces.WebDriverAdapterIEBrowser;
import com.design.adapter.object.chrome.ChromeBrowser;
import com.design.adapter.object.ie.IEBrowser;


public class App 
{
    public static void main( String[] args )
    {
    	ChromeBrowser cb = new ChromeBrowser();
    	cb.getElement();
    	cb.selectElement();
    	
    	IEBrowser ie = new IEBrowser();
    	ie.IEClick();
    	ie.IEFindElement();
    	
   //======adapter for plain IE Browser class============== 	
    	WebDriverAdapterIEBrowser w = new WebDriverAdapterIEBrowser(ie);
    	w.selectElement();
    	w.getElement();
    }
}

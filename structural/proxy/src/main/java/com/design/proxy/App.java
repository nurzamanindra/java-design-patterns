package com.design.proxy;

import com.design.proxy.intefaces.Image;
import com.design.proxy.object.RealImage;
import com.design.proxy.proxy.ImageProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String name = "hansel_image.jpg";

    	System.out.println("======load without proxy========\n");
    	Image img = new RealImage(name);
    	img.Display();
    	
    	ImageProxy imgProxy = new ImageProxy(name);
    	imgProxy.Display();
    }
}

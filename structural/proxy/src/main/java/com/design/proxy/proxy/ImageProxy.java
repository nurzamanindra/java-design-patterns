package com.design.proxy.proxy;

import com.design.proxy.intefaces.Image;
import com.design.proxy.object.RealImage;

public class ImageProxy implements Image{

	private String fileName;
	private RealImage img ;
	
	public ImageProxy(String filename) {
		this.fileName=filename;
	}

	public void Display() {
		
		System.out.println("\n=========This image is running via Proxy class===========\n");
		if(img == null) {
			img = new RealImage(this.fileName);
		}
		img.Display();
		img.Edit();
		
	}
	
	
}

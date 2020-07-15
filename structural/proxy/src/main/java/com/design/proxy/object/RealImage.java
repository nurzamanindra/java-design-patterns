package com.design.proxy.object;

import com.design.proxy.intefaces.Image;

public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String name) {
		this.fileName = name;
		loadFromDisk();
	}

	public void Display() {

		System.out.println("Displaying image --> "+ this.fileName);
	}
	
	public void Edit() {
		String editName = this.fileName.split("\\.")[0] + "_edited_version.jpg";
		System.out.println("Editing the image");
		System.out.println("change the file name to "+editName );
		this.fileName = editName;
	}
	
	private void loadFromDisk() {
		System.out.println("Loading image from hard disk --> "+ this.fileName);
	}

}

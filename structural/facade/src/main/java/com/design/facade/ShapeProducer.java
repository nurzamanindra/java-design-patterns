package com.design.facade;

import com.design.facade.interfaces.Shape;
import com.design.facade.object.Rectangle;
import com.design.facade.object.Square;
import com.design.facade.object.Triangle;

public class ShapeProducer {
	private Shape square;
	private Shape rectangle;
	private Shape triangle;

	public ShapeProducer() {
		square = new Square();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}
	
	public void drawSquare() {
		square.PrintShape();
		square.Draw();
	}
	
	public void drawRectangle() {
		rectangle.PrintShape();
		rectangle.Draw();
	}
	
	public void drawTriangle() {
		triangle.PrintShape();
		triangle.Draw();
	}
}

package com.design.facade;


public class App 
{
    public static void main( String[] args )
    {
    	ShapeProducer sp = new ShapeProducer();
    	
    	sp.drawRectangle();
    	System.out.println("\n=========================\n");
    	sp.drawSquare();
    	System.out.println("\n=========================\n");
    	sp.drawTriangle();
    }
}

package com.training.domains;

import com.training.ifaces.*;

public class ShowRoom {
	public Automobile getItem(int key) {
		switch (key) {
		case 1:
			return new PassengerCar();
			
		case 2:
			return new LuxuryCar();
			
		case 3:
			return new SportsCar();
			
		default:
			return null;
			
		}
	}
	/**
	 * 
	 * @param polyAuto takes the Object of Automobiles
	 * Method prints the quotation of the Product Selected
	 */
	public void printQuote(Automobile polyAuto) {
		System.out.println("~~~~Quotation~~~~");
		System.out.println("Model:"+polyAuto.getModel());
		System.out.println("Color:"+polyAuto.getColor());
		System.out.println("Price:"+polyAuto.getPrice());
	}
}

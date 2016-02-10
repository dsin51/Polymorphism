package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxuryCar implements Automobile {

	@Override
	public String getColor() {
		return "black";
	}

	@Override
	public double getPrice() {
		return 800000.00;
	}

	@Override
	public String getModel() {
		return "WagonR";
	}

}

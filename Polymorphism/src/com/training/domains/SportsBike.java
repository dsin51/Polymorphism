package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black/White";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000.00;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "KSpeed";
	}

}

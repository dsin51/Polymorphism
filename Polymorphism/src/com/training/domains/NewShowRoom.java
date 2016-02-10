package com.training.domains;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom{
	@Override
	public Automobile getItem(int key) {
		if(key == 4) {
			return new SportsBike();
		}
		else return super.getItem(key);
	}

}

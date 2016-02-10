package com.training.testcases;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.domains.LuxuryCar;
import com.training.domains.NewShowRoom;
import com.training.domains.PassengerCar;
import com.training.domains.SportsBike;
import com.training.domains.SportsCar;
import com.training.ifaces.Automobile;


@RunWith(Parameterized.class)
public class ShowRoomDefaultCaseTest {

	NewShowRoom newShowRoom = null;
	private int key;
	
	
	public ShowRoomDefaultCaseTest(int key) {
		super();
		this.key = key;
	}

	@Before
	public void setUp() throws Exception {
		newShowRoom = new NewShowRoom();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{5},{6},{12}};
		return Arrays.asList(data);
	}

	@Test
	public void testDefaultCase() {
		Automobile auto = newShowRoom.getItem(key);
		assertNull(auto);
		
	}

}

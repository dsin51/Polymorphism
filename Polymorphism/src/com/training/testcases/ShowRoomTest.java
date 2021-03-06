package com.training.testcases;

import com.training.ifaces.*;
import com.training.domains.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.training.domains.ShowRoom;

@RunWith(Parameterized.class)
public class ShowRoomTest {

	NewShowRoom newShowRoom = null;
	private int key;
	private Class cls;
	
	public ShowRoomTest(int key, Class cls) {
		super();
		this.key = key;
		this.cls = cls;
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
		Object[][] data = new Object[][]{{1,PassengerCar.class},{2,LuxuryCar.class},
												{3,SportsCar.class},{4,SportsBike.class}};
		return Arrays.asList(data);
	}
	
	@Test
	public void testValidCases() {
		//showRoom.getItem(key);
		Automobile auto = newShowRoom.getItem(key);
		
//		assertTrue(auto instanceof Automobile);
		
		assertEquals(cls, auto.getClass());
		
	}
	
	

}

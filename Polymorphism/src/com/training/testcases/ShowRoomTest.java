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

	ShowRoom showRoom = null;
	private int key;
	private Class cls;
	
	public ShowRoomTest(int key, Class cls) {
		super();
		this.key = key;
		this.cls = cls;
	}
	
	

	public ShowRoomTest(int key) {
		super();
		this.key = key;
	}



	@Before
	public void setUp() throws Exception {
		showRoom = new ShowRoom();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{{1,PassengerCar.class},{2,LuxuryCar.class},{3,SportsCar.class}};
		return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		showRoom.getItem(key);
		Automobile auto = showRoom.getItem(key);
		
//		assertTrue(auto instanceof Automobile);
		
		assertEquals(cls, auto.getClass());
		
	}
	
	

}

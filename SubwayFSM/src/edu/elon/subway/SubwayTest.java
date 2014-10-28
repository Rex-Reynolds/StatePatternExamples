package edu.elon.subway;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubwayTest {
	private Subway subway;

	@Before
	public void setUp() throws Exception {
		subway = new Subway();
	}

	@After
	public void tearDown() throws Exception {
		subway = null;
	}

	@Test
	public void testInsertQuarter() {
		subway.instertQuarter();
		assertEquals(subway.getUnlockedState(), subway.getState().toString());

	}

	@Test
	public void testPassThrough() {
		subway.instertQuarter();
		subway.passThrough();
		assertEquals("LOCKED", subway.getState().toString());

	}

}

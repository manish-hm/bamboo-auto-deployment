package com.ascend.nasm.CustomUtility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DBConnectTest {

	private DBConnect connect = null;
	
	private String[] dbNames = {"PSI", "Brightlink", "ACTON", "Dummy"};
	
	@Before
	public void setUp() {
		connect = new DBConnect();
		System.out.println("Pre Processing Done!!");
	}
	
	@Test
	public void testDBConnectionWithPSI() throws SQLException {
		boolean connected = connect.getConnections(dbNames[0]);
		assertTrue("Database Connected!!", connected);
	}
	
	@Test
	public void testDBConnectionWithBrightlink() throws SQLException {
		boolean connected = connect.getConnections(dbNames[1]);
		assertTrue("Database Connected!!", connected);
	}
	
	@Test
	public void testDBConnectionWithACTON() throws SQLException {
		boolean connected = connect.getConnections(dbNames[2]);
		assertTrue("Database Connected!!", connected);
	}
	
	@Test
	public void testDBConnectionWithDummy() throws SQLException {
		boolean connected = connect.getConnections(dbNames[3]);
		assertFalse("Database Connected!!", connected);
	}
	
	@After
	public void tearDown() {
		System.out.println("Resource released!!");
	}	
}
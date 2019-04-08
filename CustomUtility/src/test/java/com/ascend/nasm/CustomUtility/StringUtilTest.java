package com.ascend.nasm.CustomUtility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {

	private StringUtil util = null;
	
	private String value = "Ascend Learning LLC.";
	
	@Before
	public void setUp() {
		util = new StringUtil();
	}
	
	@Test
	public void testGetIndexValue() {
		int index = util.getIndexValue("A", value);
		assertEquals(0, index);
	}
	
	
	@Test
	public void testGetSubString() {
		String val = util.getSubString(7, value);
		assertEquals("Learning LLC.", val);
	}	
}

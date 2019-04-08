package com.ascend.nasm.CustomUtility;

public class StringUtil {

	public StringUtil() {}
	
	public int getIndexValue(String character, String value) {
		return value.indexOf(character);
	}
	
	public String getSubString(int index, String value) {
		return value.substring(index);
	}	
}

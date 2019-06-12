package com.unittestdemo;

public class Demo01 {

	public boolean test1(String str1, String str2) {
		boolean flag = false;
		if(new String(str1).equals(new String(str2))) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	
	public boolean test2(String str1, String str2) {
		boolean flag = false;
		if(new String(str1)==new String(str2)) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
}

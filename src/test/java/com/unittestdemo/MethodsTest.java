package com.unittestdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.unittestdemo.Demo01;

public class MethodsTest {
	
  @Test
  public void method1() {
	  Demo01 d1 = new Demo01();
	 boolean flag = d1.test1("remote", "remote");
	 System.out.println("Method1 flag : "+flag);
  }
  
  @Test
  public void method2() {
	  Demo01 d1 = new Demo01();
	  boolean flag = d1.test2("equals", "equals");
	  System.out.println("Method2 flag : "+flag);
  }
}

package com.github.repository;

import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;

public class ProjectTest extends Baseclass {
	
	@Test
	public void createCustomerTest() {
		System.out.println("execute create customer");
	}
	@Test
  public void  modifyCustomerTest() {
		System.out.println("Execute modify customer");
	}
	@Test
	public void deleteCustomerTest () {
		System.out.println("execute Delete Customer");
		
	}

}

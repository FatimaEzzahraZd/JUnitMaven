package com.inti.formation.testService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inti.formation.service.CalculatriceService;

public class CalculatriceServiceTest {
	
	
	@Test
	public void additionTest(){
		CalculatriceService calService = new CalculatriceService();
		int a = 5;
		int b = 6;
		int result = calService.addition(a, b);
		assertEquals(11, result);
	}

}

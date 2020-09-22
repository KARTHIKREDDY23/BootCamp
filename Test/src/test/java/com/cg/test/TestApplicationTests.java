package com.cg.test;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.test.service.TestService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class TestCases 
{
	@Autowired
	TestService testService;

	Test test;
	@Test
	public void insertTest_Positive(){
		test = null;
		String str = testService.insertTest(test);

		Assertions.assertEquals("Test added successfully",str);
	}

	@Test
	public void insertTest_Negative(){
		test=null;
		String str = testService.insertTest(test);
		assertEquals("Invalid ID",str);
	}

	@Test
	public void deleteTest_Positive(){
		String str = testService.deleteTest(101);
		Assertions.assertEquals("test removed",str);
	}

	@Test
	public void deleteTest_Negative(){
		String str = testService.deleteTest(101);
		Assertions.assertEquals("Invalid ID",str);
	}

}


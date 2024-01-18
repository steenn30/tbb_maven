package com.tbb;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TbbApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(TbbApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("this is test case");
		assertEquals(true,true);
	
	}

}

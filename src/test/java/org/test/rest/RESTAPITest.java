package org.test.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.test.mobile.AppiumTest;
import org.testng.annotations.Test;

public class RESTAPITest {
	
	private static Logger log = LogManager.getLogger(RESTAPITest.class.getName());
	
	@Test
	public void testJIRA() {
		log.info("info Test JIRA");
		System.out.println("Test JIRA");
		log.debug("debug Test JIRA");
	}
	
	@Test
	public void testTwitter() {
		log.info("Test Twitter");
		System.out.println("Test Twitter");
	}

}

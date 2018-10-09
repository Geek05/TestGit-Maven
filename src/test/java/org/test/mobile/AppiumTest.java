package org.test.mobile;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class AppiumTest {
	
	private static Logger log = LogManager.getLogger(AppiumTest.class.getName());
	
	@Test
	public void testAndroid() {
		log.info("Test Android");
		System.out.println("Test Android");
		
		log.debug("Test Android - Debugging");		
	}
	
	@Test
	public void testIOS() {
		System.out.println("Test IOS");
		
		log.error("Test IOS - Error");
	}

	@Test
	public void testNewOS() {
		System.out.println("Test NewOS");
		
		log.fatal("testNewOS - fatal");
	}

}

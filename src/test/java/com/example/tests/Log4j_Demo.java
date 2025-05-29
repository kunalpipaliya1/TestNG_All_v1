package com.example.tests;
import org.apache.logging.log4j.*;

public class Log4j_Demo {
	public static void main(String[] args) {
		
		// create logger for object
		Logger log = LogManager.getLogger("Log4j_Demo");
		
		// Error level: https://logging.apache.org/log4j/2.x/manual/customloglevels.html
		System.out.println("This is logger demo");
		log.info("For Info Only");
		log.debug("This is debug");
		log.error("Error message");
		log.warn("This is warning");
		log.fatal("This is fatal");
		
		
	}

}

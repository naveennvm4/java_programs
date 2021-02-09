package com.javapractice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       String message = "Hello world";
       LOG.debug(message + "Will be Printed on debug");
       LOG.info(message + "Will be Printed on info");
       LOG.warn(message + "Will be Printed on warn");
       LOG.error(message + "Will be Printed on error");
       LOG.fatal(message + "Will be Printed on fatal");
       LOG.info("Appending String: {}.", message);
       System.out.println(message);
    }
}

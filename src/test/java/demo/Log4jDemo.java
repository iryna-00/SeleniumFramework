package demo;
import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

    private static Logger logger = LogManager.getLogger(Log4jDemo.class);

    public static void main(String[] args) {

        System.out.println("\n Hello World...! \n");

        logger.trace("This is trace");
        logger.info("Test message");
        logger.error("Error message");
        logger.warn("warning message");
        logger.fatal("Fatal message");

        System.out.println("Completed");

    }
}

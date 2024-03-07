package my.home.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;

public class ExcMain {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void main(String[] args)  {
        ExcExample excExample = new ExcExample();

        try {
            System.out.println(excExample.parseFormatFrance("fd"));
        } catch (ParseException e) {
            logger.error(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}

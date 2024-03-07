package my.home.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;


public class ExcExample {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public double parseFormatFrance(String numberStr) {

        logger.info("Hello, World!");

        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        double numFrance = 0;
        try {
            numFrance = format.parse(numberStr).doubleValue();
        } catch (ParseException e) {
            logger.error(e.getMessage());
        }
        return numFrance;
    }
}

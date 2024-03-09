package my.home.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;

public class ExcMain {
    private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void main(String[] args) {

        test(-5);

//        ExcExample excExample = new ExcExample();
//
//        try {
//            System.out.println(excExample.parseFormatFrance("fd"));
//        } catch (ParseException e) {
//            logger.error(e.getMessage());
//            throw new RuntimeException(e);
//        }
    }


    public static void test(int t) {
        assert (t > 0) : "Некорректное значение" + t;
        System.out.println("t: " + t);
    }
}

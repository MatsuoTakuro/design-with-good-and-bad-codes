package Ch5;

import java.util.logging.Level;

public class Common {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Common.class.getName());

    public static void report(String message) {
        logger.log(Level.INFO, message);
    }
}

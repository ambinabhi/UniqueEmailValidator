import java.util.logging.Logger;

public class LogUtil {

    static Logger logger = Logger.getLogger(LogUtil.class.getName());

    public static void printMessage(String message){
        logger.info(message);
    }

}

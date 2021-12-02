package cn.lidong.logtest.b;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author caolidong
 * @date 2021/12/2
 */
public class B {
    static Logger logger = LogManager.getLogger(B.class);
    public static void print(){
        logger.trace("Btrace");
        logger.debug("Bdebug");
        logger.info("Binfo");
        logger.warn("Bwarn");
        logger.error("Berror");
        logger.fatal("Bfatal");
    }
}

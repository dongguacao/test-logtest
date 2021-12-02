package cn.lidong.logtest.c;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author caolidong
 * @date 2021/12/2
 */
public class C {
    static Logger logger = LogManager.getLogger(C.class);

    public static void print() {
        logger.trace("Ctrace");
        logger.debug("Cdebug");
        logger.info("Cinfo");
        logger.warn("Cwarn");
        logger.error("Cerror");
        logger.fatal("Cfatal");
    }
}

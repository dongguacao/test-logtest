package cn.lidong2.a;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author caolidong
 * @date 2021/12/2
 */
public class A {
    static Logger logger = LogManager.getLogger(A.class);
    public static void print(){
        logger.trace("Atrace");
        logger.debug("Adebug");
        logger.info("Ainfo");
        logger.warn("Awarn");
        logger.error("Aerror");
        logger.fatal("Afatal");
    }
}

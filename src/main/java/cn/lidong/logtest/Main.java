package cn.lidong.logtest;

import cn.lidong2.a.A;
import cn.lidong.logtest.b.B;
import cn.lidong.logtest.c.C;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author caolidong
 * @date 2021/12/2
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Logger logger = LogManager.getLogger(Main.class);

        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");

        A.print();
        B.print();
        C.print();

        Thread.sleep(1000L);
    }
}

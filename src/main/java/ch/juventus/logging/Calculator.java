package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int s1, int s2) {

        logger.trace("add called {} {}", s1, s2);
        logger.debug("add called ");
        return s1 + s2;
    }

    public double div(int d1, int d2) {
        return d1 / d2;
    }
}

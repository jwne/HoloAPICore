package com.dsh105.holoapi.util;

import com.dsh105.holoapi.references.Reference;
import com.google.common.base.Preconditions;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class ModLogger {

    private static Logger delegate;

    public ModLogger(Logger delegate) {
        Preconditions.checkNotNull(delegate, "Delegate can't be NULL!");

        this.delegate = delegate;
    }

    public static Logger delegate() {
        return delegate;
    }

    public static void log(Level logLevel, Object message) {
        delegate().log(logLevel, Reference.MOD_NAME, String.valueOf(message));
    }

    public static void all(Object object) {
        log(Level.ALL, object);
    }

    public static void debug(Object object) {
        log(Level.DEBUG, object);
    }

    public static void error(Object object) {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object) {
        log(Level.FATAL, object);
    }

    public static void info(Object object) {
        log(Level.INFO, object);
    }

    public static void off(Object object) {
        log(Level.OFF, object);
    }

    public static void trace(Object object) {
        log(Level.TRACE, object);
    }

    public static void warn(Object object) {
        log(Level.WARN, object);
    }
}


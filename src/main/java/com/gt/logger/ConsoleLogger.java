package com.gt.logger;

import java.io.PrintStream;

public class ConsoleLogger implements Logger {
    private final PrintStream printStream;
    private final LoggingLevel loggingLevel;

    public ConsoleLogger(PrintStream printStream, LoggingLevel loggingLevel) {
        this.printStream = printStream;
        this.loggingLevel = loggingLevel;
    }

    @Override
    public void info(String message) {
        if (loggingLevel.getLevel() <= LoggingLevel.INFO.getLevel()) {
            printStream.print(message);
        }
    }

    @Override
    public void debug(String message) {
        if (loggingLevel.getLevel() <= LoggingLevel.DEBUG.getLevel()) {
            printStream.print(message);
        }
    }

    @Override
    public void warn(String message) {
        printStream.print(message);
    }

    @Override
    public void error(String message) {
        printStream.print(message);
    }
}

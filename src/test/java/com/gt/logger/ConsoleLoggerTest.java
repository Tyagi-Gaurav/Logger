package com.gt.logger;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsoleLoggerTest {
    @Nested
    class LogLevelInfo {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        private final PrintStream printStream = new PrintStream(out);
        Logger logger = new ConsoleLogger(printStream, LoggingLevel.INFO);
        @Test
        void logInfoToConsoleLogger() {
            logger.info("Hello World");
            assertEquals("Hello World", out.toString());
        }

        @Test
        void logDebugToConsoleLogger() {
            logger.debug("Hello World");
            assertEquals("", out.toString());
        }

        @Test
        void logWarnToConsoleLogger() {
            logger.warn("Hello World");
            assertEquals("Hello World", out.toString());
        }

        @Test
        void logErrorToConsoleLogger() {
            logger.error("Hello World");
            assertEquals("Hello World", out.toString());
        }
    }

    @Nested
    class LogLevelDebug {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        private final PrintStream printStream = new PrintStream(out);
        Logger logger = new ConsoleLogger(printStream, LoggingLevel.DEBUG);
        @Test
        void logInfoToConsoleLogger() {
            logger.info("Hello World");
            assertEquals("Hello World", out.toString());
        }

        @Test
        void logDebugToConsoleLogger() {
            logger.debug("Hello World");
            assertEquals("Hello World", out.toString());
        }

        @Test
        void logWarnToConsoleLogger() {
            logger.warn("Hello World");
            assertEquals("Hello World", out.toString());
        }

        @Test
        void logErrorToConsoleLogger() {
            logger.error("Hello World");
            assertEquals("Hello World", out.toString());
        }
    }

    @Nested
    class LogLevelWarn {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        private final PrintStream printStream = new PrintStream(out);
        Logger logger = new ConsoleLogger(printStream, LoggingLevel.WARN);
        @Test
        void logInfoToConsoleLogger() {
            logger.info("Hello World");
            assertEquals("", out.toString());
        }

        @Test
        void logDebugToConsoleLogger() {
            logger.debug("Hello World");
            assertEquals("", out.toString());
        }

        @Test
        void logWarnToConsoleLogger() {
            logger.warn("Hello World");
            assertEquals("Hello World", out.toString());
        }

        @Test
        void logErrorToConsoleLogger() {
            logger.error("Hello World");
            assertEquals("Hello World", out.toString());
        }
    }

    @Nested
    class LogLevelError {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        private final PrintStream printStream = new PrintStream(out);
        Logger logger = new ConsoleLogger(printStream, LoggingLevel.ERROR);
        @Test
        void logInfoToConsoleLogger() {
            logger.info("Hello World");
            assertEquals("", out.toString());
        }

        @Test
        void logDebugToConsoleLogger() {
            logger.debug("Hello World");
            assertEquals("", out.toString());
        }

        @Test
        void logWarnToConsoleLogger() {
            logger.warn("Hello World");
            assertEquals("Hello World", out.toString());
        }

        @Test
        void logErrorToConsoleLogger() {
            logger.error("Hello World");
            assertEquals("Hello World", out.toString());
        }
    }
}

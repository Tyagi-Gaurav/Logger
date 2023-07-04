package com.gt.logger;

public enum LoggingLevel {
    DEBUG(1), INFO(2), WARN(3), ERROR(4);

    private final int level;

    LoggingLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

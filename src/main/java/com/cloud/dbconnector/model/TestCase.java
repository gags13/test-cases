package com.cloud.dbconnector.model;

public class TestCase {

    public final String id;
    public final long ts;
    public PlatformType platform;
    public enum PlatformType {
        DEFAULT,
        LEETCODE,
        HACKERRANK,
        ALGOEXPERT
    }

    public TestCase(String id, long ts) {
        this.id = id;
        this.ts = ts;
    }

    public long getTs() {
        return ts;
    }

    public PlatformType getPlatform() {
        return platform;
    }

    public void setPlatform(PlatformType platform) {
        this.platform = platform;
    }
}

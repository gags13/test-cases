package com.cloud.dbconnector.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "test-cases")
public class TestCase {

    @DynamoDBHashKey
    public final String id;
    @DynamoDBAttribute
    public final long ts;
    @DynamoDBAttribute
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

package com.cloud.dbconnector.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DDBConfig {
    public DynamoDBMapper buildMapper() {
        return new DynamoDBMapper(buildDynamoDB());
    }
    public AmazonDynamoDB buildDynamoDB() {
        return AmazonDynamoDBClientBuilder
                .standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(
                                "dynamodb.us-west-2.amazonaws.com",// read from ENV
                                "us-west-2" // read from ENV
                        )
                )
                .withCredentials(
                        new AWSStaticCredentialsProvider(
                                new BasicAWSCredentials(
                                        "",
                                        "",
                                        ""
                                )
                        )
                ).build();
    }
}

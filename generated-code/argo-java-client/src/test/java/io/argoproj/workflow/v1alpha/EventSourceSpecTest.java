/*
 * Argo Workflows API
 * Argo Workflows is an open source container-native workflow engine for orchestrating parallel jobs on Kubernetes. For more information, please see https://argoproj.github.io/argo-workflows/
 *
 * The version of the OpenAPI document: VERSION
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.v1alpha;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.v1alpha.AMQPEventSource;
import io.argoproj.workflow.v1alpha.AzureEventsHubEventSource;
import io.argoproj.workflow.v1alpha.BitbucketEventSource;
import io.argoproj.workflow.v1alpha.BitbucketServerEventSource;
import io.argoproj.workflow.v1alpha.CalendarEventSource;
import io.argoproj.workflow.v1alpha.EmitterEventSource;
import io.argoproj.workflow.v1alpha.FileEventSource;
import io.argoproj.workflow.v1alpha.GenericEventSource;
import io.argoproj.workflow.v1alpha.GithubEventSource;
import io.argoproj.workflow.v1alpha.GitlabEventSource;
import io.argoproj.workflow.v1alpha.HDFSEventSource;
import io.argoproj.workflow.v1alpha.KafkaEventSource;
import io.argoproj.workflow.v1alpha.MQTTEventSource;
import io.argoproj.workflow.v1alpha.NATSEventsSource;
import io.argoproj.workflow.v1alpha.NSQEventSource;
import io.argoproj.workflow.v1alpha.PubSubEventSource;
import io.argoproj.workflow.v1alpha.PulsarEventSource;
import io.argoproj.workflow.v1alpha.RedisEventSource;
import io.argoproj.workflow.v1alpha.RedisStreamEventSource;
import io.argoproj.workflow.v1alpha.ResourceEventSource;
import io.argoproj.workflow.v1alpha.S3Artifact;
import io.argoproj.workflow.v1alpha.SNSEventSource;
import io.argoproj.workflow.v1alpha.SQSEventSource;
import io.argoproj.workflow.v1alpha.Service;
import io.argoproj.workflow.v1alpha.SlackEventSource;
import io.argoproj.workflow.v1alpha.StorageGridEventSource;
import io.argoproj.workflow.v1alpha.StripeEventSource;
import io.argoproj.workflow.v1alpha.Template;
import io.argoproj.workflow.v1alpha.WebhookEventSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for EventSourceSpec
 */
public class EventSourceSpecTest {
    private final EventSourceSpec model = new EventSourceSpec();

    /**
     * Model tests for EventSourceSpec
     */
    @Test
    public void testEventSourceSpec() {
        // TODO: test EventSourceSpec
    }

    /**
     * Test the property 'amqp'
     */
    @Test
    public void amqpTest() {
        // TODO: test amqp
    }

    /**
     * Test the property 'azureEventsHub'
     */
    @Test
    public void azureEventsHubTest() {
        // TODO: test azureEventsHub
    }

    /**
     * Test the property 'bitbucket'
     */
    @Test
    public void bitbucketTest() {
        // TODO: test bitbucket
    }

    /**
     * Test the property 'bitbucketserver'
     */
    @Test
    public void bitbucketserverTest() {
        // TODO: test bitbucketserver
    }

    /**
     * Test the property 'calendar'
     */
    @Test
    public void calendarTest() {
        // TODO: test calendar
    }

    /**
     * Test the property 'emitter'
     */
    @Test
    public void emitterTest() {
        // TODO: test emitter
    }

    /**
     * Test the property 'eventBusName'
     */
    @Test
    public void eventBusNameTest() {
        // TODO: test eventBusName
    }

    /**
     * Test the property 'file'
     */
    @Test
    public void fileTest() {
        // TODO: test file
    }

    /**
     * Test the property 'generic'
     */
    @Test
    public void genericTest() {
        // TODO: test generic
    }

    /**
     * Test the property 'github'
     */
    @Test
    public void githubTest() {
        // TODO: test github
    }

    /**
     * Test the property 'gitlab'
     */
    @Test
    public void gitlabTest() {
        // TODO: test gitlab
    }

    /**
     * Test the property 'hdfs'
     */
    @Test
    public void hdfsTest() {
        // TODO: test hdfs
    }

    /**
     * Test the property 'kafka'
     */
    @Test
    public void kafkaTest() {
        // TODO: test kafka
    }

    /**
     * Test the property 'minio'
     */
    @Test
    public void minioTest() {
        // TODO: test minio
    }

    /**
     * Test the property 'mqtt'
     */
    @Test
    public void mqttTest() {
        // TODO: test mqtt
    }

    /**
     * Test the property 'nats'
     */
    @Test
    public void natsTest() {
        // TODO: test nats
    }

    /**
     * Test the property 'nsq'
     */
    @Test
    public void nsqTest() {
        // TODO: test nsq
    }

    /**
     * Test the property 'pubSub'
     */
    @Test
    public void pubSubTest() {
        // TODO: test pubSub
    }

    /**
     * Test the property 'pulsar'
     */
    @Test
    public void pulsarTest() {
        // TODO: test pulsar
    }

    /**
     * Test the property 'redis'
     */
    @Test
    public void redisTest() {
        // TODO: test redis
    }

    /**
     * Test the property 'redisStream'
     */
    @Test
    public void redisStreamTest() {
        // TODO: test redisStream
    }

    /**
     * Test the property 'replicas'
     */
    @Test
    public void replicasTest() {
        // TODO: test replicas
    }

    /**
     * Test the property 'resource'
     */
    @Test
    public void resourceTest() {
        // TODO: test resource
    }

    /**
     * Test the property 'service'
     */
    @Test
    public void serviceTest() {
        // TODO: test service
    }

    /**
     * Test the property 'slack'
     */
    @Test
    public void slackTest() {
        // TODO: test slack
    }

    /**
     * Test the property 'sns'
     */
    @Test
    public void snsTest() {
        // TODO: test sns
    }

    /**
     * Test the property 'sqs'
     */
    @Test
    public void sqsTest() {
        // TODO: test sqs
    }

    /**
     * Test the property 'storageGrid'
     */
    @Test
    public void storageGridTest() {
        // TODO: test storageGrid
    }

    /**
     * Test the property 'stripe'
     */
    @Test
    public void stripeTest() {
        // TODO: test stripe
    }

    /**
     * Test the property 'template'
     */
    @Test
    public void templateTest() {
        // TODO: test template
    }

    /**
     * Test the property 'webhook'
     */
    @Test
    public void webhookTest() {
        // TODO: test webhook
    }

}

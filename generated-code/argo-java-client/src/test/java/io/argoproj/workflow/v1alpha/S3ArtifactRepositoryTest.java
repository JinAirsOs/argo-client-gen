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
import io.argoproj.workflow.v1alpha.CreateS3BucketOptions;
import io.argoproj.workflow.v1alpha.S3EncryptionOptions;
import io.kubernetes.client.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for S3ArtifactRepository
 */
public class S3ArtifactRepositoryTest {
    private final S3ArtifactRepository model = new S3ArtifactRepository();

    /**
     * Model tests for S3ArtifactRepository
     */
    @Test
    public void testS3ArtifactRepository() {
        // TODO: test S3ArtifactRepository
    }

    /**
     * Test the property 'accessKeySecret'
     */
    @Test
    public void accessKeySecretTest() {
        // TODO: test accessKeySecret
    }

    /**
     * Test the property 'bucket'
     */
    @Test
    public void bucketTest() {
        // TODO: test bucket
    }

    /**
     * Test the property 'createBucketIfNotPresent'
     */
    @Test
    public void createBucketIfNotPresentTest() {
        // TODO: test createBucketIfNotPresent
    }

    /**
     * Test the property 'encryptionOptions'
     */
    @Test
    public void encryptionOptionsTest() {
        // TODO: test encryptionOptions
    }

    /**
     * Test the property 'endpoint'
     */
    @Test
    public void endpointTest() {
        // TODO: test endpoint
    }

    /**
     * Test the property 'insecure'
     */
    @Test
    public void insecureTest() {
        // TODO: test insecure
    }

    /**
     * Test the property 'keyFormat'
     */
    @Test
    public void keyFormatTest() {
        // TODO: test keyFormat
    }

    /**
     * Test the property 'keyPrefix'
     */
    @Test
    public void keyPrefixTest() {
        // TODO: test keyPrefix
    }

    /**
     * Test the property 'region'
     */
    @Test
    public void regionTest() {
        // TODO: test region
    }

    /**
     * Test the property 'roleARN'
     */
    @Test
    public void roleARNTest() {
        // TODO: test roleARN
    }

    /**
     * Test the property 'secretKeySecret'
     */
    @Test
    public void secretKeySecretTest() {
        // TODO: test secretKeySecret
    }

    /**
     * Test the property 'useSDKCreds'
     */
    @Test
    public void useSDKCredsTest() {
        // TODO: test useSDKCreds
    }

}

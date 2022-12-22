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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * GCSArtifactRepository defines the controller configuration for a GCS artifact repository
 */
@ApiModel(description = "GCSArtifactRepository defines the controller configuration for a GCS artifact repository")

public class GCSArtifactRepository {
  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_KEY_FORMAT = "keyFormat";
  @SerializedName(SERIALIZED_NAME_KEY_FORMAT)
  private String keyFormat;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_KEY_SECRET = "serviceAccountKeySecret";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_KEY_SECRET)
  private V1SecretKeySelector serviceAccountKeySecret;


  public GCSArtifactRepository bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Bucket is the name of the bucket
   * @return bucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bucket is the name of the bucket")

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public GCSArtifactRepository keyFormat(String keyFormat) {
    
    this.keyFormat = keyFormat;
    return this;
  }

   /**
   * KeyFormat is defines the format of how to store keys. Can reference workflow variables
   * @return keyFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KeyFormat is defines the format of how to store keys. Can reference workflow variables")

  public String getKeyFormat() {
    return keyFormat;
  }


  public void setKeyFormat(String keyFormat) {
    this.keyFormat = keyFormat;
  }


  public GCSArtifactRepository serviceAccountKeySecret(V1SecretKeySelector serviceAccountKeySecret) {
    
    this.serviceAccountKeySecret = serviceAccountKeySecret;
    return this;
  }

   /**
   * Get serviceAccountKeySecret
   * @return serviceAccountKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getServiceAccountKeySecret() {
    return serviceAccountKeySecret;
  }


  public void setServiceAccountKeySecret(V1SecretKeySelector serviceAccountKeySecret) {
    this.serviceAccountKeySecret = serviceAccountKeySecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GCSArtifactRepository ioArgoprojWorkflowV1alpha1GCSArtifactRepository = (GCSArtifactRepository) o;
    return Objects.equals(this.bucket, ioArgoprojWorkflowV1alpha1GCSArtifactRepository.bucket) &&
        Objects.equals(this.keyFormat, ioArgoprojWorkflowV1alpha1GCSArtifactRepository.keyFormat) &&
        Objects.equals(this.serviceAccountKeySecret, ioArgoprojWorkflowV1alpha1GCSArtifactRepository.serviceAccountKeySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, keyFormat, serviceAccountKeySecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GCSArtifactRepository {\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    keyFormat: ").append(toIndentedString(keyFormat)).append("\n");
    sb.append("    serviceAccountKeySecret: ").append(toIndentedString(serviceAccountKeySecret)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


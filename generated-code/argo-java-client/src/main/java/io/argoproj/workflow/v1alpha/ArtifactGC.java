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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.v1alpha.Metadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ArtifactGC describes how to delete artifacts from completed Workflows
 */
@ApiModel(description = "ArtifactGC describes how to delete artifacts from completed Workflows")

public class ArtifactGC {
  public static final String SERIALIZED_NAME_POD_METADATA = "podMetadata";
  @SerializedName(SERIALIZED_NAME_POD_METADATA)
  private Metadata podMetadata;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private String strategy;


  public ArtifactGC podMetadata(Metadata podMetadata) {
    
    this.podMetadata = podMetadata;
    return this;
  }

   /**
   * Get podMetadata
   * @return podMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metadata getPodMetadata() {
    return podMetadata;
  }


  public void setPodMetadata(Metadata podMetadata) {
    this.podMetadata = podMetadata;
  }


  public ArtifactGC serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName is an optional field for specifying the Service Account that should be assigned to the Pod doing the deletion
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccountName is an optional field for specifying the Service Account that should be assigned to the Pod doing the deletion")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public ArtifactGC strategy(String strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * Strategy is the strategy to use.
   * @return strategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Strategy is the strategy to use.")

  public String getStrategy() {
    return strategy;
  }


  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactGC ioArgoprojWorkflowV1alpha1ArtifactGC = (ArtifactGC) o;
    return Objects.equals(this.podMetadata, ioArgoprojWorkflowV1alpha1ArtifactGC.podMetadata) &&
        Objects.equals(this.serviceAccountName, ioArgoprojWorkflowV1alpha1ArtifactGC.serviceAccountName) &&
        Objects.equals(this.strategy, ioArgoprojWorkflowV1alpha1ArtifactGC.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podMetadata, serviceAccountName, strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactGC {\n");
    sb.append("    podMetadata: ").append(toIndentedString(podMetadata)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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


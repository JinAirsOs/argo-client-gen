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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ContainerSetRetryStrategy
 */

public class ContainerSetRetryStrategy {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private String retries;


  public ContainerSetRetryStrategy duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration is the time between each retry, examples values are \&quot;300ms\&quot;, \&quot;1s\&quot; or \&quot;5m\&quot;. Valid time units are \&quot;ns\&quot;, \&quot;us\&quot; (or \&quot;µs\&quot;), \&quot;ms\&quot;, \&quot;s\&quot;, \&quot;m\&quot;, \&quot;h\&quot;.
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Duration is the time between each retry, examples values are \"300ms\", \"1s\" or \"5m\". Valid time units are \"ns\", \"us\" (or \"µs\"), \"ms\", \"s\", \"m\", \"h\".")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public ContainerSetRetryStrategy retries(String retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @ApiModelProperty(required = true, value = "")

  public String getRetries() {
    return retries;
  }


  public void setRetries(String retries) {
    this.retries = retries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSetRetryStrategy ioArgoprojWorkflowV1alpha1ContainerSetRetryStrategy = (ContainerSetRetryStrategy) o;
    return Objects.equals(this.duration, ioArgoprojWorkflowV1alpha1ContainerSetRetryStrategy.duration) &&
        Objects.equals(this.retries, ioArgoprojWorkflowV1alpha1ContainerSetRetryStrategy.retries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, retries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSetRetryStrategy {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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


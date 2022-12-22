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
import io.argoproj.workflow.v1alpha.AbstractVolumeSource;
import io.argoproj.workflow.v1alpha.Duration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VolumeSource
 */

public class VolumeSource {
  public static final String SERIALIZED_NAME_ABSTRACT_VOLUME_SOURCE = "abstractVolumeSource";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_VOLUME_SOURCE)
  private AbstractVolumeSource abstractVolumeSource;

  public static final String SERIALIZED_NAME_CONCURRENCY = "concurrency";
  @SerializedName(SERIALIZED_NAME_CONCURRENCY)
  private Integer concurrency;

  public static final String SERIALIZED_NAME_POLL_PERIOD = "pollPeriod";
  @SerializedName(SERIALIZED_NAME_POLL_PERIOD)
  private Duration pollPeriod;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;


  public VolumeSource abstractVolumeSource(AbstractVolumeSource abstractVolumeSource) {
    
    this.abstractVolumeSource = abstractVolumeSource;
    return this;
  }

   /**
   * Get abstractVolumeSource
   * @return abstractVolumeSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbstractVolumeSource getAbstractVolumeSource() {
    return abstractVolumeSource;
  }


  public void setAbstractVolumeSource(AbstractVolumeSource abstractVolumeSource) {
    this.abstractVolumeSource = abstractVolumeSource;
  }


  public VolumeSource concurrency(Integer concurrency) {
    
    this.concurrency = concurrency;
    return this;
  }

   /**
   * Get concurrency
   * @return concurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getConcurrency() {
    return concurrency;
  }


  public void setConcurrency(Integer concurrency) {
    this.concurrency = concurrency;
  }


  public VolumeSource pollPeriod(Duration pollPeriod) {
    
    this.pollPeriod = pollPeriod;
    return this;
  }

   /**
   * Get pollPeriod
   * @return pollPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Duration getPollPeriod() {
    return pollPeriod;
  }


  public void setPollPeriod(Duration pollPeriod) {
    this.pollPeriod = pollPeriod;
  }


  public VolumeSource readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeSource githubComArgoprojLabsArgoDataflowApiV1alpha1VolumeSource = (VolumeSource) o;
    return Objects.equals(this.abstractVolumeSource, githubComArgoprojLabsArgoDataflowApiV1alpha1VolumeSource.abstractVolumeSource) &&
        Objects.equals(this.concurrency, githubComArgoprojLabsArgoDataflowApiV1alpha1VolumeSource.concurrency) &&
        Objects.equals(this.pollPeriod, githubComArgoprojLabsArgoDataflowApiV1alpha1VolumeSource.pollPeriod) &&
        Objects.equals(this.readOnly, githubComArgoprojLabsArgoDataflowApiV1alpha1VolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractVolumeSource, concurrency, pollPeriod, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeSource {\n");
    sb.append("    abstractVolumeSource: ").append(toIndentedString(abstractVolumeSource)).append("\n");
    sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
    sb.append("    pollPeriod: ").append(toIndentedString(pollPeriod)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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


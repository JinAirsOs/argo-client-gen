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
 * Sequence expands a workflow step into numeric range
 */
@ApiModel(description = "Sequence expands a workflow step into numeric range")

public class Sequence {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;


  public Sequence count(String count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCount() {
    return count;
  }


  public void setCount(String count) {
    this.count = count;
  }


  public Sequence end(String end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnd() {
    return end;
  }


  public void setEnd(String end) {
    this.end = end;
  }


  public Sequence format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Format is a printf format string to format the value in the sequence
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Format is a printf format string to format the value in the sequence")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public Sequence start(String start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sequence ioArgoprojWorkflowV1alpha1Sequence = (Sequence) o;
    return Objects.equals(this.count, ioArgoprojWorkflowV1alpha1Sequence.count) &&
        Objects.equals(this.end, ioArgoprojWorkflowV1alpha1Sequence.end) &&
        Objects.equals(this.format, ioArgoprojWorkflowV1alpha1Sequence.format) &&
        Objects.equals(this.start, ioArgoprojWorkflowV1alpha1Sequence.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, end, format, start);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sequence {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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


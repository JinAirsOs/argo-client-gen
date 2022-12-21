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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StatusPolicy
 */

public class StatusPolicy {
  public static final String SERIALIZED_NAME_ALLOW = "allow";
  @SerializedName(SERIALIZED_NAME_ALLOW)
  private List<Integer> allow = null;


  public StatusPolicy allow(List<Integer> allow) {
    
    this.allow = allow;
    return this;
  }

  public StatusPolicy addAllowItem(Integer allowItem) {
    if (this.allow == null) {
      this.allow = new ArrayList<Integer>();
    }
    this.allow.add(allowItem);
    return this;
  }

   /**
   * Get allow
   * @return allow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAllow() {
    return allow;
  }


  public void setAllow(List<Integer> allow) {
    this.allow = allow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPolicy ioArgoprojEventsV1alpha1StatusPolicy = (StatusPolicy) o;
    return Objects.equals(this.allow, ioArgoprojEventsV1alpha1StatusPolicy.allow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPolicy {\n");
    sb.append("    allow: ").append(toIndentedString(allow)).append("\n");
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


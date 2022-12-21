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

/**
 * EventDependencyTransformer
 */

public class EventDependencyTransformer {
  public static final String SERIALIZED_NAME_JQ = "jq";
  @SerializedName(SERIALIZED_NAME_JQ)
  private String jq;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;


  public EventDependencyTransformer jq(String jq) {
    
    this.jq = jq;
    return this;
  }

   /**
   * Get jq
   * @return jq
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJq() {
    return jq;
  }


  public void setJq(String jq) {
    this.jq = jq;
  }


  public EventDependencyTransformer script(String script) {
    
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScript() {
    return script;
  }


  public void setScript(String script) {
    this.script = script;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDependencyTransformer ioArgoprojEventsV1alpha1EventDependencyTransformer = (EventDependencyTransformer) o;
    return Objects.equals(this.jq, ioArgoprojEventsV1alpha1EventDependencyTransformer.jq) &&
        Objects.equals(this.script, ioArgoprojEventsV1alpha1EventDependencyTransformer.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jq, script);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDependencyTransformer {\n");
    sb.append("    jq: ").append(toIndentedString(jq)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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


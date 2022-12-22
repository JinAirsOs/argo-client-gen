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
 * UpdateEventSourceRequest
 */

public class UpdateEventSourceRequest {
  public static final String SERIALIZED_NAME_EVENT_SOURCE = "eventSource";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE)
  private EventSource eventSource;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public UpdateEventSourceRequest eventSource(EventSource eventSource) {
    
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Get eventSource
   * @return eventSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSource getEventSource() {
    return eventSource;
  }


  public void setEventSource(EventSource eventSource) {
    this.eventSource = eventSource;
  }


  public UpdateEventSourceRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateEventSourceRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEventSourceRequest eventsourceUpdateEventSourceRequest = (UpdateEventSourceRequest) o;
    return Objects.equals(this.eventSource, eventsourceUpdateEventSourceRequest.eventSource) &&
        Objects.equals(this.name, eventsourceUpdateEventSourceRequest.name) &&
        Objects.equals(this.namespace, eventsourceUpdateEventSourceRequest.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSource, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEventSourceRequest {\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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


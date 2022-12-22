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
 * EventSource contains information for an event.
 */
@ApiModel(description = "EventSource contains information for an event.")

public class EventSource {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;


  public EventSource component(String component) {
    
    this.component = component;
    return this;
  }

   /**
   * Component from which the event is generated.
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component from which the event is generated.")

  public String getComponent() {
    return component;
  }


  public void setComponent(String component) {
    this.component = component;
  }


  public EventSource host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Node name on which the event is generated.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Node name on which the event is generated.")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSource ioK8sApiCoreV1EventSource = (EventSource) o;
    return Objects.equals(this.component, ioK8sApiCoreV1EventSource.component) &&
        Objects.equals(this.host, ioK8sApiCoreV1EventSource.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, host);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSource {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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


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
import io.argoproj.workflow.v1alpha.TriggerParameter;
import io.kubernetes.client.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.
 */
@ApiModel(description = "OpenWhiskTrigger refers to the specification of the OpenWhisk trigger.")

public class OpenWhiskTrigger {
  public static final String SERIALIZED_NAME_ACTION_NAME = "actionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private String actionName;

  public static final String SERIALIZED_NAME_AUTH_TOKEN = "authToken";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private V1SecretKeySelector authToken;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<TriggerParameter> payload = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public OpenWhiskTrigger actionName(String actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Name of the action/function.
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the action/function.")

  public String getActionName() {
    return actionName;
  }


  public void setActionName(String actionName) {
    this.actionName = actionName;
  }


  public OpenWhiskTrigger authToken(V1SecretKeySelector authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Get authToken
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAuthToken() {
    return authToken;
  }


  public void setAuthToken(V1SecretKeySelector authToken) {
    this.authToken = authToken;
  }


  public OpenWhiskTrigger host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Host URL of the OpenWhisk.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host URL of the OpenWhisk.")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public OpenWhiskTrigger namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace for the action. Defaults to \&quot;_\&quot;. +optional.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace for the action. Defaults to \"_\". +optional.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public OpenWhiskTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public OpenWhiskTrigger addParametersItem(TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public OpenWhiskTrigger payload(List<TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public OpenWhiskTrigger addPayloadItem(TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<TriggerParameter>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Payload is the list of key-value extracted from an event payload to construct the request payload.
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payload is the list of key-value extracted from an event payload to construct the request payload.")

  public List<TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<TriggerParameter> payload) {
    this.payload = payload;
  }


  public OpenWhiskTrigger version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenWhiskTrigger ioArgoprojEventsV1alpha1OpenWhiskTrigger = (OpenWhiskTrigger) o;
    return Objects.equals(this.actionName, ioArgoprojEventsV1alpha1OpenWhiskTrigger.actionName) &&
        Objects.equals(this.authToken, ioArgoprojEventsV1alpha1OpenWhiskTrigger.authToken) &&
        Objects.equals(this.host, ioArgoprojEventsV1alpha1OpenWhiskTrigger.host) &&
        Objects.equals(this.namespace, ioArgoprojEventsV1alpha1OpenWhiskTrigger.namespace) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1OpenWhiskTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1OpenWhiskTrigger.payload) &&
        Objects.equals(this.version, ioArgoprojEventsV1alpha1OpenWhiskTrigger.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, authToken, host, namespace, parameters, payload, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenWhiskTrigger {\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


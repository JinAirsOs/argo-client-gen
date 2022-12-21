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
import io.argoproj.workflow.v1alpha.TLSConfig;
import io.argoproj.workflow.v1alpha.TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NATSTrigger refers to the specification of the NATS trigger.
 */
@ApiModel(description = "NATSTrigger refers to the specification of the NATS trigger.")

public class NATSTrigger {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<TriggerParameter> payload = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private TLSConfig tls;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public NATSTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public NATSTrigger addParametersItem(TriggerParameter parametersItem) {
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


  public NATSTrigger payload(List<TriggerParameter> payload) {
    
    this.payload = payload;
    return this;
  }

  public NATSTrigger addPayloadItem(TriggerParameter payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<TriggerParameter>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TriggerParameter> getPayload() {
    return payload;
  }


  public void setPayload(List<TriggerParameter> payload) {
    this.payload = payload;
  }


  public NATSTrigger subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Name of the subject to put message on.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the subject to put message on.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public NATSTrigger tls(TLSConfig tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TLSConfig getTls() {
    return tls;
  }


  public void setTls(TLSConfig tls) {
    this.tls = tls;
  }


  public NATSTrigger url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the NATS cluster.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the NATS cluster.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NATSTrigger ioArgoprojEventsV1alpha1NATSTrigger = (NATSTrigger) o;
    return Objects.equals(this.parameters, ioArgoprojEventsV1alpha1NATSTrigger.parameters) &&
        Objects.equals(this.payload, ioArgoprojEventsV1alpha1NATSTrigger.payload) &&
        Objects.equals(this.subject, ioArgoprojEventsV1alpha1NATSTrigger.subject) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1NATSTrigger.tls) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1NATSTrigger.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, payload, subject, tls, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NATSTrigger {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


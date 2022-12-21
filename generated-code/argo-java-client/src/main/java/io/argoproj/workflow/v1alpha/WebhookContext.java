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
import io.kubernetes.client.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WebhookContext
 */

public class WebhookContext {
  public static final String SERIALIZED_NAME_AUTH_SECRET = "authSecret";
  @SerializedName(SERIALIZED_NAME_AUTH_SECRET)
  private V1SecretKeySelector authSecret;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_MAX_PAYLOAD_SIZE = "maxPayloadSize";
  @SerializedName(SERIALIZED_NAME_MAX_PAYLOAD_SIZE)
  private String maxPayloadSize;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_SERVER_CERT_SECRET = "serverCertSecret";
  @SerializedName(SERIALIZED_NAME_SERVER_CERT_SECRET)
  private V1SecretKeySelector serverCertSecret;

  public static final String SERIALIZED_NAME_SERVER_KEY_SECRET = "serverKeySecret";
  @SerializedName(SERIALIZED_NAME_SERVER_KEY_SECRET)
  private V1SecretKeySelector serverKeySecret;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public WebhookContext authSecret(V1SecretKeySelector authSecret) {
    
    this.authSecret = authSecret;
    return this;
  }

   /**
   * Get authSecret
   * @return authSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAuthSecret() {
    return authSecret;
  }


  public void setAuthSecret(V1SecretKeySelector authSecret) {
    this.authSecret = authSecret;
  }


  public WebhookContext endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public WebhookContext maxPayloadSize(String maxPayloadSize) {
    
    this.maxPayloadSize = maxPayloadSize;
    return this;
  }

   /**
   * Get maxPayloadSize
   * @return maxPayloadSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxPayloadSize() {
    return maxPayloadSize;
  }


  public void setMaxPayloadSize(String maxPayloadSize) {
    this.maxPayloadSize = maxPayloadSize;
  }


  public WebhookContext metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public WebhookContext putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public WebhookContext method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public WebhookContext port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port on which HTTP server is listening for incoming events.
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port on which HTTP server is listening for incoming events.")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public WebhookContext serverCertSecret(V1SecretKeySelector serverCertSecret) {
    
    this.serverCertSecret = serverCertSecret;
    return this;
  }

   /**
   * Get serverCertSecret
   * @return serverCertSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getServerCertSecret() {
    return serverCertSecret;
  }


  public void setServerCertSecret(V1SecretKeySelector serverCertSecret) {
    this.serverCertSecret = serverCertSecret;
  }


  public WebhookContext serverKeySecret(V1SecretKeySelector serverKeySecret) {
    
    this.serverKeySecret = serverKeySecret;
    return this;
  }

   /**
   * Get serverKeySecret
   * @return serverKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getServerKeySecret() {
    return serverKeySecret;
  }


  public void setServerKeySecret(V1SecretKeySelector serverKeySecret) {
    this.serverKeySecret = serverKeySecret;
  }


  public WebhookContext url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL is the url of the server.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL is the url of the server.")

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
    WebhookContext ioArgoprojEventsV1alpha1WebhookContext = (WebhookContext) o;
    return Objects.equals(this.authSecret, ioArgoprojEventsV1alpha1WebhookContext.authSecret) &&
        Objects.equals(this.endpoint, ioArgoprojEventsV1alpha1WebhookContext.endpoint) &&
        Objects.equals(this.maxPayloadSize, ioArgoprojEventsV1alpha1WebhookContext.maxPayloadSize) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1WebhookContext.metadata) &&
        Objects.equals(this.method, ioArgoprojEventsV1alpha1WebhookContext.method) &&
        Objects.equals(this.port, ioArgoprojEventsV1alpha1WebhookContext.port) &&
        Objects.equals(this.serverCertSecret, ioArgoprojEventsV1alpha1WebhookContext.serverCertSecret) &&
        Objects.equals(this.serverKeySecret, ioArgoprojEventsV1alpha1WebhookContext.serverKeySecret) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1WebhookContext.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authSecret, endpoint, maxPayloadSize, metadata, method, port, serverCertSecret, serverKeySecret, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookContext {\n");
    sb.append("    authSecret: ").append(toIndentedString(authSecret)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    maxPayloadSize: ").append(toIndentedString(maxPayloadSize)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    serverCertSecret: ").append(toIndentedString(serverCertSecret)).append("\n");
    sb.append("    serverKeySecret: ").append(toIndentedString(serverKeySecret)).append("\n");
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


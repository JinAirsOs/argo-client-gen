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

/**
 * AWSCredentials
 */

public class AWSCredentials {
  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "accessKeyId";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private V1SecretKeySelector accessKeyId;

  public static final String SERIALIZED_NAME_SECRET_ACCESS_KEY = "secretAccessKey";
  @SerializedName(SERIALIZED_NAME_SECRET_ACCESS_KEY)
  private V1SecretKeySelector secretAccessKey;

  public static final String SERIALIZED_NAME_SESSION_TOKEN = "sessionToken";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN)
  private V1SecretKeySelector sessionToken;


  public AWSCredentials accessKeyId(V1SecretKeySelector accessKeyId) {
    
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * Get accessKeyId
   * @return accessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAccessKeyId() {
    return accessKeyId;
  }


  public void setAccessKeyId(V1SecretKeySelector accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AWSCredentials secretAccessKey(V1SecretKeySelector secretAccessKey) {
    
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * Get secretAccessKey
   * @return secretAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSecretAccessKey() {
    return secretAccessKey;
  }


  public void setSecretAccessKey(V1SecretKeySelector secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  public AWSCredentials sessionToken(V1SecretKeySelector sessionToken) {
    
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * Get sessionToken
   * @return sessionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getSessionToken() {
    return sessionToken;
  }


  public void setSessionToken(V1SecretKeySelector sessionToken) {
    this.sessionToken = sessionToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSCredentials githubComArgoprojLabsArgoDataflowApiV1alpha1AWSCredentials = (AWSCredentials) o;
    return Objects.equals(this.accessKeyId, githubComArgoprojLabsArgoDataflowApiV1alpha1AWSCredentials.accessKeyId) &&
        Objects.equals(this.secretAccessKey, githubComArgoprojLabsArgoDataflowApiV1alpha1AWSCredentials.secretAccessKey) &&
        Objects.equals(this.sessionToken, githubComArgoprojLabsArgoDataflowApiV1alpha1AWSCredentials.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey, sessionToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSCredentials {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
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


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
import io.argoproj.workflow.v1alpha.OAuth2EndpointParam;
import io.kubernetes.client.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OAuth2Auth holds all information for client authentication via OAuth2 tokens
 */
@ApiModel(description = "OAuth2Auth holds all information for client authentication via OAuth2 tokens")

public class OAuth2Auth {
  public static final String SERIALIZED_NAME_CLIENT_I_D_SECRET = "clientIDSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_D_SECRET)
  private V1SecretKeySelector clientIDSecret;

  public static final String SERIALIZED_NAME_CLIENT_SECRET_SECRET = "clientSecretSecret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET_SECRET)
  private V1SecretKeySelector clientSecretSecret;

  public static final String SERIALIZED_NAME_ENDPOINT_PARAMS = "endpointParams";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_PARAMS)
  private List<OAuth2EndpointParam> endpointParams = null;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = null;

  public static final String SERIALIZED_NAME_TOKEN_U_R_L_SECRET = "tokenURLSecret";
  @SerializedName(SERIALIZED_NAME_TOKEN_U_R_L_SECRET)
  private V1SecretKeySelector tokenURLSecret;


  public OAuth2Auth clientIDSecret(V1SecretKeySelector clientIDSecret) {
    
    this.clientIDSecret = clientIDSecret;
    return this;
  }

   /**
   * Get clientIDSecret
   * @return clientIDSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getClientIDSecret() {
    return clientIDSecret;
  }


  public void setClientIDSecret(V1SecretKeySelector clientIDSecret) {
    this.clientIDSecret = clientIDSecret;
  }


  public OAuth2Auth clientSecretSecret(V1SecretKeySelector clientSecretSecret) {
    
    this.clientSecretSecret = clientSecretSecret;
    return this;
  }

   /**
   * Get clientSecretSecret
   * @return clientSecretSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getClientSecretSecret() {
    return clientSecretSecret;
  }


  public void setClientSecretSecret(V1SecretKeySelector clientSecretSecret) {
    this.clientSecretSecret = clientSecretSecret;
  }


  public OAuth2Auth endpointParams(List<OAuth2EndpointParam> endpointParams) {
    
    this.endpointParams = endpointParams;
    return this;
  }

  public OAuth2Auth addEndpointParamsItem(OAuth2EndpointParam endpointParamsItem) {
    if (this.endpointParams == null) {
      this.endpointParams = new ArrayList<OAuth2EndpointParam>();
    }
    this.endpointParams.add(endpointParamsItem);
    return this;
  }

   /**
   * Get endpointParams
   * @return endpointParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OAuth2EndpointParam> getEndpointParams() {
    return endpointParams;
  }


  public void setEndpointParams(List<OAuth2EndpointParam> endpointParams) {
    this.endpointParams = endpointParams;
  }


  public OAuth2Auth scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public OAuth2Auth addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<String>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public OAuth2Auth tokenURLSecret(V1SecretKeySelector tokenURLSecret) {
    
    this.tokenURLSecret = tokenURLSecret;
    return this;
  }

   /**
   * Get tokenURLSecret
   * @return tokenURLSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getTokenURLSecret() {
    return tokenURLSecret;
  }


  public void setTokenURLSecret(V1SecretKeySelector tokenURLSecret) {
    this.tokenURLSecret = tokenURLSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Auth ioArgoprojWorkflowV1alpha1OAuth2Auth = (OAuth2Auth) o;
    return Objects.equals(this.clientIDSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.clientIDSecret) &&
        Objects.equals(this.clientSecretSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.clientSecretSecret) &&
        Objects.equals(this.endpointParams, ioArgoprojWorkflowV1alpha1OAuth2Auth.endpointParams) &&
        Objects.equals(this.scopes, ioArgoprojWorkflowV1alpha1OAuth2Auth.scopes) &&
        Objects.equals(this.tokenURLSecret, ioArgoprojWorkflowV1alpha1OAuth2Auth.tokenURLSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIDSecret, clientSecretSecret, endpointParams, scopes, tokenURLSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Auth {\n");
    sb.append("    clientIDSecret: ").append(toIndentedString(clientIDSecret)).append("\n");
    sb.append("    clientSecretSecret: ").append(toIndentedString(clientSecretSecret)).append("\n");
    sb.append("    endpointParams: ").append(toIndentedString(endpointParams)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    tokenURLSecret: ").append(toIndentedString(tokenURLSecret)).append("\n");
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


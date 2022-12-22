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
 * AzureArtifact is the location of a an Azure Storage artifact
 */
@ApiModel(description = "AzureArtifact is the location of a an Azure Storage artifact")

public class AzureArtifact {
  public static final String SERIALIZED_NAME_ACCOUNT_KEY_SECRET = "accountKeySecret";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_KEY_SECRET)
  private V1SecretKeySelector accountKeySecret;

  public static final String SERIALIZED_NAME_BLOB = "blob";
  @SerializedName(SERIALIZED_NAME_BLOB)
  private String blob;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private String container;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_USE_S_D_K_CREDS = "useSDKCreds";
  @SerializedName(SERIALIZED_NAME_USE_S_D_K_CREDS)
  private Boolean useSDKCreds;


  public AzureArtifact accountKeySecret(V1SecretKeySelector accountKeySecret) {
    
    this.accountKeySecret = accountKeySecret;
    return this;
  }

   /**
   * Get accountKeySecret
   * @return accountKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAccountKeySecret() {
    return accountKeySecret;
  }


  public void setAccountKeySecret(V1SecretKeySelector accountKeySecret) {
    this.accountKeySecret = accountKeySecret;
  }


  public AzureArtifact blob(String blob) {
    
    this.blob = blob;
    return this;
  }

   /**
   * Blob is the blob name (i.e., path) in the container where the artifact resides
   * @return blob
  **/
  @ApiModelProperty(required = true, value = "Blob is the blob name (i.e., path) in the container where the artifact resides")

  public String getBlob() {
    return blob;
  }


  public void setBlob(String blob) {
    this.blob = blob;
  }


  public AzureArtifact container(String container) {
    
    this.container = container;
    return this;
  }

   /**
   * Container is the container where resources will be stored
   * @return container
  **/
  @ApiModelProperty(required = true, value = "Container is the container where resources will be stored")

  public String getContainer() {
    return container;
  }


  public void setContainer(String container) {
    this.container = container;
  }


  public AzureArtifact endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Endpoint is the service url associated with an account. It is most likely \&quot;https://&lt;ACCOUNT_NAME&gt;.blob.core.windows.net\&quot;
   * @return endpoint
  **/
  @ApiModelProperty(required = true, value = "Endpoint is the service url associated with an account. It is most likely \"https://<ACCOUNT_NAME>.blob.core.windows.net\"")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public AzureArtifact useSDKCreds(Boolean useSDKCreds) {
    
    this.useSDKCreds = useSDKCreds;
    return this;
  }

   /**
   * UseSDKCreds tells the driver to figure out credentials based on sdk defaults.
   * @return useSDKCreds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UseSDKCreds tells the driver to figure out credentials based on sdk defaults.")

  public Boolean getUseSDKCreds() {
    return useSDKCreds;
  }


  public void setUseSDKCreds(Boolean useSDKCreds) {
    this.useSDKCreds = useSDKCreds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureArtifact ioArgoprojWorkflowV1alpha1AzureArtifact = (AzureArtifact) o;
    return Objects.equals(this.accountKeySecret, ioArgoprojWorkflowV1alpha1AzureArtifact.accountKeySecret) &&
        Objects.equals(this.blob, ioArgoprojWorkflowV1alpha1AzureArtifact.blob) &&
        Objects.equals(this.container, ioArgoprojWorkflowV1alpha1AzureArtifact.container) &&
        Objects.equals(this.endpoint, ioArgoprojWorkflowV1alpha1AzureArtifact.endpoint) &&
        Objects.equals(this.useSDKCreds, ioArgoprojWorkflowV1alpha1AzureArtifact.useSDKCreds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountKeySecret, blob, container, endpoint, useSDKCreds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureArtifact {\n");
    sb.append("    accountKeySecret: ").append(toIndentedString(accountKeySecret)).append("\n");
    sb.append("    blob: ").append(toIndentedString(blob)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    useSDKCreds: ").append(toIndentedString(useSDKCreds)).append("\n");
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


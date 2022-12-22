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
import io.argoproj.workflow.v1alpha.HTTPHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTPSink
 */

public class HTTPSink {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<HTTPHeader> headers = null;

  public static final String SERIALIZED_NAME_INSECURE_SKIP_VERIFY = "insecureSkipVerify";
  @SerializedName(SERIALIZED_NAME_INSECURE_SKIP_VERIFY)
  private Boolean insecureSkipVerify;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public HTTPSink headers(List<HTTPHeader> headers) {
    
    this.headers = headers;
    return this;
  }

  public HTTPSink addHeadersItem(HTTPHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<HTTPHeader>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HTTPHeader> getHeaders() {
    return headers;
  }


  public void setHeaders(List<HTTPHeader> headers) {
    this.headers = headers;
  }


  public HTTPSink insecureSkipVerify(Boolean insecureSkipVerify) {
    
    this.insecureSkipVerify = insecureSkipVerify;
    return this;
  }

   /**
   * Get insecureSkipVerify
   * @return insecureSkipVerify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInsecureSkipVerify() {
    return insecureSkipVerify;
  }


  public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
  }


  public HTTPSink url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    HTTPSink githubComArgoprojLabsArgoDataflowApiV1alpha1HTTPSink = (HTTPSink) o;
    return Objects.equals(this.headers, githubComArgoprojLabsArgoDataflowApiV1alpha1HTTPSink.headers) &&
        Objects.equals(this.insecureSkipVerify, githubComArgoprojLabsArgoDataflowApiV1alpha1HTTPSink.insecureSkipVerify) &&
        Objects.equals(this.url, githubComArgoprojLabsArgoDataflowApiV1alpha1HTTPSink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, insecureSkipVerify, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPSink {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
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


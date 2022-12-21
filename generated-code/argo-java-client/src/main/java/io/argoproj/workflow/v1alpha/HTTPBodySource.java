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
 * HTTPBodySource contains the source of the HTTP body.
 */
@ApiModel(description = "HTTPBodySource contains the source of the HTTP body.")

public class HTTPBodySource {
  public static final String SERIALIZED_NAME_BYTES = "bytes";
  @SerializedName(SERIALIZED_NAME_BYTES)
  private byte[] bytes;


  public HTTPBodySource bytes(byte[] bytes) {
    
    this.bytes = bytes;
    return this;
  }

   /**
   * Get bytes
   * @return bytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getBytes() {
    return bytes;
  }


  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPBodySource ioArgoprojWorkflowV1alpha1HTTPBodySource = (HTTPBodySource) o;
    return Arrays.equals(this.bytes, ioArgoprojWorkflowV1alpha1HTTPBodySource.bytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(bytes));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPBodySource {\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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


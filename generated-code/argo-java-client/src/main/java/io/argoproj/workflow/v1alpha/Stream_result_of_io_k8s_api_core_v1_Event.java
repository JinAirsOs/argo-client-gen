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
import io.argoproj.workflow.v1alpha.Event;
import io.argoproj.workflow.v1alpha.StreamError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Stream_result_of_io_k8s_api_core_v1_Event
 */

public class Stream_result_of_io_k8s_api_core_v1_Event {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private StreamError error;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Event result;


  public Stream_result_of_io_k8s_api_core_v1_Event error(StreamError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StreamError getError() {
    return error;
  }


  public void setError(StreamError error) {
    this.error = error;
  }


  public Stream_result_of_io_k8s_api_core_v1_Event result(Event result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Event getResult() {
    return result;
  }


  public void setResult(Event result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream_result_of_io_k8s_api_core_v1_Event streamResultOfIoK8sApiCoreV1Event = (Stream_result_of_io_k8s_api_core_v1_Event) o;
    return Objects.equals(this.error, streamResultOfIoK8sApiCoreV1Event.error) &&
        Objects.equals(this.result, streamResultOfIoK8sApiCoreV1Event.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream_result_of_io_k8s_api_core_v1_Event {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Stream_result_of_sensor_SensorWatchEvent
 */

public class Stream_result_of_sensor_SensorWatchEvent {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private StreamError error;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private SensorWatchEvent result;


  public Stream_result_of_sensor_SensorWatchEvent error(StreamError error) {
    
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


  public Stream_result_of_sensor_SensorWatchEvent result(SensorWatchEvent result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SensorWatchEvent getResult() {
    return result;
  }


  public void setResult(SensorWatchEvent result) {
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
    Stream_result_of_sensor_SensorWatchEvent streamResultOfSensorSensorWatchEvent = (Stream_result_of_sensor_SensorWatchEvent) o;
    return Objects.equals(this.error, streamResultOfSensorSensorWatchEvent.error) &&
        Objects.equals(this.result, streamResultOfSensorSensorWatchEvent.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream_result_of_sensor_SensorWatchEvent {\n");
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


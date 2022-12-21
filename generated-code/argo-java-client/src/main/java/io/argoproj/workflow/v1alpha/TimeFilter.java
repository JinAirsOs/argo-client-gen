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
 * TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.
 */
@ApiModel(description = "TimeFilter describes a window in time. It filters out events that occur outside the time limits. In other words, only events that occur after Start and before Stop will pass this filter.")

public class TimeFilter {
  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public static final String SERIALIZED_NAME_STOP = "stop";
  @SerializedName(SERIALIZED_NAME_STOP)
  private String stop;


  public TimeFilter start(String start) {
    
    this.start = start;
    return this;
  }

   /**
   * Start is the beginning of a time window in UTC. Before this time, events for this dependency are ignored. Format is hh:mm:ss.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start is the beginning of a time window in UTC. Before this time, events for this dependency are ignored. Format is hh:mm:ss.")

  public String getStart() {
    return start;
  }


  public void setStart(String start) {
    this.start = start;
  }


  public TimeFilter stop(String stop) {
    
    this.stop = stop;
    return this;
  }

   /**
   * Stop is the end of a time window in UTC. After or equal to this time, events for this dependency are ignored and Format is hh:mm:ss. If it is smaller than Start, it is treated as next day of Start (e.g.: 22:00:00-01:00:00 means 22:00:00-25:00:00).
   * @return stop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stop is the end of a time window in UTC. After or equal to this time, events for this dependency are ignored and Format is hh:mm:ss. If it is smaller than Start, it is treated as next day of Start (e.g.: 22:00:00-01:00:00 means 22:00:00-25:00:00).")

  public String getStop() {
    return stop;
  }


  public void setStop(String stop) {
    this.stop = stop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeFilter ioArgoprojEventsV1alpha1TimeFilter = (TimeFilter) o;
    return Objects.equals(this.start, ioArgoprojEventsV1alpha1TimeFilter.start) &&
        Objects.equals(this.stop, ioArgoprojEventsV1alpha1TimeFilter.stop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, stop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeFilter {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
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


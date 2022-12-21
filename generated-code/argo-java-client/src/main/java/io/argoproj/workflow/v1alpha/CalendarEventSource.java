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
import io.argoproj.workflow.v1alpha.EventPersistence;
import io.argoproj.workflow.v1alpha.EventSourceFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CalendarEventSource
 */

public class CalendarEventSource {
  public static final String SERIALIZED_NAME_EXCLUSION_DATES = "exclusionDates";
  @SerializedName(SERIALIZED_NAME_EXCLUSION_DATES)
  private List<String> exclusionDates = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PERSISTENCE = "persistence";
  @SerializedName(SERIALIZED_NAME_PERSISTENCE)
  private EventPersistence persistence;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;


  public CalendarEventSource exclusionDates(List<String> exclusionDates) {
    
    this.exclusionDates = exclusionDates;
    return this;
  }

  public CalendarEventSource addExclusionDatesItem(String exclusionDatesItem) {
    if (this.exclusionDates == null) {
      this.exclusionDates = new ArrayList<String>();
    }
    this.exclusionDates.add(exclusionDatesItem);
    return this;
  }

   /**
   * ExclusionDates defines the list of DATE-TIME exceptions for recurring events.
   * @return exclusionDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExclusionDates defines the list of DATE-TIME exceptions for recurring events.")

  public List<String> getExclusionDates() {
    return exclusionDates;
  }


  public void setExclusionDates(List<String> exclusionDates) {
    this.exclusionDates = exclusionDates;
  }


  public CalendarEventSource filter(EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(EventSourceFilter filter) {
    this.filter = filter;
  }


  public CalendarEventSource interval(String interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInterval() {
    return interval;
  }


  public void setInterval(String interval) {
    this.interval = interval;
  }


  public CalendarEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CalendarEventSource putMetadataItem(String key, String metadataItem) {
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


  public CalendarEventSource persistence(EventPersistence persistence) {
    
    this.persistence = persistence;
    return this;
  }

   /**
   * Get persistence
   * @return persistence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventPersistence getPersistence() {
    return persistence;
  }


  public void setPersistence(EventPersistence persistence) {
    this.persistence = persistence;
  }


  public CalendarEventSource schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public CalendarEventSource timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEventSource ioArgoprojEventsV1alpha1CalendarEventSource = (CalendarEventSource) o;
    return Objects.equals(this.exclusionDates, ioArgoprojEventsV1alpha1CalendarEventSource.exclusionDates) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1CalendarEventSource.filter) &&
        Objects.equals(this.interval, ioArgoprojEventsV1alpha1CalendarEventSource.interval) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1CalendarEventSource.metadata) &&
        Objects.equals(this.persistence, ioArgoprojEventsV1alpha1CalendarEventSource.persistence) &&
        Objects.equals(this.schedule, ioArgoprojEventsV1alpha1CalendarEventSource.schedule) &&
        Objects.equals(this.timezone, ioArgoprojEventsV1alpha1CalendarEventSource.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionDates, filter, interval, metadata, persistence, schedule, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEventSource {\n");
    sb.append("    exclusionDates: ").append(toIndentedString(exclusionDates)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    persistence: ").append(toIndentedString(persistence)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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


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
import io.argoproj.workflow.v1alpha.EventSourceFilter;
import io.argoproj.workflow.v1alpha.TLSConfig;
import io.kubernetes.client.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RedisStreamEventSource
 */

public class RedisStreamEventSource {
  public static final String SERIALIZED_NAME_CONSUMER_GROUP = "consumerGroup";
  @SerializedName(SERIALIZED_NAME_CONSUMER_GROUP)
  private String consumerGroup;

  public static final String SERIALIZED_NAME_DB = "db";
  @SerializedName(SERIALIZED_NAME_DB)
  private Integer db;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_HOST_ADDRESS = "hostAddress";
  @SerializedName(SERIALIZED_NAME_HOST_ADDRESS)
  private String hostAddress;

  public static final String SERIALIZED_NAME_MAX_MSG_COUNT_PER_READ = "maxMsgCountPerRead";
  @SerializedName(SERIALIZED_NAME_MAX_MSG_COUNT_PER_READ)
  private Integer maxMsgCountPerRead;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private V1SecretKeySelector password;

  public static final String SERIALIZED_NAME_STREAMS = "streams";
  @SerializedName(SERIALIZED_NAME_STREAMS)
  private List<String> streams = null;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private TLSConfig tls;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public RedisStreamEventSource consumerGroup(String consumerGroup) {
    
    this.consumerGroup = consumerGroup;
    return this;
  }

   /**
   * Get consumerGroup
   * @return consumerGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsumerGroup() {
    return consumerGroup;
  }


  public void setConsumerGroup(String consumerGroup) {
    this.consumerGroup = consumerGroup;
  }


  public RedisStreamEventSource db(Integer db) {
    
    this.db = db;
    return this;
  }

   /**
   * Get db
   * @return db
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDb() {
    return db;
  }


  public void setDb(Integer db) {
    this.db = db;
  }


  public RedisStreamEventSource filter(EventSourceFilter filter) {
    
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


  public RedisStreamEventSource hostAddress(String hostAddress) {
    
    this.hostAddress = hostAddress;
    return this;
  }

   /**
   * Get hostAddress
   * @return hostAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostAddress() {
    return hostAddress;
  }


  public void setHostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
  }


  public RedisStreamEventSource maxMsgCountPerRead(Integer maxMsgCountPerRead) {
    
    this.maxMsgCountPerRead = maxMsgCountPerRead;
    return this;
  }

   /**
   * Get maxMsgCountPerRead
   * @return maxMsgCountPerRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxMsgCountPerRead() {
    return maxMsgCountPerRead;
  }


  public void setMaxMsgCountPerRead(Integer maxMsgCountPerRead) {
    this.maxMsgCountPerRead = maxMsgCountPerRead;
  }


  public RedisStreamEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public RedisStreamEventSource putMetadataItem(String key, String metadataItem) {
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


  public RedisStreamEventSource password(V1SecretKeySelector password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getPassword() {
    return password;
  }


  public void setPassword(V1SecretKeySelector password) {
    this.password = password;
  }


  public RedisStreamEventSource streams(List<String> streams) {
    
    this.streams = streams;
    return this;
  }

  public RedisStreamEventSource addStreamsItem(String streamsItem) {
    if (this.streams == null) {
      this.streams = new ArrayList<String>();
    }
    this.streams.add(streamsItem);
    return this;
  }

   /**
   * Streams to look for entries. XREADGROUP is used on all streams using a single consumer group.
   * @return streams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Streams to look for entries. XREADGROUP is used on all streams using a single consumer group.")

  public List<String> getStreams() {
    return streams;
  }


  public void setStreams(List<String> streams) {
    this.streams = streams;
  }


  public RedisStreamEventSource tls(TLSConfig tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TLSConfig getTls() {
    return tls;
  }


  public void setTls(TLSConfig tls) {
    this.tls = tls;
  }


  public RedisStreamEventSource username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedisStreamEventSource ioArgoprojEventsV1alpha1RedisStreamEventSource = (RedisStreamEventSource) o;
    return Objects.equals(this.consumerGroup, ioArgoprojEventsV1alpha1RedisStreamEventSource.consumerGroup) &&
        Objects.equals(this.db, ioArgoprojEventsV1alpha1RedisStreamEventSource.db) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1RedisStreamEventSource.filter) &&
        Objects.equals(this.hostAddress, ioArgoprojEventsV1alpha1RedisStreamEventSource.hostAddress) &&
        Objects.equals(this.maxMsgCountPerRead, ioArgoprojEventsV1alpha1RedisStreamEventSource.maxMsgCountPerRead) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1RedisStreamEventSource.metadata) &&
        Objects.equals(this.password, ioArgoprojEventsV1alpha1RedisStreamEventSource.password) &&
        Objects.equals(this.streams, ioArgoprojEventsV1alpha1RedisStreamEventSource.streams) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1RedisStreamEventSource.tls) &&
        Objects.equals(this.username, ioArgoprojEventsV1alpha1RedisStreamEventSource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerGroup, db, filter, hostAddress, maxMsgCountPerRead, metadata, password, streams, tls, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedisStreamEventSource {\n");
    sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
    sb.append("    maxMsgCountPerRead: ").append(toIndentedString(maxMsgCountPerRead)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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


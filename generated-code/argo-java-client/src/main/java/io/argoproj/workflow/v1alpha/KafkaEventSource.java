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
import io.argoproj.workflow.v1alpha.Backoff;
import io.argoproj.workflow.v1alpha.EventSourceFilter;
import io.argoproj.workflow.v1alpha.KafkaConsumerGroup;
import io.argoproj.workflow.v1alpha.SASLConfig;
import io.argoproj.workflow.v1alpha.TLSConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * KafkaEventSource
 */

public class KafkaEventSource {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private String config;

  public static final String SERIALIZED_NAME_CONNECTION_BACKOFF = "connectionBackoff";
  @SerializedName(SERIALIZED_NAME_CONNECTION_BACKOFF)
  private Backoff connectionBackoff;

  public static final String SERIALIZED_NAME_CONSUMER_GROUP = "consumerGroup";
  @SerializedName(SERIALIZED_NAME_CONSUMER_GROUP)
  private KafkaConsumerGroup consumerGroup;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_JSON_BODY = "jsonBody";
  @SerializedName(SERIALIZED_NAME_JSON_BODY)
  private Boolean jsonBody;

  public static final String SERIALIZED_NAME_LIMIT_EVENTS_PER_SECOND = "limitEventsPerSecond";
  @SerializedName(SERIALIZED_NAME_LIMIT_EVENTS_PER_SECOND)
  private String limitEventsPerSecond;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private String partition;

  public static final String SERIALIZED_NAME_SASL = "sasl";
  @SerializedName(SERIALIZED_NAME_SASL)
  private SASLConfig sasl;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private TLSConfig tls;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public KafkaEventSource config(String config) {
    
    this.config = config;
    return this;
  }

   /**
   * Yaml format Sarama config for Kafka connection. It follows the struct of sarama.Config. See https://github.com/Shopify/sarama/blob/main/config.go e.g.  consumer:   fetch:     min: 1 net:   MaxOpenRequests: 5  +optional
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Yaml format Sarama config for Kafka connection. It follows the struct of sarama.Config. See https://github.com/Shopify/sarama/blob/main/config.go e.g.  consumer:   fetch:     min: 1 net:   MaxOpenRequests: 5  +optional")

  public String getConfig() {
    return config;
  }


  public void setConfig(String config) {
    this.config = config;
  }


  public KafkaEventSource connectionBackoff(Backoff connectionBackoff) {
    
    this.connectionBackoff = connectionBackoff;
    return this;
  }

   /**
   * Get connectionBackoff
   * @return connectionBackoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Backoff getConnectionBackoff() {
    return connectionBackoff;
  }


  public void setConnectionBackoff(Backoff connectionBackoff) {
    this.connectionBackoff = connectionBackoff;
  }


  public KafkaEventSource consumerGroup(KafkaConsumerGroup consumerGroup) {
    
    this.consumerGroup = consumerGroup;
    return this;
  }

   /**
   * Get consumerGroup
   * @return consumerGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KafkaConsumerGroup getConsumerGroup() {
    return consumerGroup;
  }


  public void setConsumerGroup(KafkaConsumerGroup consumerGroup) {
    this.consumerGroup = consumerGroup;
  }


  public KafkaEventSource filter(EventSourceFilter filter) {
    
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


  public KafkaEventSource jsonBody(Boolean jsonBody) {
    
    this.jsonBody = jsonBody;
    return this;
  }

   /**
   * Get jsonBody
   * @return jsonBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getJsonBody() {
    return jsonBody;
  }


  public void setJsonBody(Boolean jsonBody) {
    this.jsonBody = jsonBody;
  }


  public KafkaEventSource limitEventsPerSecond(String limitEventsPerSecond) {
    
    this.limitEventsPerSecond = limitEventsPerSecond;
    return this;
  }

   /**
   * Get limitEventsPerSecond
   * @return limitEventsPerSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLimitEventsPerSecond() {
    return limitEventsPerSecond;
  }


  public void setLimitEventsPerSecond(String limitEventsPerSecond) {
    this.limitEventsPerSecond = limitEventsPerSecond;
  }


  public KafkaEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public KafkaEventSource putMetadataItem(String key, String metadataItem) {
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


  public KafkaEventSource partition(String partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Get partition
   * @return partition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPartition() {
    return partition;
  }


  public void setPartition(String partition) {
    this.partition = partition;
  }


  public KafkaEventSource sasl(SASLConfig sasl) {
    
    this.sasl = sasl;
    return this;
  }

   /**
   * Get sasl
   * @return sasl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SASLConfig getSasl() {
    return sasl;
  }


  public void setSasl(SASLConfig sasl) {
    this.sasl = sasl;
  }


  public KafkaEventSource tls(TLSConfig tls) {
    
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


  public KafkaEventSource topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTopic() {
    return topic;
  }


  public void setTopic(String topic) {
    this.topic = topic;
  }


  public KafkaEventSource url(String url) {
    
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


  public KafkaEventSource version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaEventSource ioArgoprojEventsV1alpha1KafkaEventSource = (KafkaEventSource) o;
    return Objects.equals(this.config, ioArgoprojEventsV1alpha1KafkaEventSource.config) &&
        Objects.equals(this.connectionBackoff, ioArgoprojEventsV1alpha1KafkaEventSource.connectionBackoff) &&
        Objects.equals(this.consumerGroup, ioArgoprojEventsV1alpha1KafkaEventSource.consumerGroup) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1KafkaEventSource.filter) &&
        Objects.equals(this.jsonBody, ioArgoprojEventsV1alpha1KafkaEventSource.jsonBody) &&
        Objects.equals(this.limitEventsPerSecond, ioArgoprojEventsV1alpha1KafkaEventSource.limitEventsPerSecond) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1KafkaEventSource.metadata) &&
        Objects.equals(this.partition, ioArgoprojEventsV1alpha1KafkaEventSource.partition) &&
        Objects.equals(this.sasl, ioArgoprojEventsV1alpha1KafkaEventSource.sasl) &&
        Objects.equals(this.tls, ioArgoprojEventsV1alpha1KafkaEventSource.tls) &&
        Objects.equals(this.topic, ioArgoprojEventsV1alpha1KafkaEventSource.topic) &&
        Objects.equals(this.url, ioArgoprojEventsV1alpha1KafkaEventSource.url) &&
        Objects.equals(this.version, ioArgoprojEventsV1alpha1KafkaEventSource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, connectionBackoff, consumerGroup, filter, jsonBody, limitEventsPerSecond, metadata, partition, sasl, tls, topic, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaEventSource {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    connectionBackoff: ").append(toIndentedString(connectionBackoff)).append("\n");
    sb.append("    consumerGroup: ").append(toIndentedString(consumerGroup)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    jsonBody: ").append(toIndentedString(jsonBody)).append("\n");
    sb.append("    limitEventsPerSecond: ").append(toIndentedString(limitEventsPerSecond)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


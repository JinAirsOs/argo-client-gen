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
import io.argoproj.workflow.v1alpha.Duration;
import io.argoproj.workflow.v1alpha.Kafka;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * KafkaSource
 */

public class KafkaSource {
  public static final String SERIALIZED_NAME_FETCH_MIN = "fetchMin";
  @SerializedName(SERIALIZED_NAME_FETCH_MIN)
  private String fetchMin;

  public static final String SERIALIZED_NAME_FETCH_WAIT_MAX = "fetchWaitMax";
  @SerializedName(SERIALIZED_NAME_FETCH_WAIT_MAX)
  private Duration fetchWaitMax;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_KAFKA = "kafka";
  @SerializedName(SERIALIZED_NAME_KAFKA)
  private Kafka kafka;

  public static final String SERIALIZED_NAME_START_OFFSET = "startOffset";
  @SerializedName(SERIALIZED_NAME_START_OFFSET)
  private String startOffset;


  public KafkaSource fetchMin(String fetchMin) {
    
    this.fetchMin = fetchMin;
    return this;
  }

   /**
   * Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  &lt;quantity&gt;        ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt;   (Note that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.) &lt;digit&gt;           ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt;          ::&#x3D; &lt;digit&gt; | &lt;digit&gt;&lt;digits&gt; &lt;number&gt;          ::&#x3D; &lt;digits&gt; | &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt;            ::&#x3D; \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt;    ::&#x3D; &lt;number&gt; | &lt;sign&gt;&lt;number&gt; &lt;suffix&gt;          ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; | &lt;decimalSI&gt; &lt;binarySI&gt;        ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html) &lt;decimalSI&gt;       ::&#x3D; m | \&quot;\&quot; | k | M | G | T | P | E   (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I didn&#39;t choose the capitalization.) &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot; &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt;  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost   b. No fractional digits will be emitted   c. The exponent (or suffix) is as large as possible. The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \&quot;1500m\&quot;   1.5Gi will be serialized as \&quot;1536Mi\&quot;  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don&#39;t diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.
   * @return fetchMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.) <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html) <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.) <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber>  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost   b. No fractional digits will be emitted   c. The exponent (or suffix) is as large as possible. The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \"1500m\"   1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")

  public String getFetchMin() {
    return fetchMin;
  }


  public void setFetchMin(String fetchMin) {
    this.fetchMin = fetchMin;
  }


  public KafkaSource fetchWaitMax(Duration fetchWaitMax) {
    
    this.fetchWaitMax = fetchWaitMax;
    return this;
  }

   /**
   * Get fetchWaitMax
   * @return fetchWaitMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Duration getFetchWaitMax() {
    return fetchWaitMax;
  }


  public void setFetchWaitMax(Duration fetchWaitMax) {
    this.fetchWaitMax = fetchWaitMax;
  }


  public KafkaSource groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * GroupID is the consumer group ID. If not specified, a unique deterministic group ID is generated.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GroupID is the consumer group ID. If not specified, a unique deterministic group ID is generated.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public KafkaSource kafka(Kafka kafka) {
    
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Kafka getKafka() {
    return kafka;
  }


  public void setKafka(Kafka kafka) {
    this.kafka = kafka;
  }


  public KafkaSource startOffset(String startOffset) {
    
    this.startOffset = startOffset;
    return this;
  }

   /**
   * Get startOffset
   * @return startOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartOffset() {
    return startOffset;
  }


  public void setStartOffset(String startOffset) {
    this.startOffset = startOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaSource githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSource = (KafkaSource) o;
    return Objects.equals(this.fetchMin, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSource.fetchMin) &&
        Objects.equals(this.fetchWaitMax, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSource.fetchWaitMax) &&
        Objects.equals(this.groupId, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSource.groupId) &&
        Objects.equals(this.kafka, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSource.kafka) &&
        Objects.equals(this.startOffset, githubComArgoprojLabsArgoDataflowApiV1alpha1KafkaSource.startOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fetchMin, fetchWaitMax, groupId, kafka, startOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaSource {\n");
    sb.append("    fetchMin: ").append(toIndentedString(fetchMin)).append("\n");
    sb.append("    fetchWaitMax: ").append(toIndentedString(fetchWaitMax)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
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


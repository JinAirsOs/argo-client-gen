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
import io.argoproj.workflow.v1alpha.RetryAffinity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RetryStrategy provides controls on how to retry a workflow step
 */
@ApiModel(description = "RetryStrategy provides controls on how to retry a workflow step")

public class RetryStrategy {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private RetryAffinity affinity;

  public static final String SERIALIZED_NAME_BACKOFF = "backoff";
  @SerializedName(SERIALIZED_NAME_BACKOFF)
  private Backoff backoff;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private String limit;

  public static final String SERIALIZED_NAME_RETRY_POLICY = "retryPolicy";
  @SerializedName(SERIALIZED_NAME_RETRY_POLICY)
  private String retryPolicy;


  public RetryStrategy affinity(RetryAffinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetryAffinity getAffinity() {
    return affinity;
  }


  public void setAffinity(RetryAffinity affinity) {
    this.affinity = affinity;
  }


  public RetryStrategy backoff(Backoff backoff) {
    
    this.backoff = backoff;
    return this;
  }

   /**
   * Get backoff
   * @return backoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Backoff getBackoff() {
    return backoff;
  }


  public void setBackoff(Backoff backoff) {
    this.backoff = backoff;
  }


  public RetryStrategy expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expression is a condition expression for when a node will be retried. If it evaluates to false, the node will not be retried and the retry strategy will be ignored")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public RetryStrategy limit(String limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLimit() {
    return limit;
  }


  public void setLimit(String limit) {
    this.limit = limit;
  }


  public RetryStrategy retryPolicy(String retryPolicy) {
    
    this.retryPolicy = retryPolicy;
    return this;
  }

   /**
   * RetryPolicy is a policy of NodePhase statuses that will be retried
   * @return retryPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RetryPolicy is a policy of NodePhase statuses that will be retried")

  public String getRetryPolicy() {
    return retryPolicy;
  }


  public void setRetryPolicy(String retryPolicy) {
    this.retryPolicy = retryPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryStrategy ioArgoprojWorkflowV1alpha1RetryStrategy = (RetryStrategy) o;
    return Objects.equals(this.affinity, ioArgoprojWorkflowV1alpha1RetryStrategy.affinity) &&
        Objects.equals(this.backoff, ioArgoprojWorkflowV1alpha1RetryStrategy.backoff) &&
        Objects.equals(this.expression, ioArgoprojWorkflowV1alpha1RetryStrategy.expression) &&
        Objects.equals(this.limit, ioArgoprojWorkflowV1alpha1RetryStrategy.limit) &&
        Objects.equals(this.retryPolicy, ioArgoprojWorkflowV1alpha1RetryStrategy.retryPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, backoff, expression, limit, retryPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetryStrategy {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    backoff: ").append(toIndentedString(backoff)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    retryPolicy: ").append(toIndentedString(retryPolicy)).append("\n");
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


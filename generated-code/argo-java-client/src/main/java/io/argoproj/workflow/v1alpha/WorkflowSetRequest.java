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
 * WorkflowSetRequest
 */

public class WorkflowSetRequest {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NODE_FIELD_SELECTOR = "nodeFieldSelector";
  @SerializedName(SERIALIZED_NAME_NODE_FIELD_SELECTOR)
  private String nodeFieldSelector;

  public static final String SERIALIZED_NAME_OUTPUT_PARAMETERS = "outputParameters";
  @SerializedName(SERIALIZED_NAME_OUTPUT_PARAMETERS)
  private String outputParameters;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;


  public WorkflowSetRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public WorkflowSetRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowSetRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public WorkflowSetRequest nodeFieldSelector(String nodeFieldSelector) {
    
    this.nodeFieldSelector = nodeFieldSelector;
    return this;
  }

   /**
   * Get nodeFieldSelector
   * @return nodeFieldSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeFieldSelector() {
    return nodeFieldSelector;
  }


  public void setNodeFieldSelector(String nodeFieldSelector) {
    this.nodeFieldSelector = nodeFieldSelector;
  }


  public WorkflowSetRequest outputParameters(String outputParameters) {
    
    this.outputParameters = outputParameters;
    return this;
  }

   /**
   * Get outputParameters
   * @return outputParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutputParameters() {
    return outputParameters;
  }


  public void setOutputParameters(String outputParameters) {
    this.outputParameters = outputParameters;
  }


  public WorkflowSetRequest phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSetRequest ioArgoprojWorkflowV1alpha1WorkflowSetRequest = (WorkflowSetRequest) o;
    return Objects.equals(this.message, ioArgoprojWorkflowV1alpha1WorkflowSetRequest.message) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1WorkflowSetRequest.name) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1WorkflowSetRequest.namespace) &&
        Objects.equals(this.nodeFieldSelector, ioArgoprojWorkflowV1alpha1WorkflowSetRequest.nodeFieldSelector) &&
        Objects.equals(this.outputParameters, ioArgoprojWorkflowV1alpha1WorkflowSetRequest.outputParameters) &&
        Objects.equals(this.phase, ioArgoprojWorkflowV1alpha1WorkflowSetRequest.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, name, namespace, nodeFieldSelector, outputParameters, phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSetRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nodeFieldSelector: ").append(toIndentedString(nodeFieldSelector)).append("\n");
    sb.append("    outputParameters: ").append(toIndentedString(outputParameters)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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


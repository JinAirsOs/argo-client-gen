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
import io.argoproj.workflow.v1alpha.ArtifactLocation;
import io.argoproj.workflow.v1alpha.TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ArgoWorkflowTrigger
 */

public class ArgoWorkflowTrigger {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ArtifactLocation source;


  public ArgoWorkflowTrigger args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public ArgoWorkflowTrigger addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public ArgoWorkflowTrigger operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ArgoWorkflowTrigger parameters(List<TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public ArgoWorkflowTrigger addParametersItem(TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public ArgoWorkflowTrigger source(ArtifactLocation source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactLocation getSource() {
    return source;
  }


  public void setSource(ArtifactLocation source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArgoWorkflowTrigger ioArgoprojEventsV1alpha1ArgoWorkflowTrigger = (ArgoWorkflowTrigger) o;
    return Objects.equals(this.args, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.args) &&
        Objects.equals(this.operation, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.operation) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.parameters) &&
        Objects.equals(this.source, ioArgoprojEventsV1alpha1ArgoWorkflowTrigger.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, operation, parameters, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArgoWorkflowTrigger {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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


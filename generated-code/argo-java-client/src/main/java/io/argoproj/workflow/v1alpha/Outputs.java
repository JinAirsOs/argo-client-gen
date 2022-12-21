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
import io.argoproj.workflow.v1alpha.Artifact;
import io.argoproj.workflow.v1alpha.Parameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Outputs hold parameters, artifacts, and results from a step
 */
@ApiModel(description = "Outputs hold parameters, artifacts, and results from a step")

public class Outputs {
  public static final String SERIALIZED_NAME_ARTIFACTS = "artifacts";
  @SerializedName(SERIALIZED_NAME_ARTIFACTS)
  private List<Artifact> artifacts = null;

  public static final String SERIALIZED_NAME_EXIT_CODE = "exitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private String exitCode;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<Parameter> parameters = null;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;


  public Outputs artifacts(List<Artifact> artifacts) {
    
    this.artifacts = artifacts;
    return this;
  }

  public Outputs addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<Artifact>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * Artifacts holds the list of output artifacts produced by a step
   * @return artifacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Artifacts holds the list of output artifacts produced by a step")

  public List<Artifact> getArtifacts() {
    return artifacts;
  }


  public void setArtifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
  }


  public Outputs exitCode(String exitCode) {
    
    this.exitCode = exitCode;
    return this;
  }

   /**
   * ExitCode holds the exit code of a script template
   * @return exitCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExitCode holds the exit code of a script template")

  public String getExitCode() {
    return exitCode;
  }


  public void setExitCode(String exitCode) {
    this.exitCode = exitCode;
  }


  public Outputs parameters(List<Parameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public Outputs addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<Parameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters holds the list of output parameters produced by a step
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters holds the list of output parameters produced by a step")

  public List<Parameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }


  public Outputs result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * Result holds the result (stdout) of a script template
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result holds the result (stdout) of a script template")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
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
    Outputs ioArgoprojWorkflowV1alpha1Outputs = (Outputs) o;
    return Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1Outputs.artifacts) &&
        Objects.equals(this.exitCode, ioArgoprojWorkflowV1alpha1Outputs.exitCode) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1Outputs.parameters) &&
        Objects.equals(this.result, ioArgoprojWorkflowV1alpha1Outputs.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, exitCode, parameters, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outputs {\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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


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
import io.argoproj.workflow.v1alpha.AbstractStep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Expand
 */

public class Expand {
  public static final String SERIALIZED_NAME_ABSTRACT_STEP = "abstractStep";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_STEP)
  private AbstractStep abstractStep;


  public Expand abstractStep(AbstractStep abstractStep) {
    
    this.abstractStep = abstractStep;
    return this;
  }

   /**
   * Get abstractStep
   * @return abstractStep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbstractStep getAbstractStep() {
    return abstractStep;
  }


  public void setAbstractStep(AbstractStep abstractStep) {
    this.abstractStep = abstractStep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expand githubComArgoprojLabsArgoDataflowApiV1alpha1Expand = (Expand) o;
    return Objects.equals(this.abstractStep, githubComArgoprojLabsArgoDataflowApiV1alpha1Expand.abstractStep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractStep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expand {\n");
    sb.append("    abstractStep: ").append(toIndentedString(abstractStep)).append("\n");
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


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
import io.argoproj.workflow.v1alpha.LabelValueFrom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowMetadata
 */

public class WorkflowMetadata {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_LABELS_FROM = "labelsFrom";
  @SerializedName(SERIALIZED_NAME_LABELS_FROM)
  private Map<String, LabelValueFrom> labelsFrom = null;


  public WorkflowMetadata annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public WorkflowMetadata putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public WorkflowMetadata labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public WorkflowMetadata putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public WorkflowMetadata labelsFrom(Map<String, LabelValueFrom> labelsFrom) {
    
    this.labelsFrom = labelsFrom;
    return this;
  }

  public WorkflowMetadata putLabelsFromItem(String key, LabelValueFrom labelsFromItem) {
    if (this.labelsFrom == null) {
      this.labelsFrom = new HashMap<String, LabelValueFrom>();
    }
    this.labelsFrom.put(key, labelsFromItem);
    return this;
  }

   /**
   * Get labelsFrom
   * @return labelsFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, LabelValueFrom> getLabelsFrom() {
    return labelsFrom;
  }


  public void setLabelsFrom(Map<String, LabelValueFrom> labelsFrom) {
    this.labelsFrom = labelsFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowMetadata ioArgoprojWorkflowV1alpha1WorkflowMetadata = (WorkflowMetadata) o;
    return Objects.equals(this.annotations, ioArgoprojWorkflowV1alpha1WorkflowMetadata.annotations) &&
        Objects.equals(this.labels, ioArgoprojWorkflowV1alpha1WorkflowMetadata.labels) &&
        Objects.equals(this.labelsFrom, ioArgoprojWorkflowV1alpha1WorkflowMetadata.labelsFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, labels, labelsFrom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowMetadata {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    labelsFrom: ").append(toIndentedString(labelsFrom)).append("\n");
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


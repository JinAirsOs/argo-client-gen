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
import io.argoproj.workflow.v1alpha.ArtifactResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ArtifactResultNodeStatus describes the result of the deletion on a given node
 */
@ApiModel(description = "ArtifactResultNodeStatus describes the result of the deletion on a given node")

public class ArtifactResultNodeStatus {
  public static final String SERIALIZED_NAME_ARTIFACT_RESULTS = "artifactResults";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_RESULTS)
  private Map<String, ArtifactResult> artifactResults = null;


  public ArtifactResultNodeStatus artifactResults(Map<String, ArtifactResult> artifactResults) {
    
    this.artifactResults = artifactResults;
    return this;
  }

  public ArtifactResultNodeStatus putArtifactResultsItem(String key, ArtifactResult artifactResultsItem) {
    if (this.artifactResults == null) {
      this.artifactResults = new HashMap<String, ArtifactResult>();
    }
    this.artifactResults.put(key, artifactResultsItem);
    return this;
  }

   /**
   * ArtifactResults maps Artifact name to result of the deletion
   * @return artifactResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArtifactResults maps Artifact name to result of the deletion")

  public Map<String, ArtifactResult> getArtifactResults() {
    return artifactResults;
  }


  public void setArtifactResults(Map<String, ArtifactResult> artifactResults) {
    this.artifactResults = artifactResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactResultNodeStatus ioArgoprojWorkflowV1alpha1ArtifactResultNodeStatus = (ArtifactResultNodeStatus) o;
    return Objects.equals(this.artifactResults, ioArgoprojWorkflowV1alpha1ArtifactResultNodeStatus.artifactResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactResultNodeStatus {\n");
    sb.append("    artifactResults: ").append(toIndentedString(artifactResults)).append("\n");
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


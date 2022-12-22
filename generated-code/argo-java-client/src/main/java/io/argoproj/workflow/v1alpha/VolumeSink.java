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
import io.argoproj.workflow.v1alpha.AbstractVolumeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VolumeSink
 */

public class VolumeSink {
  public static final String SERIALIZED_NAME_ABSTRACT_VOLUME_SOURCE = "abstractVolumeSource";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_VOLUME_SOURCE)
  private AbstractVolumeSource abstractVolumeSource;


  public VolumeSink abstractVolumeSource(AbstractVolumeSource abstractVolumeSource) {
    
    this.abstractVolumeSource = abstractVolumeSource;
    return this;
  }

   /**
   * Get abstractVolumeSource
   * @return abstractVolumeSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbstractVolumeSource getAbstractVolumeSource() {
    return abstractVolumeSource;
  }


  public void setAbstractVolumeSource(AbstractVolumeSource abstractVolumeSource) {
    this.abstractVolumeSource = abstractVolumeSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeSink githubComArgoprojLabsArgoDataflowApiV1alpha1VolumeSink = (VolumeSink) o;
    return Objects.equals(this.abstractVolumeSource, githubComArgoprojLabsArgoDataflowApiV1alpha1VolumeSink.abstractVolumeSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractVolumeSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeSink {\n");
    sb.append("    abstractVolumeSource: ").append(toIndentedString(abstractVolumeSource)).append("\n");
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


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
 * BitbucketRepository
 */

public class BitbucketRepository {
  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_REPOSITORY_SLUG = "repositorySlug";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SLUG)
  private String repositorySlug;


  public BitbucketRepository owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public BitbucketRepository repositorySlug(String repositorySlug) {
    
    this.repositorySlug = repositorySlug;
    return this;
  }

   /**
   * Get repositorySlug
   * @return repositorySlug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRepositorySlug() {
    return repositorySlug;
  }


  public void setRepositorySlug(String repositorySlug) {
    this.repositorySlug = repositorySlug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitbucketRepository ioArgoprojEventsV1alpha1BitbucketRepository = (BitbucketRepository) o;
    return Objects.equals(this.owner, ioArgoprojEventsV1alpha1BitbucketRepository.owner) &&
        Objects.equals(this.repositorySlug, ioArgoprojEventsV1alpha1BitbucketRepository.repositorySlug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, repositorySlug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitbucketRepository {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
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


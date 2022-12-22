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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * SynchronizationStatus stores the status of semaphore and mutex.
 */
@ApiModel(description = "SynchronizationStatus stores the status of semaphore and mutex.")

public class SynchronizationStatus {
  public static final String SERIALIZED_NAME_MUTEX = "mutex";
  @SerializedName(SERIALIZED_NAME_MUTEX)
  private MutexStatus mutex;

  public static final String SERIALIZED_NAME_SEMAPHORE = "semaphore";
  @SerializedName(SERIALIZED_NAME_SEMAPHORE)
  private SemaphoreStatus semaphore;


  public SynchronizationStatus mutex(MutexStatus mutex) {
    
    this.mutex = mutex;
    return this;
  }

   /**
   * Get mutex
   * @return mutex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MutexStatus getMutex() {
    return mutex;
  }


  public void setMutex(MutexStatus mutex) {
    this.mutex = mutex;
  }


  public SynchronizationStatus semaphore(SemaphoreStatus semaphore) {
    
    this.semaphore = semaphore;
    return this;
  }

   /**
   * Get semaphore
   * @return semaphore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SemaphoreStatus getSemaphore() {
    return semaphore;
  }


  public void setSemaphore(SemaphoreStatus semaphore) {
    this.semaphore = semaphore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynchronizationStatus ioArgoprojWorkflowV1alpha1SynchronizationStatus = (SynchronizationStatus) o;
    return Objects.equals(this.mutex, ioArgoprojWorkflowV1alpha1SynchronizationStatus.mutex) &&
        Objects.equals(this.semaphore, ioArgoprojWorkflowV1alpha1SynchronizationStatus.semaphore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mutex, semaphore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynchronizationStatus {\n");
    sb.append("    mutex: ").append(toIndentedString(mutex)).append("\n");
    sb.append("    semaphore: ").append(toIndentedString(semaphore)).append("\n");
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


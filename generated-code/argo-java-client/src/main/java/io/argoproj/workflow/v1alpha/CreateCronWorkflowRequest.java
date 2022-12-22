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
 * CreateCronWorkflowRequest
 */

public class CreateCronWorkflowRequest {
  public static final String SERIALIZED_NAME_CREATE_OPTIONS = "createOptions";
  @SerializedName(SERIALIZED_NAME_CREATE_OPTIONS)
  private CreateOptions createOptions;

  public static final String SERIALIZED_NAME_CRON_WORKFLOW = "cronWorkflow";
  @SerializedName(SERIALIZED_NAME_CRON_WORKFLOW)
  private CronWorkflow cronWorkflow;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public CreateCronWorkflowRequest createOptions(CreateOptions createOptions) {
    
    this.createOptions = createOptions;
    return this;
  }

   /**
   * Get createOptions
   * @return createOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateOptions getCreateOptions() {
    return createOptions;
  }


  public void setCreateOptions(CreateOptions createOptions) {
    this.createOptions = createOptions;
  }


  public CreateCronWorkflowRequest cronWorkflow(CronWorkflow cronWorkflow) {
    
    this.cronWorkflow = cronWorkflow;
    return this;
  }

   /**
   * Get cronWorkflow
   * @return cronWorkflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CronWorkflow getCronWorkflow() {
    return cronWorkflow;
  }


  public void setCronWorkflow(CronWorkflow cronWorkflow) {
    this.cronWorkflow = cronWorkflow;
  }


  public CreateCronWorkflowRequest namespace(String namespace) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCronWorkflowRequest ioArgoprojWorkflowV1alpha1CreateCronWorkflowRequest = (CreateCronWorkflowRequest) o;
    return Objects.equals(this.createOptions, ioArgoprojWorkflowV1alpha1CreateCronWorkflowRequest.createOptions) &&
        Objects.equals(this.cronWorkflow, ioArgoprojWorkflowV1alpha1CreateCronWorkflowRequest.cronWorkflow) &&
        Objects.equals(this.namespace, ioArgoprojWorkflowV1alpha1CreateCronWorkflowRequest.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOptions, cronWorkflow, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCronWorkflowRequest {\n");
    sb.append("    createOptions: ").append(toIndentedString(createOptions)).append("\n");
    sb.append("    cronWorkflow: ").append(toIndentedString(cronWorkflow)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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


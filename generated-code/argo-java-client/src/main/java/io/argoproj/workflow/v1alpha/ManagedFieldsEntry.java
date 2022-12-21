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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.
 */
@ApiModel(description = "ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that the fieldset applies to.")

public class ManagedFieldsEntry {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELDS_TYPE = "fieldsType";
  @SerializedName(SERIALIZED_NAME_FIELDS_TYPE)
  private String fieldsType;

  public static final String SERIALIZED_NAME_FIELDS_V1 = "fieldsV1";
  @SerializedName(SERIALIZED_NAME_FIELDS_V1)
  private Object fieldsV1;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private String manager;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_SUBRESOURCE = "subresource";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCE)
  private String subresource;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private DateTime time;


  public ManagedFieldsEntry apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the version of this resource that this field set applies to. The format is \&quot;group/version\&quot; just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the version of this resource that this field set applies to. The format is \"group/version\" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ManagedFieldsEntry fieldsType(String fieldsType) {
    
    this.fieldsType = fieldsType;
    return this;
  }

   /**
   * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \&quot;FieldsV1\&quot;
   * @return fieldsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: \"FieldsV1\"")

  public String getFieldsType() {
    return fieldsType;
  }


  public void setFieldsType(String fieldsType) {
    this.fieldsType = fieldsType;
  }


  public ManagedFieldsEntry fieldsV1(Object fieldsV1) {
    
    this.fieldsV1 = fieldsV1;
    return this;
  }

   /**
   * FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.  Each key is either a &#39;.&#39; representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: &#39;f:&lt;name&gt;&#39;, where &lt;name&gt; is the name of a field in a struct, or key in a map &#39;v:&lt;value&gt;&#39;, where &lt;value&gt; is the exact json formatted value of a list item &#39;i:&lt;index&gt;&#39;, where &lt;index&gt; is position of a item in a list &#39;k:&lt;keys&gt;&#39;, where &lt;keys&gt; is a map of  a list item&#39;s key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.  The exact format is defined in sigs.k8s.io/structured-merge-diff
   * @return fieldsV1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FieldsV1 stores a set of fields in a data structure like a Trie, in JSON format.  Each key is either a '.' representing the field itself, and will always map to an empty set, or a string representing a sub-field or item. The string will follow one of these four formats: 'f:<name>', where <name> is the name of a field in a struct, or key in a map 'v:<value>', where <value> is the exact json formatted value of a list item 'i:<index>', where <index> is position of a item in a list 'k:<keys>', where <keys> is a map of  a list item's key fields to their unique values If a key maps to an empty Fields value, the field that key represents is part of the set.  The exact format is defined in sigs.k8s.io/structured-merge-diff")

  public Object getFieldsV1() {
    return fieldsV1;
  }


  public void setFieldsV1(Object fieldsV1) {
    this.fieldsV1 = fieldsV1;
  }


  public ManagedFieldsEntry manager(String manager) {
    
    this.manager = manager;
    return this;
  }

   /**
   * Manager is an identifier of the workflow managing these fields.
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manager is an identifier of the workflow managing these fields.")

  public String getManager() {
    return manager;
  }


  public void setManager(String manager) {
    this.manager = manager;
  }


  public ManagedFieldsEntry operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are &#39;Apply&#39; and &#39;Update&#39;.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ManagedFieldsEntry subresource(String subresource) {
    
    this.subresource = subresource;
    return this;
  }

   /**
   * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
   * @return subresource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.")

  public String getSubresource() {
    return subresource;
  }


  public void setSubresource(String subresource) {
    this.subresource = subresource;
  }


  public ManagedFieldsEntry time(DateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")

  public DateTime getTime() {
    return time;
  }


  public void setTime(DateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedFieldsEntry ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry = (ManagedFieldsEntry) o;
    return Objects.equals(this.apiVersion, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.apiVersion) &&
        Objects.equals(this.fieldsType, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.fieldsType) &&
        Objects.equals(this.fieldsV1, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.fieldsV1) &&
        Objects.equals(this.manager, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.manager) &&
        Objects.equals(this.operation, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.operation) &&
        Objects.equals(this.subresource, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.subresource) &&
        Objects.equals(this.time, ioK8sApimachineryPkgApisMetaV1ManagedFieldsEntry.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedFieldsEntry {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
    sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    subresource: ").append(toIndentedString(subresource)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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


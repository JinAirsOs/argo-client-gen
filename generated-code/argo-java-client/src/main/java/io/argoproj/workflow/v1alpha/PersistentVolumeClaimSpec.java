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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 */
@ApiModel(description = "PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")

public class PersistentVolumeClaimSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private TypedLocalObjectReference dataSource;

  public static final String SERIALIZED_NAME_DATA_SOURCE_REF = "dataSourceRef";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_REF)
  private TypedLocalObjectReference dataSourceRef;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1ResourceRequirements resources;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private LabelSelector selector;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;


  public PersistentVolumeClaimSpec accessModes(List<String> accessModes) {
    
    this.accessModes = accessModes;
    return this;
  }

  public PersistentVolumeClaimSpec addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<String>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")

  public List<String> getAccessModes() {
    return accessModes;
  }


  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public PersistentVolumeClaimSpec dataSource(TypedLocalObjectReference dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypedLocalObjectReference getDataSource() {
    return dataSource;
  }


  public void setDataSource(TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
  }


  public PersistentVolumeClaimSpec dataSourceRef(TypedLocalObjectReference dataSourceRef) {
    
    this.dataSourceRef = dataSourceRef;
    return this;
  }

   /**
   * Get dataSourceRef
   * @return dataSourceRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypedLocalObjectReference getDataSourceRef() {
    return dataSourceRef;
  }


  public void setDataSourceRef(TypedLocalObjectReference dataSourceRef) {
    this.dataSourceRef = dataSourceRef;
  }


  public PersistentVolumeClaimSpec resources(V1ResourceRequirements resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ResourceRequirements getResources() {
    return resources;
  }


  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }


  public PersistentVolumeClaimSpec selector(LabelSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LabelSelector getSelector() {
    return selector;
  }


  public void setSelector(LabelSelector selector) {
    this.selector = selector;
  }


  public PersistentVolumeClaimSpec storageClassName(String storageClassName) {
    
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")

  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public PersistentVolumeClaimSpec volumeMode(String volumeMode) {
    
    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
   * @return volumeMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")

  public String getVolumeMode() {
    return volumeMode;
  }


  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }


  public PersistentVolumeClaimSpec volumeName(String volumeName) {
    
    this.volumeName = volumeName;
    return this;
  }

   /**
   * VolumeName is the binding reference to the PersistentVolume backing this claim.
   * @return volumeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VolumeName is the binding reference to the PersistentVolume backing this claim.")

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistentVolumeClaimSpec ioK8sApiCoreV1PersistentVolumeClaimSpec = (PersistentVolumeClaimSpec) o;
    return Objects.equals(this.accessModes, ioK8sApiCoreV1PersistentVolumeClaimSpec.accessModes) &&
        Objects.equals(this.dataSource, ioK8sApiCoreV1PersistentVolumeClaimSpec.dataSource) &&
        Objects.equals(this.dataSourceRef, ioK8sApiCoreV1PersistentVolumeClaimSpec.dataSourceRef) &&
        Objects.equals(this.resources, ioK8sApiCoreV1PersistentVolumeClaimSpec.resources) &&
        Objects.equals(this.selector, ioK8sApiCoreV1PersistentVolumeClaimSpec.selector) &&
        Objects.equals(this.storageClassName, ioK8sApiCoreV1PersistentVolumeClaimSpec.storageClassName) &&
        Objects.equals(this.volumeMode, ioK8sApiCoreV1PersistentVolumeClaimSpec.volumeMode) &&
        Objects.equals(this.volumeName, ioK8sApiCoreV1PersistentVolumeClaimSpec.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, dataSource, dataSourceRef, resources, selector, storageClassName, volumeMode, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistentVolumeClaimSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    dataSourceRef: ").append(toIndentedString(dataSourceRef)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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


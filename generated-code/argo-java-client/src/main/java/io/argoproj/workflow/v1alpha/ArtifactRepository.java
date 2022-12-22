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
 * ArtifactRepository represents an artifact repository in which a controller will store its artifacts
 */
@ApiModel(description = "ArtifactRepository represents an artifact repository in which a controller will store its artifacts")

public class ArtifactRepository {
  public static final String SERIALIZED_NAME_ARCHIVE_LOGS = "archiveLogs";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOGS)
  private Boolean archiveLogs;

  public static final String SERIALIZED_NAME_ARTIFACTORY = "artifactory";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY)
  private ArtifactoryArtifactRepository artifactory;

  public static final String SERIALIZED_NAME_AZURE = "azure";
  @SerializedName(SERIALIZED_NAME_AZURE)
  private AzureArtifactRepository azure;

  public static final String SERIALIZED_NAME_GCS = "gcs";
  @SerializedName(SERIALIZED_NAME_GCS)
  private GCSArtifactRepository gcs;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private HDFSArtifactRepository hdfs;

  public static final String SERIALIZED_NAME_OSS = "oss";
  @SerializedName(SERIALIZED_NAME_OSS)
  private OSSArtifactRepository oss;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  private S3ArtifactRepository s3;


  public ArtifactRepository archiveLogs(Boolean archiveLogs) {
    
    this.archiveLogs = archiveLogs;
    return this;
  }

   /**
   * ArchiveLogs enables log archiving
   * @return archiveLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArchiveLogs enables log archiving")

  public Boolean getArchiveLogs() {
    return archiveLogs;
  }


  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }


  public ArtifactRepository artifactory(ArtifactoryArtifactRepository artifactory) {
    
    this.artifactory = artifactory;
    return this;
  }

   /**
   * Get artifactory
   * @return artifactory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactoryArtifactRepository getArtifactory() {
    return artifactory;
  }


  public void setArtifactory(ArtifactoryArtifactRepository artifactory) {
    this.artifactory = artifactory;
  }


  public ArtifactRepository azure(AzureArtifactRepository azure) {
    
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureArtifactRepository getAzure() {
    return azure;
  }


  public void setAzure(AzureArtifactRepository azure) {
    this.azure = azure;
  }


  public ArtifactRepository gcs(GCSArtifactRepository gcs) {
    
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GCSArtifactRepository getGcs() {
    return gcs;
  }


  public void setGcs(GCSArtifactRepository gcs) {
    this.gcs = gcs;
  }


  public ArtifactRepository hdfs(HDFSArtifactRepository hdfs) {
    
    this.hdfs = hdfs;
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HDFSArtifactRepository getHdfs() {
    return hdfs;
  }


  public void setHdfs(HDFSArtifactRepository hdfs) {
    this.hdfs = hdfs;
  }


  public ArtifactRepository oss(OSSArtifactRepository oss) {
    
    this.oss = oss;
    return this;
  }

   /**
   * Get oss
   * @return oss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OSSArtifactRepository getOss() {
    return oss;
  }


  public void setOss(OSSArtifactRepository oss) {
    this.oss = oss;
  }


  public ArtifactRepository s3(S3ArtifactRepository s3) {
    
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public S3ArtifactRepository getS3() {
    return s3;
  }


  public void setS3(S3ArtifactRepository s3) {
    this.s3 = s3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactRepository ioArgoprojWorkflowV1alpha1ArtifactRepository = (ArtifactRepository) o;
    return Objects.equals(this.archiveLogs, ioArgoprojWorkflowV1alpha1ArtifactRepository.archiveLogs) &&
        Objects.equals(this.artifactory, ioArgoprojWorkflowV1alpha1ArtifactRepository.artifactory) &&
        Objects.equals(this.azure, ioArgoprojWorkflowV1alpha1ArtifactRepository.azure) &&
        Objects.equals(this.gcs, ioArgoprojWorkflowV1alpha1ArtifactRepository.gcs) &&
        Objects.equals(this.hdfs, ioArgoprojWorkflowV1alpha1ArtifactRepository.hdfs) &&
        Objects.equals(this.oss, ioArgoprojWorkflowV1alpha1ArtifactRepository.oss) &&
        Objects.equals(this.s3, ioArgoprojWorkflowV1alpha1ArtifactRepository.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveLogs, artifactory, azure, gcs, hdfs, oss, s3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactRepository {\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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


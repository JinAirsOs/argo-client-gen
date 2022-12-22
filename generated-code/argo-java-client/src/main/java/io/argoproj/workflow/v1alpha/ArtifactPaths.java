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
 * ArtifactPaths expands a step from a collection of artifacts
 */
@ApiModel(description = "ArtifactPaths expands a step from a collection of artifacts")

public class ArtifactPaths {
  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private ArchiveStrategy archive;

  public static final String SERIALIZED_NAME_ARCHIVE_LOGS = "archiveLogs";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOGS)
  private Boolean archiveLogs;

  public static final String SERIALIZED_NAME_ARTIFACT_G_C = "artifactGC";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_G_C)
  private ArtifactGC artifactGC;

  public static final String SERIALIZED_NAME_ARTIFACTORY = "artifactory";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY)
  private ArtifactoryArtifact artifactory;

  public static final String SERIALIZED_NAME_AZURE = "azure";
  @SerializedName(SERIALIZED_NAME_AZURE)
  private AzureArtifact azure;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_FROM_EXPRESSION = "fromExpression";
  @SerializedName(SERIALIZED_NAME_FROM_EXPRESSION)
  private String fromExpression;

  public static final String SERIALIZED_NAME_GCS = "gcs";
  @SerializedName(SERIALIZED_NAME_GCS)
  private GCSArtifact gcs;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private GitArtifact git;

  public static final String SERIALIZED_NAME_GLOBAL_NAME = "globalName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_NAME)
  private String globalName;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private HDFSArtifact hdfs;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private HTTPArtifact http;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_OSS = "oss";
  @SerializedName(SERIALIZED_NAME_OSS)
  private OSSArtifact oss;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private RawArtifact raw;

  public static final String SERIALIZED_NAME_RECURSE_MODE = "recurseMode";
  @SerializedName(SERIALIZED_NAME_RECURSE_MODE)
  private Boolean recurseMode;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  private S3Artifact s3;

  public static final String SERIALIZED_NAME_SUB_PATH = "subPath";
  @SerializedName(SERIALIZED_NAME_SUB_PATH)
  private String subPath;


  public ArtifactPaths archive(ArchiveStrategy archive) {
    
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArchiveStrategy getArchive() {
    return archive;
  }


  public void setArchive(ArchiveStrategy archive) {
    this.archive = archive;
  }


  public ArtifactPaths archiveLogs(Boolean archiveLogs) {
    
    this.archiveLogs = archiveLogs;
    return this;
  }

   /**
   * ArchiveLogs indicates if the container logs should be archived
   * @return archiveLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArchiveLogs indicates if the container logs should be archived")

  public Boolean getArchiveLogs() {
    return archiveLogs;
  }


  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }


  public ArtifactPaths artifactGC(ArtifactGC artifactGC) {
    
    this.artifactGC = artifactGC;
    return this;
  }

   /**
   * Get artifactGC
   * @return artifactGC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactGC getArtifactGC() {
    return artifactGC;
  }


  public void setArtifactGC(ArtifactGC artifactGC) {
    this.artifactGC = artifactGC;
  }


  public ArtifactPaths artifactory(ArtifactoryArtifact artifactory) {
    
    this.artifactory = artifactory;
    return this;
  }

   /**
   * Get artifactory
   * @return artifactory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactoryArtifact getArtifactory() {
    return artifactory;
  }


  public void setArtifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
  }


  public ArtifactPaths azure(AzureArtifact azure) {
    
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureArtifact getAzure() {
    return azure;
  }


  public void setAzure(AzureArtifact azure) {
    this.azure = azure;
  }


  public ArtifactPaths deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Has this been deleted?
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Has this been deleted?")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public ArtifactPaths from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * From allows an artifact to reference an artifact from a previous step
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "From allows an artifact to reference an artifact from a previous step")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public ArtifactPaths fromExpression(String fromExpression) {
    
    this.fromExpression = fromExpression;
    return this;
  }

   /**
   * FromExpression, if defined, is evaluated to specify the value for the artifact
   * @return fromExpression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FromExpression, if defined, is evaluated to specify the value for the artifact")

  public String getFromExpression() {
    return fromExpression;
  }


  public void setFromExpression(String fromExpression) {
    this.fromExpression = fromExpression;
  }


  public ArtifactPaths gcs(GCSArtifact gcs) {
    
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GCSArtifact getGcs() {
    return gcs;
  }


  public void setGcs(GCSArtifact gcs) {
    this.gcs = gcs;
  }


  public ArtifactPaths git(GitArtifact git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GitArtifact getGit() {
    return git;
  }


  public void setGit(GitArtifact git) {
    this.git = git;
  }


  public ArtifactPaths globalName(String globalName) {
    
    this.globalName = globalName;
    return this;
  }

   /**
   * GlobalName exports an output artifact to the global scope, making it available as &#39;{{io.argoproj.workflow.v1alpha1.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts
   * @return globalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GlobalName exports an output artifact to the global scope, making it available as '{{io.argoproj.workflow.v1alpha1.outputs.artifacts.XXXX}} and in workflow.status.outputs.artifacts")

  public String getGlobalName() {
    return globalName;
  }


  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }


  public ArtifactPaths hdfs(HDFSArtifact hdfs) {
    
    this.hdfs = hdfs;
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HDFSArtifact getHdfs() {
    return hdfs;
  }


  public void setHdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
  }


  public ArtifactPaths http(HTTPArtifact http) {
    
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HTTPArtifact getHttp() {
    return http;
  }


  public void setHttp(HTTPArtifact http) {
    this.http = http;
  }


  public ArtifactPaths mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mode bits to use on this file, must be a value between 0 and 0777 set when loading input artifacts.")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public ArtifactPaths name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the artifact. must be unique within a template&#39;s inputs/outputs.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name of the artifact. must be unique within a template's inputs/outputs.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ArtifactPaths optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Make Artifacts optional, if Artifacts doesn&#39;t generate or exist
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Make Artifacts optional, if Artifacts doesn't generate or exist")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public ArtifactPaths oss(OSSArtifact oss) {
    
    this.oss = oss;
    return this;
  }

   /**
   * Get oss
   * @return oss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OSSArtifact getOss() {
    return oss;
  }


  public void setOss(OSSArtifact oss) {
    this.oss = oss;
  }


  public ArtifactPaths path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is the container path to the artifact
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path is the container path to the artifact")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ArtifactPaths raw(RawArtifact raw) {
    
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RawArtifact getRaw() {
    return raw;
  }


  public void setRaw(RawArtifact raw) {
    this.raw = raw;
  }


  public ArtifactPaths recurseMode(Boolean recurseMode) {
    
    this.recurseMode = recurseMode;
    return this;
  }

   /**
   * If mode is set, apply the permission recursively into the artifact if it is a folder
   * @return recurseMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If mode is set, apply the permission recursively into the artifact if it is a folder")

  public Boolean getRecurseMode() {
    return recurseMode;
  }


  public void setRecurseMode(Boolean recurseMode) {
    this.recurseMode = recurseMode;
  }


  public ArtifactPaths s3(S3Artifact s3) {
    
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public S3Artifact getS3() {
    return s3;
  }


  public void setS3(S3Artifact s3) {
    this.s3 = s3;
  }


  public ArtifactPaths subPath(String subPath) {
    
    this.subPath = subPath;
    return this;
  }

   /**
   * SubPath allows an artifact to be sourced from a subpath within the specified source
   * @return subPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SubPath allows an artifact to be sourced from a subpath within the specified source")

  public String getSubPath() {
    return subPath;
  }


  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactPaths ioArgoprojWorkflowV1alpha1ArtifactPaths = (ArtifactPaths) o;
    return Objects.equals(this.archive, ioArgoprojWorkflowV1alpha1ArtifactPaths.archive) &&
        Objects.equals(this.archiveLogs, ioArgoprojWorkflowV1alpha1ArtifactPaths.archiveLogs) &&
        Objects.equals(this.artifactGC, ioArgoprojWorkflowV1alpha1ArtifactPaths.artifactGC) &&
        Objects.equals(this.artifactory, ioArgoprojWorkflowV1alpha1ArtifactPaths.artifactory) &&
        Objects.equals(this.azure, ioArgoprojWorkflowV1alpha1ArtifactPaths.azure) &&
        Objects.equals(this.deleted, ioArgoprojWorkflowV1alpha1ArtifactPaths.deleted) &&
        Objects.equals(this.from, ioArgoprojWorkflowV1alpha1ArtifactPaths.from) &&
        Objects.equals(this.fromExpression, ioArgoprojWorkflowV1alpha1ArtifactPaths.fromExpression) &&
        Objects.equals(this.gcs, ioArgoprojWorkflowV1alpha1ArtifactPaths.gcs) &&
        Objects.equals(this.git, ioArgoprojWorkflowV1alpha1ArtifactPaths.git) &&
        Objects.equals(this.globalName, ioArgoprojWorkflowV1alpha1ArtifactPaths.globalName) &&
        Objects.equals(this.hdfs, ioArgoprojWorkflowV1alpha1ArtifactPaths.hdfs) &&
        Objects.equals(this.http, ioArgoprojWorkflowV1alpha1ArtifactPaths.http) &&
        Objects.equals(this.mode, ioArgoprojWorkflowV1alpha1ArtifactPaths.mode) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1ArtifactPaths.name) &&
        Objects.equals(this.optional, ioArgoprojWorkflowV1alpha1ArtifactPaths.optional) &&
        Objects.equals(this.oss, ioArgoprojWorkflowV1alpha1ArtifactPaths.oss) &&
        Objects.equals(this.path, ioArgoprojWorkflowV1alpha1ArtifactPaths.path) &&
        Objects.equals(this.raw, ioArgoprojWorkflowV1alpha1ArtifactPaths.raw) &&
        Objects.equals(this.recurseMode, ioArgoprojWorkflowV1alpha1ArtifactPaths.recurseMode) &&
        Objects.equals(this.s3, ioArgoprojWorkflowV1alpha1ArtifactPaths.s3) &&
        Objects.equals(this.subPath, ioArgoprojWorkflowV1alpha1ArtifactPaths.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archive, archiveLogs, artifactGC, artifactory, azure, deleted, from, fromExpression, gcs, git, globalName, hdfs, http, mode, name, optional, oss, path, raw, recurseMode, s3, subPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactPaths {\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactGC: ").append(toIndentedString(artifactGC)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromExpression: ").append(toIndentedString(fromExpression)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    recurseMode: ").append(toIndentedString(recurseMode)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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


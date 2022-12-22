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
import io.argoproj.workflow.v1alpha.Cat;
import io.argoproj.workflow.v1alpha.Code;
import io.argoproj.workflow.v1alpha.Dedupe;
import io.argoproj.workflow.v1alpha.Expand;
import io.argoproj.workflow.v1alpha.Filter;
import io.argoproj.workflow.v1alpha.Flatten;
import io.argoproj.workflow.v1alpha.Git;
import io.argoproj.workflow.v1alpha.Group;
import io.argoproj.workflow.v1alpha.Metadata;
import io.argoproj.workflow.v1alpha.Scale;
import io.argoproj.workflow.v1alpha.Sidecar;
import io.argoproj.workflow.v1alpha.Sink;
import io.argoproj.workflow.v1alpha.Source;
import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1LocalObjectReference;
import io.kubernetes.client.models.V1Toleration;
import io.kubernetes.client.models.V1Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StepSpec
 */

public class StepSpec {
  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private V1Affinity affinity;

  public static final String SERIALIZED_NAME_CAT = "cat";
  @SerializedName(SERIALIZED_NAME_CAT)
  private Cat cat;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Code code;

  public static final String SERIALIZED_NAME_CONTAINER = "container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private V1Container container;

  public static final String SERIALIZED_NAME_DEDUPE = "dedupe";
  @SerializedName(SERIALIZED_NAME_DEDUPE)
  private Dedupe dedupe;

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private Expand expand;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private Filter filter;

  public static final String SERIALIZED_NAME_FLATTEN = "flatten";
  @SerializedName(SERIALIZED_NAME_FLATTEN)
  private Flatten flatten;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private Git git;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private Group group;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<V1LocalObjectReference> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_MAP = "map";
  @SerializedName(SERIALIZED_NAME_MAP)
  private Map map;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Metadata metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_RESTART_POLICY = "restartPolicy";
  @SerializedName(SERIALIZED_NAME_RESTART_POLICY)
  private String restartPolicy;

  public static final String SERIALIZED_NAME_SCALE = "scale";
  @SerializedName(SERIALIZED_NAME_SCALE)
  private Scale scale;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SIDECAR = "sidecar";
  @SerializedName(SERIALIZED_NAME_SIDECAR)
  private Sidecar sidecar;

  public static final String SERIALIZED_NAME_SINKS = "sinks";
  @SerializedName(SERIALIZED_NAME_SINKS)
  private List<Sink> sinks = null;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<Source> sources = null;

  public static final String SERIALIZED_NAME_TERMINATOR = "terminator";
  @SerializedName(SERIALIZED_NAME_TERMINATOR)
  private Boolean terminator;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1Volume> volumes = null;


  public StepSpec affinity(V1Affinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Affinity getAffinity() {
    return affinity;
  }


  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }


  public StepSpec cat(Cat cat) {
    
    this.cat = cat;
    return this;
  }

   /**
   * Get cat
   * @return cat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cat getCat() {
    return cat;
  }


  public void setCat(Cat cat) {
    this.cat = cat;
  }


  public StepSpec code(Code code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Code getCode() {
    return code;
  }


  public void setCode(Code code) {
    this.code = code;
  }


  public StepSpec container(V1Container container) {
    
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Container getContainer() {
    return container;
  }


  public void setContainer(V1Container container) {
    this.container = container;
  }


  public StepSpec dedupe(Dedupe dedupe) {
    
    this.dedupe = dedupe;
    return this;
  }

   /**
   * Get dedupe
   * @return dedupe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Dedupe getDedupe() {
    return dedupe;
  }


  public void setDedupe(Dedupe dedupe) {
    this.dedupe = dedupe;
  }


  public StepSpec expand(Expand expand) {
    
    this.expand = expand;
    return this;
  }

   /**
   * Get expand
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Expand getExpand() {
    return expand;
  }


  public void setExpand(Expand expand) {
    this.expand = expand;
  }


  public StepSpec filter(Filter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Filter getFilter() {
    return filter;
  }


  public void setFilter(Filter filter) {
    this.filter = filter;
  }


  public StepSpec flatten(Flatten flatten) {
    
    this.flatten = flatten;
    return this;
  }

   /**
   * Get flatten
   * @return flatten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Flatten getFlatten() {
    return flatten;
  }


  public void setFlatten(Flatten flatten) {
    this.flatten = flatten;
  }


  public StepSpec git(Git git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Git getGit() {
    return git;
  }


  public void setGit(Git git) {
    this.git = git;
  }


  public StepSpec group(Group group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Group getGroup() {
    return group;
  }


  public void setGroup(Group group) {
    this.group = group;
  }


  public StepSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public StepSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<V1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * Get imagePullSecrets
   * @return imagePullSecrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }


  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }


  public StepSpec map(Map map) {
    
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map getMap() {
    return map;
  }


  public void setMap(Map map) {
    this.map = map;
  }


  public StepSpec metadata(Metadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metadata getMetadata() {
    return metadata;
  }


  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }


  public StepSpec name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StepSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public StepSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public StepSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public StepSpec restartPolicy(String restartPolicy) {
    
    this.restartPolicy = restartPolicy;
    return this;
  }

   /**
   * Get restartPolicy
   * @return restartPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRestartPolicy() {
    return restartPolicy;
  }


  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }


  public StepSpec scale(Scale scale) {
    
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Scale getScale() {
    return scale;
  }


  public void setScale(Scale scale) {
    this.scale = scale;
  }


  public StepSpec serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * Get serviceAccountName
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public StepSpec sidecar(Sidecar sidecar) {
    
    this.sidecar = sidecar;
    return this;
  }

   /**
   * Get sidecar
   * @return sidecar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Sidecar getSidecar() {
    return sidecar;
  }


  public void setSidecar(Sidecar sidecar) {
    this.sidecar = sidecar;
  }


  public StepSpec sinks(List<Sink> sinks) {
    
    this.sinks = sinks;
    return this;
  }

  public StepSpec addSinksItem(Sink sinksItem) {
    if (this.sinks == null) {
      this.sinks = new ArrayList<Sink>();
    }
    this.sinks.add(sinksItem);
    return this;
  }

   /**
   * Get sinks
   * @return sinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Sink> getSinks() {
    return sinks;
  }


  public void setSinks(List<Sink> sinks) {
    this.sinks = sinks;
  }


  public StepSpec sources(List<Source> sources) {
    
    this.sources = sources;
    return this;
  }

  public StepSpec addSourcesItem(Source sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<Source>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * Get sources
   * @return sources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Source> getSources() {
    return sources;
  }


  public void setSources(List<Source> sources) {
    this.sources = sources;
  }


  public StepSpec terminator(Boolean terminator) {
    
    this.terminator = terminator;
    return this;
  }

   /**
   * Get terminator
   * @return terminator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTerminator() {
    return terminator;
  }


  public void setTerminator(Boolean terminator) {
    this.terminator = terminator;
  }


  public StepSpec tolerations(List<V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public StepSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Get tolerations
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public StepSpec volumes(List<V1Volume> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public StepSpec addVolumesItem(V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepSpec githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec = (StepSpec) o;
    return Objects.equals(this.affinity, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.affinity) &&
        Objects.equals(this.cat, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.cat) &&
        Objects.equals(this.code, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.code) &&
        Objects.equals(this.container, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.container) &&
        Objects.equals(this.dedupe, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.dedupe) &&
        Objects.equals(this.expand, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.expand) &&
        Objects.equals(this.filter, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.filter) &&
        Objects.equals(this.flatten, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.flatten) &&
        Objects.equals(this.git, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.git) &&
        Objects.equals(this.group, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.group) &&
        Objects.equals(this.imagePullSecrets, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.imagePullSecrets) &&
        Objects.equals(this.map, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.map) &&
        Objects.equals(this.metadata, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.metadata) &&
        Objects.equals(this.name, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.name) &&
        Objects.equals(this.nodeSelector, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.nodeSelector) &&
        Objects.equals(this.replicas, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.replicas) &&
        Objects.equals(this.restartPolicy, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.restartPolicy) &&
        Objects.equals(this.scale, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.scale) &&
        Objects.equals(this.serviceAccountName, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.serviceAccountName) &&
        Objects.equals(this.sidecar, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.sidecar) &&
        Objects.equals(this.sinks, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.sinks) &&
        Objects.equals(this.sources, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.sources) &&
        Objects.equals(this.terminator, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.terminator) &&
        Objects.equals(this.tolerations, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.tolerations) &&
        Objects.equals(this.volumes, githubComArgoprojLabsArgoDataflowApiV1alpha1StepSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, cat, code, container, dedupe, expand, filter, flatten, git, group, imagePullSecrets, map, metadata, name, nodeSelector, replicas, restartPolicy, scale, serviceAccountName, sidecar, sinks, sources, terminator, tolerations, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepSpec {\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    cat: ").append(toIndentedString(cat)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    dedupe: ").append(toIndentedString(dedupe)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    flatten: ").append(toIndentedString(flatten)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    sidecar: ").append(toIndentedString(sidecar)).append("\n");
    sb.append("    sinks: ").append(toIndentedString(sinks)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    terminator: ").append(toIndentedString(terminator)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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


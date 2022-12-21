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
import io.argoproj.workflow.v1alpha.PodDNSConfigOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 */
@ApiModel(description = "PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.")

public class V1PodDNSConfig {
  public static final String SERIALIZED_NAME_NAMESERVERS = "nameservers";
  @SerializedName(SERIALIZED_NAME_NAMESERVERS)
  private List<String> nameservers = null;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<PodDNSConfigOption> options = null;

  public static final String SERIALIZED_NAME_SEARCHES = "searches";
  @SerializedName(SERIALIZED_NAME_SEARCHES)
  private List<String> searches = null;


  public V1PodDNSConfig nameservers(List<String> nameservers) {
    
    this.nameservers = nameservers;
    return this;
  }

  public V1PodDNSConfig addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<String>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

   /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
   * @return nameservers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.")

  public List<String> getNameservers() {
    return nameservers;
  }


  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }


  public V1PodDNSConfig options(List<PodDNSConfigOption> options) {
    
    this.options = options;
    return this;
  }

  public V1PodDNSConfig addOptionsItem(PodDNSConfigOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<PodDNSConfigOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.")

  public List<PodDNSConfigOption> getOptions() {
    return options;
  }


  public void setOptions(List<PodDNSConfigOption> options) {
    this.options = options;
  }


  public V1PodDNSConfig searches(List<String> searches) {
    
    this.searches = searches;
    return this;
  }

  public V1PodDNSConfig addSearchesItem(String searchesItem) {
    if (this.searches == null) {
      this.searches = new ArrayList<String>();
    }
    this.searches.add(searchesItem);
    return this;
  }

   /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
   * @return searches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.")

  public List<String> getSearches() {
    return searches;
  }


  public void setSearches(List<String> searches) {
    this.searches = searches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PodDNSConfig ioK8sApiCoreV1PodDNSConfig = (V1PodDNSConfig) o;
    return Objects.equals(this.nameservers, ioK8sApiCoreV1PodDNSConfig.nameservers) &&
        Objects.equals(this.options, ioK8sApiCoreV1PodDNSConfig.options) &&
        Objects.equals(this.searches, ioK8sApiCoreV1PodDNSConfig.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, options, searches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodDNSConfig {\n");
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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


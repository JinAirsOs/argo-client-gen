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

import java.util.*;

/**
 * BitbucketServerEventSource
 */

public class BitbucketServerEventSource {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private V1SecretKeySelector accessToken;

  public static final String SERIALIZED_NAME_BITBUCKETSERVER_BASE_U_R_L = "bitbucketserverBaseURL";
  @SerializedName(SERIALIZED_NAME_BITBUCKETSERVER_BASE_U_R_L)
  private String bitbucketserverBaseURL;

  public static final String SERIALIZED_NAME_DELETE_HOOK_ON_FINISH = "deleteHookOnFinish";
  @SerializedName(SERIALIZED_NAME_DELETE_HOOK_ON_FINISH)
  private Boolean deleteHookOnFinish;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_PROJECT_KEY = "projectKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_KEY)
  private String projectKey;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<BitbucketServerRepository> repositories = null;

  public static final String SERIALIZED_NAME_REPOSITORY_SLUG = "repositorySlug";
  @SerializedName(SERIALIZED_NAME_REPOSITORY_SLUG)
  private String repositorySlug;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private WebhookContext webhook;

  public static final String SERIALIZED_NAME_WEBHOOK_SECRET = "webhookSecret";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_SECRET)
  private V1SecretKeySelector webhookSecret;


  public BitbucketServerEventSource accessToken(V1SecretKeySelector accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(V1SecretKeySelector accessToken) {
    this.accessToken = accessToken;
  }


  public BitbucketServerEventSource bitbucketserverBaseURL(String bitbucketserverBaseURL) {
    
    this.bitbucketserverBaseURL = bitbucketserverBaseURL;
    return this;
  }

   /**
   * Get bitbucketserverBaseURL
   * @return bitbucketserverBaseURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBitbucketserverBaseURL() {
    return bitbucketserverBaseURL;
  }


  public void setBitbucketserverBaseURL(String bitbucketserverBaseURL) {
    this.bitbucketserverBaseURL = bitbucketserverBaseURL;
  }


  public BitbucketServerEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
    
    this.deleteHookOnFinish = deleteHookOnFinish;
    return this;
  }

   /**
   * Get deleteHookOnFinish
   * @return deleteHookOnFinish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteHookOnFinish() {
    return deleteHookOnFinish;
  }


  public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
    this.deleteHookOnFinish = deleteHookOnFinish;
  }


  public BitbucketServerEventSource events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public BitbucketServerEventSource addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public BitbucketServerEventSource filter(EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(EventSourceFilter filter) {
    this.filter = filter;
  }


  public BitbucketServerEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public BitbucketServerEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public BitbucketServerEventSource projectKey(String projectKey) {
    
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Get projectKey
   * @return projectKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectKey() {
    return projectKey;
  }


  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }


  public BitbucketServerEventSource repositories(List<BitbucketServerRepository> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public BitbucketServerEventSource addRepositoriesItem(BitbucketServerRepository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<BitbucketServerRepository>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Get repositories
   * @return repositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BitbucketServerRepository> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<BitbucketServerRepository> repositories) {
    this.repositories = repositories;
  }


  public BitbucketServerEventSource repositorySlug(String repositorySlug) {
    
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


  public BitbucketServerEventSource webhook(WebhookContext webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookContext getWebhook() {
    return webhook;
  }


  public void setWebhook(WebhookContext webhook) {
    this.webhook = webhook;
  }


  public BitbucketServerEventSource webhookSecret(V1SecretKeySelector webhookSecret) {
    
    this.webhookSecret = webhookSecret;
    return this;
  }

   /**
   * Get webhookSecret
   * @return webhookSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getWebhookSecret() {
    return webhookSecret;
  }


  public void setWebhookSecret(V1SecretKeySelector webhookSecret) {
    this.webhookSecret = webhookSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitbucketServerEventSource ioArgoprojEventsV1alpha1BitbucketServerEventSource = (BitbucketServerEventSource) o;
    return Objects.equals(this.accessToken, ioArgoprojEventsV1alpha1BitbucketServerEventSource.accessToken) &&
        Objects.equals(this.bitbucketserverBaseURL, ioArgoprojEventsV1alpha1BitbucketServerEventSource.bitbucketserverBaseURL) &&
        Objects.equals(this.deleteHookOnFinish, ioArgoprojEventsV1alpha1BitbucketServerEventSource.deleteHookOnFinish) &&
        Objects.equals(this.events, ioArgoprojEventsV1alpha1BitbucketServerEventSource.events) &&
        Objects.equals(this.filter, ioArgoprojEventsV1alpha1BitbucketServerEventSource.filter) &&
        Objects.equals(this.metadata, ioArgoprojEventsV1alpha1BitbucketServerEventSource.metadata) &&
        Objects.equals(this.projectKey, ioArgoprojEventsV1alpha1BitbucketServerEventSource.projectKey) &&
        Objects.equals(this.repositories, ioArgoprojEventsV1alpha1BitbucketServerEventSource.repositories) &&
        Objects.equals(this.repositorySlug, ioArgoprojEventsV1alpha1BitbucketServerEventSource.repositorySlug) &&
        Objects.equals(this.webhook, ioArgoprojEventsV1alpha1BitbucketServerEventSource.webhook) &&
        Objects.equals(this.webhookSecret, ioArgoprojEventsV1alpha1BitbucketServerEventSource.webhookSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, bitbucketserverBaseURL, deleteHookOnFinish, events, filter, metadata, projectKey, repositories, repositorySlug, webhook, webhookSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitbucketServerEventSource {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    bitbucketserverBaseURL: ").append(toIndentedString(bitbucketserverBaseURL)).append("\n");
    sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    repositorySlug: ").append(toIndentedString(repositorySlug)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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


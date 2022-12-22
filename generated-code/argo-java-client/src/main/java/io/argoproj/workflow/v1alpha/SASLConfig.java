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
 * SASLConfig
 */

public class SASLConfig {
  public static final String SERIALIZED_NAME_MECHANISM = "mechanism";
  @SerializedName(SERIALIZED_NAME_MECHANISM)
  private String mechanism;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private V1SecretKeySelector password;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private V1SecretKeySelector user;


  public SASLConfig mechanism(String mechanism) {
    
    this.mechanism = mechanism;
    return this;
  }

   /**
   * Get mechanism
   * @return mechanism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMechanism() {
    return mechanism;
  }


  public void setMechanism(String mechanism) {
    this.mechanism = mechanism;
  }


  public SASLConfig password(V1SecretKeySelector password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getPassword() {
    return password;
  }


  public void setPassword(V1SecretKeySelector password) {
    this.password = password;
  }


  public SASLConfig user(V1SecretKeySelector user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getUser() {
    return user;
  }


  public void setUser(V1SecretKeySelector user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SASLConfig ioArgoprojEventsV1alpha1SASLConfig = (SASLConfig) o;
    return Objects.equals(this.mechanism, ioArgoprojEventsV1alpha1SASLConfig.mechanism) &&
        Objects.equals(this.password, ioArgoprojEventsV1alpha1SASLConfig.password) &&
        Objects.equals(this.user, ioArgoprojEventsV1alpha1SASLConfig.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanism, password, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SASLConfig {\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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


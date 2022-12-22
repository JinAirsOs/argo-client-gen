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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * StreamError
 */

public class StreamError {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<Any> details = null;

  public static final String SERIALIZED_NAME_GRPC_CODE = "grpc_code";
  @SerializedName(SERIALIZED_NAME_GRPC_CODE)
  private Integer grpcCode;

  public static final String SERIALIZED_NAME_HTTP_CODE = "http_code";
  @SerializedName(SERIALIZED_NAME_HTTP_CODE)
  private Integer httpCode;

  public static final String SERIALIZED_NAME_HTTP_STATUS = "http_status";
  @SerializedName(SERIALIZED_NAME_HTTP_STATUS)
  private String httpStatus;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public StreamError details(List<Any> details) {
    
    this.details = details;
    return this;
  }

  public StreamError addDetailsItem(Any detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Any>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Any> getDetails() {
    return details;
  }


  public void setDetails(List<Any> details) {
    this.details = details;
  }


  public StreamError grpcCode(Integer grpcCode) {
    
    this.grpcCode = grpcCode;
    return this;
  }

   /**
   * Get grpcCode
   * @return grpcCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGrpcCode() {
    return grpcCode;
  }


  public void setGrpcCode(Integer grpcCode) {
    this.grpcCode = grpcCode;
  }


  public StreamError httpCode(Integer httpCode) {
    
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHttpCode() {
    return httpCode;
  }


  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }


  public StreamError httpStatus(String httpStatus) {
    
    this.httpStatus = httpStatus;
    return this;
  }

   /**
   * Get httpStatus
   * @return httpStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHttpStatus() {
    return httpStatus;
  }


  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }


  public StreamError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamError grpcGatewayRuntimeStreamError = (StreamError) o;
    return Objects.equals(this.details, grpcGatewayRuntimeStreamError.details) &&
        Objects.equals(this.grpcCode, grpcGatewayRuntimeStreamError.grpcCode) &&
        Objects.equals(this.httpCode, grpcGatewayRuntimeStreamError.httpCode) &&
        Objects.equals(this.httpStatus, grpcGatewayRuntimeStreamError.httpStatus) &&
        Objects.equals(this.message, grpcGatewayRuntimeStreamError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, grpcCode, httpCode, httpStatus, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamError {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    grpcCode: ").append(toIndentedString(grpcCode)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


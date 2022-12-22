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
 * Prometheus is a prometheus metric to be emitted
 */
@ApiModel(description = "Prometheus is a prometheus metric to be emitted")

public class Prometheus {
  public static final String SERIALIZED_NAME_COUNTER = "counter";
  @SerializedName(SERIALIZED_NAME_COUNTER)
  private Counter counter;

  public static final String SERIALIZED_NAME_GAUGE = "gauge";
  @SerializedName(SERIALIZED_NAME_GAUGE)
  private Gauge gauge;

  public static final String SERIALIZED_NAME_HELP = "help";
  @SerializedName(SERIALIZED_NAME_HELP)
  private String help;

  public static final String SERIALIZED_NAME_HISTOGRAM = "histogram";
  @SerializedName(SERIALIZED_NAME_HISTOGRAM)
  private Histogram histogram;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<MetricLabel> labels = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private String when;


  public Prometheus counter(Counter counter) {
    
    this.counter = counter;
    return this;
  }

   /**
   * Get counter
   * @return counter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Counter getCounter() {
    return counter;
  }


  public void setCounter(Counter counter) {
    this.counter = counter;
  }


  public Prometheus gauge(Gauge gauge) {
    
    this.gauge = gauge;
    return this;
  }

   /**
   * Get gauge
   * @return gauge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Gauge getGauge() {
    return gauge;
  }


  public void setGauge(Gauge gauge) {
    this.gauge = gauge;
  }


  public Prometheus help(String help) {
    
    this.help = help;
    return this;
  }

   /**
   * Help is a string that describes the metric
   * @return help
  **/
  @ApiModelProperty(required = true, value = "Help is a string that describes the metric")

  public String getHelp() {
    return help;
  }


  public void setHelp(String help) {
    this.help = help;
  }


  public Prometheus histogram(Histogram histogram) {
    
    this.histogram = histogram;
    return this;
  }

   /**
   * Get histogram
   * @return histogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Histogram getHistogram() {
    return histogram;
  }


  public void setHistogram(Histogram histogram) {
    this.histogram = histogram;
  }


  public Prometheus labels(List<MetricLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public Prometheus addLabelsItem(MetricLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<MetricLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels is a list of metric labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels is a list of metric labels")

  public List<MetricLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<MetricLabel> labels) {
    this.labels = labels;
  }


  public Prometheus name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the metric
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the metric")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Prometheus when(String when) {
    
    this.when = when;
    return this;
  }

   /**
   * When is a conditional statement that decides when to emit the metric
   * @return when
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When is a conditional statement that decides when to emit the metric")

  public String getWhen() {
    return when;
  }


  public void setWhen(String when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prometheus ioArgoprojWorkflowV1alpha1Prometheus = (Prometheus) o;
    return Objects.equals(this.counter, ioArgoprojWorkflowV1alpha1Prometheus.counter) &&
        Objects.equals(this.gauge, ioArgoprojWorkflowV1alpha1Prometheus.gauge) &&
        Objects.equals(this.help, ioArgoprojWorkflowV1alpha1Prometheus.help) &&
        Objects.equals(this.histogram, ioArgoprojWorkflowV1alpha1Prometheus.histogram) &&
        Objects.equals(this.labels, ioArgoprojWorkflowV1alpha1Prometheus.labels) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Prometheus.name) &&
        Objects.equals(this.when, ioArgoprojWorkflowV1alpha1Prometheus.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counter, gauge, help, histogram, labels, name, when);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prometheus {\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    gauge: ").append(toIndentedString(gauge)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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


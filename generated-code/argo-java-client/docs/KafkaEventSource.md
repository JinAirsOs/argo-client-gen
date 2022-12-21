

# KafkaEventSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | **String** | Yaml format Sarama config for Kafka connection. It follows the struct of sarama.Config. See https://github.com/Shopify/sarama/blob/main/config.go e.g.  consumer:   fetch:     min: 1 net:   MaxOpenRequests: 5  +optional |  [optional]
**connectionBackoff** | [**Backoff**](Backoff.md) |  |  [optional]
**consumerGroup** | [**KafkaConsumerGroup**](KafkaConsumerGroup.md) |  |  [optional]
**filter** | [**EventSourceFilter**](EventSourceFilter.md) |  |  [optional]
**jsonBody** | **Boolean** |  |  [optional]
**limitEventsPerSecond** | **String** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]
**partition** | **String** |  |  [optional]
**sasl** | [**SASLConfig**](SASLConfig.md) |  |  [optional]
**tls** | [**TLSConfig**](TLSConfig.md) |  |  [optional]
**topic** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**version** | **String** |  |  [optional]




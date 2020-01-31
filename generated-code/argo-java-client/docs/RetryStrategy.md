

# RetryStrategy

RetryStrategy provides controls on how to retry a workflow step
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backoff** | [**Backoff**](Backoff.md) |  |  [optional]
**limit** | **Integer** | Limit is the maximum number of attempts when retrying a container |  [optional]
**retryPolicy** | **String** | RetryPolicy is a policy of NodePhase statuses that will be retried |  [optional]




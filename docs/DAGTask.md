
# DAGTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**dependencies** | **List&lt;String&gt;** | Dependencies are name of other targets which this depends on |  [optional]
**name** | **String** | Name is the name of the target | 
**template** | **String** | Name of template to execute | 
**when** | **String** | When is an expression in which the task should conditionally execute |  [optional]
**withItems** | **List&lt;String&gt;** | WithItems expands a task into multiple parallel tasks from the items in the list |  [optional]
**withParam** | **String** | WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list. |  [optional]
**withSequence** | [**Sequence**](Sequence.md) |  |  [optional]




# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**restAccountJsonDelete**](DefaultApi.md#restAccountJsonDelete) | **DELETE** /rest/account/json/ | 
[**restAccountJsonGet**](DefaultApi.md#restAccountJsonGet) | **GET** /rest/account/json | 
[**restAccountJsonIdGet**](DefaultApi.md#restAccountJsonIdGet) | **GET** /rest/account/json/{id} | 
[**restAccountJsonPost**](DefaultApi.md#restAccountJsonPost) | **POST** /rest/account/json/ | 
[**restAccountJsonPut**](DefaultApi.md#restAccountJsonPut) | **PUT** /rest/account/json/ | 


<a name="restAccountJsonDelete"></a>
# **restAccountJsonDelete**
> restAccountJsonDelete()



### Example
```java
// Import classes:
//import org.wso2.client.api.ApiException;
//import org.wso2.client.api.test.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.restAccountJsonDelete();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restAccountJsonDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="restAccountJsonGet"></a>
# **restAccountJsonGet**
> restAccountJsonGet()



### Example
```java
// Import classes:
//import org.wso2.client.api.ApiException;
//import org.wso2.client.api.test.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.restAccountJsonGet();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restAccountJsonGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="restAccountJsonIdGet"></a>
# **restAccountJsonIdGet**
> restAccountJsonIdGet(id)



### Example
```java
// Import classes:
//import org.wso2.client.api.ApiException;
//import org.wso2.client.api.test.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.restAccountJsonIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restAccountJsonIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="restAccountJsonPost"></a>
# **restAccountJsonPost**
> restAccountJsonPost(payload)



### Example
```java
// Import classes:
//import org.wso2.client.api.ApiException;
//import org.wso2.client.api.test.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Payload1 payload = new Payload1(); // Payload1 | Request Body
try {
    apiInstance.restAccountJsonPost(payload);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restAccountJsonPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Payload1**](Payload1.md)| Request Body | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="restAccountJsonPut"></a>
# **restAccountJsonPut**
> restAccountJsonPut(payload)



### Example
```java
// Import classes:
//import org.wso2.client.api.ApiException;
//import org.wso2.client.api.test.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Payload payload = new Payload(); // Payload | Request Body
try {
    apiInstance.restAccountJsonPut(payload);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restAccountJsonPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Payload**](Payload.md)| Request Body | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


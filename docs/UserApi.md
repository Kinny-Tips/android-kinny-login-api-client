# UserApi

All URIs are relative to *https://virtserver.swaggerhub.com/chancity9/kinny-login-api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessToken**](UserApi.md#accessToken) | **GET** /api/User/AccessToken | 
[**config**](UserApi.md#config) | **GET** /api/User/Config | 
[**linkDevice**](UserApi.md#linkDevice) | **POST** /api/User/Device | 
[**linkLogin**](UserApi.md#linkLogin) | **GET** /api/User/LinkLogin/{provider} | 
[**login**](UserApi.md#login) | **POST** /api/User/Login | 
[**register**](UserApi.md#register) | **POST** /api/User/Register | 
[**sendSms**](UserApi.md#sendSms) | **POST** /api/User/SendSmsCode/{phoneNumber} | 
[**verifySms**](UserApi.md#verifySms) | **POST** /api/User/VerifySmsCode | 


<a name="accessToken"></a>
# **accessToken**
> TokenResponse accessToken()



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
try {
    TokenResponse result = apiInstance.accessToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#accessToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="config"></a>
# **config**
> ConfigResponse config()



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
try {
    ConfigResponse result = apiInstance.config();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#config");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConfigResponse**](ConfigResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="linkDevice"></a>
# **linkDevice**
> TokenResponse linkDevice(model)



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
DeviceRequest model = new DeviceRequest(); // DeviceRequest | 
try {
    TokenResponse result = apiInstance.linkDevice(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#linkDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**DeviceRequest**](DeviceRequest.md)|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="linkLogin"></a>
# **linkLogin**
> LinkLoginResponse linkLogin(provider)



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
String provider = "provider_example"; // String | 
try {
    LinkLoginResponse result = apiInstance.linkLogin(provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#linkLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider** | **String**|  |

### Return type

[**LinkLoginResponse**](LinkLoginResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="login"></a>
# **login**
> TokenResponse login(model)



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
UserLoginRequest model = new UserLoginRequest(); // UserLoginRequest | 
try {
    TokenResponse result = apiInstance.login(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**UserLoginRequest**](UserLoginRequest.md)|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="register"></a>
# **register**
> TokenResponse register(model)



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
UserRegisterRequest model = new UserRegisterRequest(); // UserRegisterRequest | 
try {
    TokenResponse result = apiInstance.register(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**UserRegisterRequest**](UserRegisterRequest.md)|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="sendSms"></a>
# **sendSms**
> TokenResponse sendSms(phoneNumber)



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
String phoneNumber = "phoneNumber_example"; // String | 
try {
    TokenResponse result = apiInstance.sendSms(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#sendSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**|  |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="verifySms"></a>
# **verifySms**
> TokenResponse verifySms(model)



### Example
```java
// Import classes:
//import .UserApi;

UserApi apiInstance = new UserApi();
VerifyPhoneRequest model = new VerifyPhoneRequest(); // VerifyPhoneRequest | 
try {
    TokenResponse result = apiInstance.verifySms(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#verifySms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**VerifyPhoneRequest**](VerifyPhoneRequest.md)|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


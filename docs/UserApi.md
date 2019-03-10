# UserApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessToken**](UserApi.md#accessToken) | **GET** /api/User/AccessToken | 
[**addExternalLogin**](UserApi.md#addExternalLogin) | **POST** /api/User/ExternalLogin | 
[**linkDevice**](UserApi.md#linkDevice) | **POST** /api/User/Device | 
[**login**](UserApi.md#login) | **POST** /api/User/Login | 
[**profileInformation**](UserApi.md#profileInformation) | **GET** /api/User/ProfileInformation | 
[**register**](UserApi.md#register) | **POST** /api/User/Register | 
[**removeDevice**](UserApi.md#removeDevice) | **DELETE** /api/User/RemoveDevice | 
[**removeExternalLogin**](UserApi.md#removeExternalLogin) | **DELETE** /api/User/ExternalLogin | 
[**sendSms**](UserApi.md#sendSms) | **POST** /api/User/SendSmsCode | 
[**verifySms**](UserApi.md#verifySms) | **POST** /api/User/VerifySmsCode | 


<a name="accessToken"></a>
# **accessToken**
> TokenResponse accessToken()



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

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

<a name="addExternalLogin"></a>
# **addExternalLogin**
> ExternalLoginResponse addExternalLogin(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

UserApi apiInstance = new UserApi();
ExternalLoginRequest model = new ExternalLoginRequest(); // ExternalLoginRequest | 
try {
    ExternalLoginResponse result = apiInstance.addExternalLogin(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#addExternalLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**ExternalLoginRequest**](ExternalLoginRequest.md)|  | [optional]

### Return type

[**ExternalLoginResponse**](ExternalLoginResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="linkDevice"></a>
# **linkDevice**
> TokenResponse linkDevice(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

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

<a name="login"></a>
# **login**
> TokenResponse login(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

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

<a name="profileInformation"></a>
# **profileInformation**
> ProfileInformationResponse profileInformation()



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

UserApi apiInstance = new UserApi();
try {
    ProfileInformationResponse result = apiInstance.profileInformation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#profileInformation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileInformationResponse**](ProfileInformationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="register"></a>
# **register**
> TokenResponse register(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

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

<a name="removeDevice"></a>
# **removeDevice**
> BaseResponse removeDevice(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

UserApi apiInstance = new UserApi();
RemoveDeviceRequest model = new RemoveDeviceRequest(); // RemoveDeviceRequest | 
try {
    BaseResponse result = apiInstance.removeDevice(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**RemoveDeviceRequest**](RemoveDeviceRequest.md)|  | [optional]

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="removeExternalLogin"></a>
# **removeExternalLogin**
> BaseResponse removeExternalLogin(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

UserApi apiInstance = new UserApi();
RemoveExternalLoginRequest model = new RemoveExternalLoginRequest(); // RemoveExternalLoginRequest | 
try {
    BaseResponse result = apiInstance.removeExternalLogin(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#removeExternalLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**RemoveExternalLoginRequest**](RemoveExternalLoginRequest.md)|  | [optional]

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="sendSms"></a>
# **sendSms**
> TokenResponse sendSms(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

UserApi apiInstance = new UserApi();
SendSmsRequest model = new SendSmsRequest(); // SendSmsRequest | 
try {
    TokenResponse result = apiInstance.sendSms(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#sendSms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**SendSmsRequest**](SendSmsRequest.md)|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="verifySms"></a>
# **verifySms**
> TokenResponse verifySms(model)



### Example
```java
// Import classes:
//import io.kinny.login.api.UserApi;

UserApi apiInstance = new UserApi();
VerifySmsRequest model = new VerifySmsRequest(); // VerifySmsRequest | 
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
 **model** | [**VerifySmsRequest**](VerifySmsRequest.md)|  | [optional]

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json


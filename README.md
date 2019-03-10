# io.kinny

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>kinny-login-api-client</groupId>
    <artifactId>io.kinny</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "kinny-login-api-client:io.kinny:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/io.kinny-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.kinny.login.api.UserApi;

public class UserApiExample {

    public static void main(String[] args) {
        UserApi apiInstance = new UserApi();
        try {
            TokenResponse result = apiInstance.accessToken();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserApi#accessToken");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*UserApi* | [**accessToken**](docs/UserApi.md#accessToken) | **GET** /api/User/AccessToken | 
*UserApi* | [**addExternalLogin**](docs/UserApi.md#addExternalLogin) | **POST** /api/User/ExternalLogin | 
*UserApi* | [**linkDevice**](docs/UserApi.md#linkDevice) | **POST** /api/User/Device | 
*UserApi* | [**login**](docs/UserApi.md#login) | **POST** /api/User/Login | 
*UserApi* | [**profileInformation**](docs/UserApi.md#profileInformation) | **GET** /api/User/ProfileInformation | 
*UserApi* | [**register**](docs/UserApi.md#register) | **POST** /api/User/Register | 
*UserApi* | [**removeDevice**](docs/UserApi.md#removeDevice) | **DELETE** /api/User/RemoveDevice | 
*UserApi* | [**removeExternalLogin**](docs/UserApi.md#removeExternalLogin) | **DELETE** /api/User/ExternalLogin | 
*UserApi* | [**sendSms**](docs/UserApi.md#sendSms) | **POST** /api/User/SendSmsCode | 
*UserApi* | [**verifySms**](docs/UserApi.md#verifySms) | **POST** /api/User/VerifySmsCode | 


## Documentation for Models

 - [ApiError](docs/ApiError.md)
 - [BaseResponse](docs/BaseResponse.md)
 - [DeviceDto](docs/DeviceDto.md)
 - [DeviceRequest](docs/DeviceRequest.md)
 - [ExternalLoginDto](docs/ExternalLoginDto.md)
 - [ExternalLoginRequest](docs/ExternalLoginRequest.md)
 - [ExternalLoginResponse](docs/ExternalLoginResponse.md)
 - [ProfileInformationResponse](docs/ProfileInformationResponse.md)
 - [RemoveDeviceRequest](docs/RemoveDeviceRequest.md)
 - [RemoveExternalLoginRequest](docs/RemoveExternalLoginRequest.md)
 - [SendSmsRequest](docs/SendSmsRequest.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [UserDto](docs/UserDto.md)
 - [UserLoginRequest](docs/UserLoginRequest.md)
 - [UserRegisterRequest](docs/UserRegisterRequest.md)
 - [VerifySmsRequest](docs/VerifySmsRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




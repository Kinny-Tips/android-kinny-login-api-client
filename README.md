# kinny-login-api

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
    <groupId>io.kinny</groupId>
    <artifactId>kinny-login-api</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.kinny:kinny-login-api:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/kinny-login-api-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import .UserApi;

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

All URIs are relative to *https://virtserver.swaggerhub.com/chancity9/kinny-login-api/1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*UserApi* | [**accessToken**](docs/UserApi.md#accessToken) | **GET** /api/User/AccessToken | 
*UserApi* | [**config**](docs/UserApi.md#config) | **GET** /api/User/Config | 
*UserApi* | [**linkDevice**](docs/UserApi.md#linkDevice) | **POST** /api/User/Device | 
*UserApi* | [**linkLogin**](docs/UserApi.md#linkLogin) | **GET** /api/User/LinkLogin/{provider} | 
*UserApi* | [**login**](docs/UserApi.md#login) | **POST** /api/User/Login | 
*UserApi* | [**register**](docs/UserApi.md#register) | **POST** /api/User/Register | 
*UserApi* | [**sendSms**](docs/UserApi.md#sendSms) | **POST** /api/User/SendSmsCode/{phoneNumber} | 
*UserApi* | [**verifySms**](docs/UserApi.md#verifySms) | **POST** /api/User/VerifySmsCode | 


## Documentation for Models

 - [ApiError](docs/ApiError.md)
 - [ConfigResponse](docs/ConfigResponse.md)
 - [DeviceRequest](docs/DeviceRequest.md)
 - [LinkLoginResponse](docs/LinkLoginResponse.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [UserLoginRequest](docs/UserLoginRequest.md)
 - [UserRegisterRequest](docs/UserRegisterRequest.md)
 - [VerifyPhoneRequest](docs/VerifyPhoneRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




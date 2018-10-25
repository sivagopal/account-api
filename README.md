# org.wso2.client.test

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
    <groupId>org.wso2</groupId>
    <artifactId>org.wso2.client.test</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.wso2:org.wso2.client.test:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/org.wso2.client.test-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.wso2.client.api.*;
import org.wso2.client.api.auth.*;
import org.wso2.client.model.test.*;
import org.wso2.client.api.test.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        try {
            apiInstance.restAccountJsonDelete();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#restAccountJsonDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**restAccountJsonDelete**](docs/DefaultApi.md#restAccountJsonDelete) | **DELETE** /rest/account/json/ | 
*DefaultApi* | [**restAccountJsonGet**](docs/DefaultApi.md#restAccountJsonGet) | **GET** /rest/account/json | 
*DefaultApi* | [**restAccountJsonIdGet**](docs/DefaultApi.md#restAccountJsonIdGet) | **GET** /rest/account/json/{id} | 
*DefaultApi* | [**restAccountJsonPost**](docs/DefaultApi.md#restAccountJsonPost) | **POST** /rest/account/json/ | 
*DefaultApi* | [**restAccountJsonPut**](docs/DefaultApi.md#restAccountJsonPut) | **PUT** /rest/account/json/ | 


## Documentation for Models

 - [Payload](docs/Payload.md)
 - [Payload1](docs/Payload1.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




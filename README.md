Add Dependency and configure create instance

```xml
<dependency>
    <groupId>io.github.hcelebi</groupId>
    <artifactId>greenhopper-java-client</artifactId>
    <version>1</version>
</dependency>
```

```java
GreenhopperRestClient client = new GreenhopperRestClient("baseUri", "token", HttpClient.newHttpClient());
```

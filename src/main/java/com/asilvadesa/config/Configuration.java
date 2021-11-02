package com.asilvadesa.config;

import org.aeonbits.owner.Config;

@Config.Sources({"file:src/test/resources/test.properties"})
public interface Configuration extends Config {

    @Key("app.base.uri")
    String baseURI();

    @Key("app.base.path")
    String basePath();

    @Key("app.port")
    int port();

    @Key("app.auth")
    String auth();

    @Key("app.data.token")
    String dataToken();

}

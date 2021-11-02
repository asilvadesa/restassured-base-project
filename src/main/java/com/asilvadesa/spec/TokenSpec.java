package com.asilvadesa.spec;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class TokenSpec {

    private TokenSpec(){
    }

    public static RequestSpecification adminTokenAccess(){
        Map<String,String> map = new HashMap<>();
        map.put("email", "admin@email.com");
        map.put("senha", "654321");
        return new RequestSpecBuilder().setContentType(ContentType.JSON).setBody(map).build();

    }

    public static ResponseSpecification extractToken(){
        return new ResponseSpecBuilder().expectStatusCode(HttpStatus.SC_OK).build();
    }

}

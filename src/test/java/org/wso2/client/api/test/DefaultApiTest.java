/*
 * test
 * test
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.client.api.test;

import org.wso2.client.api.ApiException;
import org.wso2.client.model.test.Payload;
import org.wso2.client.model.test.Payload1;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restAccountJsonDeleteTest() throws ApiException {
        api.restAccountJsonDelete();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restAccountJsonGetTest() throws ApiException {
        api.restAccountJsonGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restAccountJsonIdGetTest() throws ApiException {
        String id = null;
        api.restAccountJsonIdGet(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restAccountJsonPostTest() throws ApiException {
        Payload1 payload = null;
        api.restAccountJsonPost(payload);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restAccountJsonPutTest() throws ApiException {
        Payload payload = null;
        api.restAccountJsonPut(payload);

        // TODO: test validations
    }
    
}
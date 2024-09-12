/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.components.ServiceGroup;
import com.shippo.sdk.models.components.ServiceGroupCreateRequest;
import com.shippo.sdk.models.components.ServiceGroupUpdateRequest;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.models.operations.CreateServiceGroupRequest;
import com.shippo.sdk.models.operations.CreateServiceGroupRequestBuilder;
import com.shippo.sdk.models.operations.CreateServiceGroupResponse;
import com.shippo.sdk.models.operations.DeleteServiceGroupRequest;
import com.shippo.sdk.models.operations.DeleteServiceGroupRequestBuilder;
import com.shippo.sdk.models.operations.DeleteServiceGroupResponse;
import com.shippo.sdk.models.operations.ListServiceGroupsRequest;
import com.shippo.sdk.models.operations.ListServiceGroupsRequestBuilder;
import com.shippo.sdk.models.operations.ListServiceGroupsResponse;
import com.shippo.sdk.models.operations.SDKMethodInterfaces.*;
import com.shippo.sdk.models.operations.UpdateServiceGroupRequest;
import com.shippo.sdk.models.operations.UpdateServiceGroupRequestBuilder;
import com.shippo.sdk.models.operations.UpdateServiceGroupResponse;
import com.shippo.sdk.utils.HTTPClient;
import com.shippo.sdk.utils.HTTPRequest;
import com.shippo.sdk.utils.Hook.AfterErrorContextImpl;
import com.shippo.sdk.utils.Hook.AfterSuccessContextImpl;
import com.shippo.sdk.utils.Hook.BeforeRequestContextImpl;
import com.shippo.sdk.utils.SerializedBody;
import com.shippo.sdk.utils.Utils.JsonShape;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * A service group is a set of service levels grouped together. 
 * Rates at checkout uses services groups to present available shipping options to customers in their shopping basket.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/ServiceGroup"/&gt;
 */
public class ServiceGroups implements
            MethodCallListServiceGroups,
            MethodCallCreateServiceGroup,
            MethodCallUpdateServiceGroup,
            MethodCallDeleteServiceGroup {

    private final SDKConfiguration sdkConfiguration;

    ServiceGroups(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all service groups
     * Returns a list of service group objects.
     * @return The call builder
     */
    public ListServiceGroupsRequestBuilder list() {
        return new ListServiceGroupsRequestBuilder(this);
    }

    /**
     * List all service groups
     * Returns a list of service group objects.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListServiceGroupsResponse listDirect() throws Exception {
        return list(Optional.empty());
    }
    
    /**
     * List all service groups
     * Returns a list of service group objects.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListServiceGroupsResponse list(
            Optional<String> shippoApiVersion) throws Exception {
        ListServiceGroupsRequest request =
            ListServiceGroupsRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/service-groups");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "ListServiceGroups", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListServiceGroups",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListServiceGroups",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListServiceGroups",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListServiceGroupsResponse.Builder _resBuilder = 
            ListServiceGroupsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListServiceGroupsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<ServiceGroup> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<ServiceGroup>>() {});
                _res.withServiceGroupListResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Create a new service group
     * Creates a new service group.
     * @return The call builder
     */
    public CreateServiceGroupRequestBuilder create() {
        return new CreateServiceGroupRequestBuilder(this);
    }

    /**
     * Create a new service group
     * Creates a new service group.
     * @param serviceGroupCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateServiceGroupResponse create(
            ServiceGroupCreateRequest serviceGroupCreateRequest) throws Exception {
        return create(Optional.empty(), serviceGroupCreateRequest);
    }
    
    /**
     * Create a new service group
     * Creates a new service group.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param serviceGroupCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateServiceGroupResponse create(
            Optional<String> shippoApiVersion,
            ServiceGroupCreateRequest serviceGroupCreateRequest) throws Exception {
        CreateServiceGroupRequest request =
            CreateServiceGroupRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .serviceGroupCreateRequest(serviceGroupCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/service-groups");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "serviceGroupCreateRequest",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "CreateServiceGroup", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateServiceGroup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateServiceGroup",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateServiceGroup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateServiceGroupResponse.Builder _resBuilder = 
            CreateServiceGroupResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateServiceGroupResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ServiceGroup _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ServiceGroup>() {});
                _res.withServiceGroup(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Update an existing service group
     * Updates an existing service group object. &lt;br&gt;The object_id cannot be updated as it is the unique identifier for the object.
     * @return The call builder
     */
    public UpdateServiceGroupRequestBuilder update() {
        return new UpdateServiceGroupRequestBuilder(this);
    }

    /**
     * Update an existing service group
     * Updates an existing service group object. &lt;br&gt;The object_id cannot be updated as it is the unique identifier for the object.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateServiceGroupResponse updateDirect() throws Exception {
        return update(Optional.empty(), Optional.empty());
    }
    
    /**
     * Update an existing service group
     * Updates an existing service group object. &lt;br&gt;The object_id cannot be updated as it is the unique identifier for the object.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param serviceGroupUpdateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateServiceGroupResponse update(
            Optional<String> shippoApiVersion,
            Optional<? extends ServiceGroupUpdateRequest> serviceGroupUpdateRequest) throws Exception {
        UpdateServiceGroupRequest request =
            UpdateServiceGroupRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .serviceGroupUpdateRequest(serviceGroupUpdateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/service-groups");
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "serviceGroupUpdateRequest",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "UpdateServiceGroup", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateServiceGroup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateServiceGroup",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateServiceGroup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateServiceGroupResponse.Builder _resBuilder = 
            UpdateServiceGroupResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateServiceGroupResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ServiceGroup _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ServiceGroup>() {});
                _res.withServiceGroup(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Delete a service group
     * Deletes an existing service group using an object ID.
     * @return The call builder
     */
    public DeleteServiceGroupRequestBuilder delete() {
        return new DeleteServiceGroupRequestBuilder(this);
    }

    /**
     * Delete a service group
     * Deletes an existing service group using an object ID.
     * @param serviceGroupId Object ID of the service group
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteServiceGroupResponse delete(
            String serviceGroupId) throws Exception {
        return delete(serviceGroupId, Optional.empty());
    }
    
    /**
     * Delete a service group
     * Deletes an existing service group using an object ID.
     * @param serviceGroupId Object ID of the service group
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteServiceGroupResponse delete(
            String serviceGroupId,
            Optional<String> shippoApiVersion) throws Exception {
        DeleteServiceGroupRequest request =
            DeleteServiceGroupRequest
                .builder()
                .serviceGroupId(serviceGroupId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                DeleteServiceGroupRequest.class,
                _baseUrl,
                "/service-groups/{ServiceGroupId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "DeleteServiceGroup", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteServiceGroup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteServiceGroup",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteServiceGroup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteServiceGroupResponse.Builder _resBuilder = 
            DeleteServiceGroupResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteServiceGroupResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}

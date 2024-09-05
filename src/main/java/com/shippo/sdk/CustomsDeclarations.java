/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.components.CustomsDeclaration;
import com.shippo.sdk.models.components.CustomsDeclarationCreateRequest;
import com.shippo.sdk.models.components.CustomsDeclarationPaginatedList;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.models.operations.CreateCustomsDeclarationRequest;
import com.shippo.sdk.models.operations.CreateCustomsDeclarationRequestBuilder;
import com.shippo.sdk.models.operations.CreateCustomsDeclarationResponse;
import com.shippo.sdk.models.operations.GetCustomsDeclarationRequest;
import com.shippo.sdk.models.operations.GetCustomsDeclarationRequestBuilder;
import com.shippo.sdk.models.operations.GetCustomsDeclarationResponse;
import com.shippo.sdk.models.operations.ListCustomsDeclarationsRequest;
import com.shippo.sdk.models.operations.ListCustomsDeclarationsRequestBuilder;
import com.shippo.sdk.models.operations.ListCustomsDeclarationsResponse;
import com.shippo.sdk.models.operations.SDKMethodInterfaces.*;
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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * Customs declarations are relevant information, including one or multiple customs items, you need to provide for 
 * customs clearance for your international shipments.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/CustomsDeclaration"/&gt;
 */
public class CustomsDeclarations implements
            MethodCallListCustomsDeclarations,
            MethodCallCreateCustomsDeclaration,
            MethodCallGetCustomsDeclaration {

    private final SDKConfiguration sdkConfiguration;

    CustomsDeclarations(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all customs declarations
     * Returns a a list of all customs declaration objects
     * @return The call builder
     */
    public ListCustomsDeclarationsRequestBuilder list() {
        return new ListCustomsDeclarationsRequestBuilder(this);
    }

    /**
     * List all customs declarations
     * Returns a a list of all customs declaration objects
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCustomsDeclarationsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * List all customs declarations
     * Returns a a list of all customs declaration objects
     * @param page The page number you want to select
     * @param results The number of results to return per page (max 100, default 5)
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCustomsDeclarationsResponse list(
            Optional<Long> page,
            Optional<Long> results,
            Optional<String> shippoApiVersion) throws Exception {
        ListCustomsDeclarationsRequest request =
            ListCustomsDeclarationsRequest
                .builder()
                .page(page)
                .results(results)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/customs/declarations");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                ListCustomsDeclarationsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "ListCustomsDeclarations", 
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
                            "ListCustomsDeclarations",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListCustomsDeclarations",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListCustomsDeclarations",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListCustomsDeclarationsResponse.Builder _resBuilder = 
            ListCustomsDeclarationsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListCustomsDeclarationsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CustomsDeclarationPaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CustomsDeclarationPaginatedList>() {});
                _res.withCustomsDeclarationPaginatedList(Optional.ofNullable(_out));
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
     * Create a new customs declaration
     * Creates a new customs declaration object
     * @return The call builder
     */
    public CreateCustomsDeclarationRequestBuilder create() {
        return new CreateCustomsDeclarationRequestBuilder(this);
    }

    /**
     * Create a new customs declaration
     * Creates a new customs declaration object
     * @param customsDeclarationCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateCustomsDeclarationResponse create(
            CustomsDeclarationCreateRequest customsDeclarationCreateRequest) throws Exception {
        return create(Optional.empty(), customsDeclarationCreateRequest);
    }
    
    /**
     * Create a new customs declaration
     * Creates a new customs declaration object
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param customsDeclarationCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateCustomsDeclarationResponse create(
            Optional<String> shippoApiVersion,
            CustomsDeclarationCreateRequest customsDeclarationCreateRequest) throws Exception {
        CreateCustomsDeclarationRequest request =
            CreateCustomsDeclarationRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .customsDeclarationCreateRequest(customsDeclarationCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/customs/declarations");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "customsDeclarationCreateRequest",
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
                      "CreateCustomsDeclaration", 
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
                            "CreateCustomsDeclaration",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateCustomsDeclaration",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateCustomsDeclaration",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateCustomsDeclarationResponse.Builder _resBuilder = 
            CreateCustomsDeclarationResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateCustomsDeclarationResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CustomsDeclaration _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CustomsDeclaration>() {});
                _res.withCustomsDeclaration(Optional.ofNullable(_out));
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
     * Retrieve a customs declaration
     * Returns an existing customs declaration using an object ID
     * @return The call builder
     */
    public GetCustomsDeclarationRequestBuilder get() {
        return new GetCustomsDeclarationRequestBuilder(this);
    }

    /**
     * Retrieve a customs declaration
     * Returns an existing customs declaration using an object ID
     * @param customsDeclarationId Object ID of the customs declaration
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCustomsDeclarationResponse get(
            String customsDeclarationId) throws Exception {
        return get(customsDeclarationId, Optional.empty(), Optional.empty());
    }
    
    /**
     * Retrieve a customs declaration
     * Returns an existing customs declaration using an object ID
     * @param customsDeclarationId Object ID of the customs declaration
     * @param page The page number you want to select
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCustomsDeclarationResponse get(
            String customsDeclarationId,
            Optional<Long> page,
            Optional<String> shippoApiVersion) throws Exception {
        GetCustomsDeclarationRequest request =
            GetCustomsDeclarationRequest
                .builder()
                .customsDeclarationId(customsDeclarationId)
                .page(page)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCustomsDeclarationRequest.class,
                _baseUrl,
                "/customs/declarations/{CustomsDeclarationId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                GetCustomsDeclarationRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "GetCustomsDeclaration", 
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
                            "GetCustomsDeclaration",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetCustomsDeclaration",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetCustomsDeclaration",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCustomsDeclarationResponse.Builder _resBuilder = 
            GetCustomsDeclarationResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCustomsDeclarationResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CustomsDeclaration _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CustomsDeclaration>() {});
                _res.withCustomsDeclaration(Optional.ofNullable(_out));
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

}

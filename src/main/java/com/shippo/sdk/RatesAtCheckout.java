/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.components.DefaultParcelTemplate;
import com.shippo.sdk.models.components.DefaultParcelTemplateUpdateRequest;
import com.shippo.sdk.models.components.LiveRateCreateRequest;
import com.shippo.sdk.models.components.LiveRatePaginatedList;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.models.operations.CreateLiveRateRequest;
import com.shippo.sdk.models.operations.CreateLiveRateRequestBuilder;
import com.shippo.sdk.models.operations.CreateLiveRateResponse;
import com.shippo.sdk.models.operations.DeleteDefaultParcelTemplateRequest;
import com.shippo.sdk.models.operations.DeleteDefaultParcelTemplateRequestBuilder;
import com.shippo.sdk.models.operations.DeleteDefaultParcelTemplateResponse;
import com.shippo.sdk.models.operations.GetDefaultParcelTemplateRequest;
import com.shippo.sdk.models.operations.GetDefaultParcelTemplateRequestBuilder;
import com.shippo.sdk.models.operations.GetDefaultParcelTemplateResponse;
import com.shippo.sdk.models.operations.SDKMethodInterfaces.*;
import com.shippo.sdk.models.operations.UpdateDefaultParcelTemplateRequest;
import com.shippo.sdk.models.operations.UpdateDefaultParcelTemplateRequestBuilder;
import com.shippo.sdk.models.operations.UpdateDefaultParcelTemplateResponse;
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
 * Rates at checkout is a tool for merchants to display up-to-date shipping estimates based on what's in their customers cart and where they’re shipping to.
 * Merchants set up curated shipping options for customers in the checkout flow based on data in the shopping cart. The request must include the **to** address and item information. Optional fields are the **from** address and package information. If the optional fields are not included, the service will use the default address and/or package configured for rates at checkout. The response is a list of shipping options based on the Service Group configuration.
 * (see &lt;a href="#tag/Service-Groups"&gt;Service Group configuration&lt;/a&gt; for details).
 * &lt;SchemaDefinition schemaRef="#/components/schemas/LiveRate"/&gt;
 * 
 * 
 * # Default Parcel Template
 * Assign one of your user parcel templates to be the default used when generating Live Rates. This template will be used by default when generating Live Rates, unless you explicitly provide a parcel in the Live Rates request.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/&gt;
 */
public class RatesAtCheckout implements
            MethodCallCreateLiveRate,
            MethodCallGetDefaultParcelTemplate,
            MethodCallUpdateDefaultParcelTemplate,
            MethodCallDeleteDefaultParcelTemplate {

    private final SDKConfiguration sdkConfiguration;

    RatesAtCheckout(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Generate a live rates request
     * Initiates a live rates request. Include either the object ID for
     * an existing address record or a fully formed address object when entering
     * an address value. You can also enter the object ID of an existing user parcel
     * template or a fully formed user parcel template object as the parcel value.
     * @return The call builder
     */
    public CreateLiveRateRequestBuilder create() {
        return new CreateLiveRateRequestBuilder(this);
    }

    /**
     * Generate a live rates request
     * Initiates a live rates request. Include either the object ID for
     * an existing address record or a fully formed address object when entering
     * an address value. You can also enter the object ID of an existing user parcel
     * template or a fully formed user parcel template object as the parcel value.
     * @param liveRateCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateLiveRateResponse create(
            LiveRateCreateRequest liveRateCreateRequest) throws Exception {
        return create(Optional.empty(), liveRateCreateRequest);
    }
    
    /**
     * Generate a live rates request
     * Initiates a live rates request. Include either the object ID for
     * an existing address record or a fully formed address object when entering
     * an address value. You can also enter the object ID of an existing user parcel
     * template or a fully formed user parcel template object as the parcel value.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param liveRateCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateLiveRateResponse create(
            Optional<String> shippoApiVersion,
            LiveRateCreateRequest liveRateCreateRequest) throws Exception {
        CreateLiveRateRequest request =
            CreateLiveRateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .liveRateCreateRequest(liveRateCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "liveRateCreateRequest",
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
                      "CreateLiveRate", 
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
                            "CreateLiveRate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateLiveRate",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateLiveRate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateLiveRateResponse.Builder _resBuilder = 
            CreateLiveRateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateLiveRateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                LiveRatePaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<LiveRatePaginatedList>() {});
                _res.withLiveRatePaginatedList(Optional.ofNullable(_out));
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
     * Show current default parcel template
     * Retrieve and display the currently configured default parcel template for live rates.
     * @return The call builder
     */
    public GetDefaultParcelTemplateRequestBuilder getDefaultParcelTemplate() {
        return new GetDefaultParcelTemplateRequestBuilder(this);
    }

    /**
     * Show current default parcel template
     * Retrieve and display the currently configured default parcel template for live rates.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetDefaultParcelTemplateResponse getDefaultParcelTemplateDirect() throws Exception {
        return getDefaultParcelTemplate(Optional.empty());
    }
    
    /**
     * Show current default parcel template
     * Retrieve and display the currently configured default parcel template for live rates.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetDefaultParcelTemplateResponse getDefaultParcelTemplate(
            Optional<String> shippoApiVersion) throws Exception {
        GetDefaultParcelTemplateRequest request =
            GetDefaultParcelTemplateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates/settings/parcel-template");
        
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
                      "GetDefaultParcelTemplate", 
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
                            "GetDefaultParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetDefaultParcelTemplate",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetDefaultParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetDefaultParcelTemplateResponse.Builder _resBuilder = 
            GetDefaultParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetDefaultParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                DefaultParcelTemplate _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<DefaultParcelTemplate>() {});
                _res.withDefaultParcelTemplate(Optional.ofNullable(_out));
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
     * Update default parcel template
     * Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.
     * @return The call builder
     */
    public UpdateDefaultParcelTemplateRequestBuilder updateDefaultParcelTemplate() {
        return new UpdateDefaultParcelTemplateRequestBuilder(this);
    }

    /**
     * Update default parcel template
     * Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateDefaultParcelTemplateResponse updateDefaultParcelTemplateDirect() throws Exception {
        return updateDefaultParcelTemplate(Optional.empty(), Optional.empty());
    }
    
    /**
     * Update default parcel template
     * Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param defaultParcelTemplateUpdateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateDefaultParcelTemplateResponse updateDefaultParcelTemplate(
            Optional<String> shippoApiVersion,
            Optional<? extends DefaultParcelTemplateUpdateRequest> defaultParcelTemplateUpdateRequest) throws Exception {
        UpdateDefaultParcelTemplateRequest request =
            UpdateDefaultParcelTemplateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .defaultParcelTemplateUpdateRequest(defaultParcelTemplateUpdateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates/settings/parcel-template");
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "defaultParcelTemplateUpdateRequest",
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
                      "UpdateDefaultParcelTemplate", 
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
                            "UpdateDefaultParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateDefaultParcelTemplate",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateDefaultParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateDefaultParcelTemplateResponse.Builder _resBuilder = 
            UpdateDefaultParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateDefaultParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                DefaultParcelTemplate _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<DefaultParcelTemplate>() {});
                _res.withDefaultParcelTemplate(Optional.ofNullable(_out));
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
     * Clear current default parcel template
     * Clears the currently configured default parcel template for live rates.
     * @return The call builder
     */
    public DeleteDefaultParcelTemplateRequestBuilder deleteDefaultParcelTemplate() {
        return new DeleteDefaultParcelTemplateRequestBuilder(this);
    }

    /**
     * Clear current default parcel template
     * Clears the currently configured default parcel template for live rates.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteDefaultParcelTemplateResponse deleteDefaultParcelTemplateDirect() throws Exception {
        return deleteDefaultParcelTemplate(Optional.empty());
    }
    
    /**
     * Clear current default parcel template
     * Clears the currently configured default parcel template for live rates.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteDefaultParcelTemplateResponse deleteDefaultParcelTemplate(
            Optional<String> shippoApiVersion) throws Exception {
        DeleteDefaultParcelTemplateRequest request =
            DeleteDefaultParcelTemplateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates/settings/parcel-template");
        
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
                      "DeleteDefaultParcelTemplate", 
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
                            "DeleteDefaultParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteDefaultParcelTemplate",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteDefaultParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteDefaultParcelTemplateResponse.Builder _resBuilder = 
            DeleteDefaultParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteDefaultParcelTemplateResponse _res = _resBuilder.build();
        
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

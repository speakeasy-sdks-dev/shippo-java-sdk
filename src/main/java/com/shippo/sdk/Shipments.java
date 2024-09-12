/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.components.Shipment;
import com.shippo.sdk.models.components.ShipmentCreateRequest;
import com.shippo.sdk.models.components.ShipmentPaginatedList;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.models.operations.CreateShipmentRequest;
import com.shippo.sdk.models.operations.CreateShipmentRequestBuilder;
import com.shippo.sdk.models.operations.CreateShipmentResponse;
import com.shippo.sdk.models.operations.GetShipmentRequest;
import com.shippo.sdk.models.operations.GetShipmentRequestBuilder;
import com.shippo.sdk.models.operations.GetShipmentResponse;
import com.shippo.sdk.models.operations.ListShipmentsRequest;
import com.shippo.sdk.models.operations.ListShipmentsRequestBuilder;
import com.shippo.sdk.models.operations.ListShipmentsResponse;
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
 * A shipment is the act of transporting goods. A shipment object contains **to** and **from** addresses, and the parcel details that you are shipping. You can use the shipment object to retrieve shipping rates and purchase a shipping label.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/Shipment"/&gt;
 *  
 * # Shipment Extras
 * The following values are supported for the `extra` field of the shipment object.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/ShipmentExtra"/&gt;
 */
public class Shipments implements
            MethodCallListShipments,
            MethodCallCreateShipment,
            MethodCallGetShipment {

    private final SDKConfiguration sdkConfiguration;

    Shipments(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all shipments
     * Returns a list of all shipment objects.&lt;br&gt;&lt;br&gt;
     * In order to filter results, you must use the below path parameters. 
     * A maximum date range of 90 days is permitted. 
     * Provided dates should be ISO 8601 UTC dates (timezone offsets are currently not supported).&lt;br&gt;&lt;br&gt;
     * 
     * Optional path parameters:&lt;br&gt;
     *   `object_created_gt`- object(s) created greater than a provided date time&lt;br&gt;
     *   `object_created_gte` - object(s) created greater than or equal to a provided date time&lt;br&gt;
     *   `object_created_lt` - object(s) created less than a provided date time&lt;br&gt;
     *   `object_created_lte` - object(s) created less than or equal to a provided date time&lt;br&gt;
     * 
     *   Date format examples:&lt;br&gt;
     *     `2017-01-01`&lt;br&gt;
     *     `2017-01-01T03:30:30` or `2017-01-01T03:30:30.5`&lt;br&gt;
     *     `2017-01-01T03:30:30Z`&lt;br&gt;&lt;br&gt;
     * 
     *   Example URL:&lt;br&gt;
     *     `https://api.goshippo.com/shipments/?object_created_gte=2017-01-01T00:00:30&amp;object_created_lt=2017-04-01T00:00:30`
     * @return The call builder
     */
    public ListShipmentsRequestBuilder list() {
        return new ListShipmentsRequestBuilder(this);
    }

    /**
     * List all shipments
     * Returns a list of all shipment objects.&lt;br&gt;&lt;br&gt;
     * In order to filter results, you must use the below path parameters. 
     * A maximum date range of 90 days is permitted. 
     * Provided dates should be ISO 8601 UTC dates (timezone offsets are currently not supported).&lt;br&gt;&lt;br&gt;
     * 
     * Optional path parameters:&lt;br&gt;
     *   `object_created_gt`- object(s) created greater than a provided date time&lt;br&gt;
     *   `object_created_gte` - object(s) created greater than or equal to a provided date time&lt;br&gt;
     *   `object_created_lt` - object(s) created less than a provided date time&lt;br&gt;
     *   `object_created_lte` - object(s) created less than or equal to a provided date time&lt;br&gt;
     * 
     *   Date format examples:&lt;br&gt;
     *     `2017-01-01`&lt;br&gt;
     *     `2017-01-01T03:30:30` or `2017-01-01T03:30:30.5`&lt;br&gt;
     *     `2017-01-01T03:30:30Z`&lt;br&gt;&lt;br&gt;
     * 
     *   Example URL:&lt;br&gt;
     *     `https://api.goshippo.com/shipments/?object_created_gte=2017-01-01T00:00:30&amp;object_created_lt=2017-04-01T00:00:30`
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListShipmentsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * List all shipments
     * Returns a list of all shipment objects.&lt;br&gt;&lt;br&gt;
     * In order to filter results, you must use the below path parameters. 
     * A maximum date range of 90 days is permitted. 
     * Provided dates should be ISO 8601 UTC dates (timezone offsets are currently not supported).&lt;br&gt;&lt;br&gt;
     * 
     * Optional path parameters:&lt;br&gt;
     *   `object_created_gt`- object(s) created greater than a provided date time&lt;br&gt;
     *   `object_created_gte` - object(s) created greater than or equal to a provided date time&lt;br&gt;
     *   `object_created_lt` - object(s) created less than a provided date time&lt;br&gt;
     *   `object_created_lte` - object(s) created less than or equal to a provided date time&lt;br&gt;
     * 
     *   Date format examples:&lt;br&gt;
     *     `2017-01-01`&lt;br&gt;
     *     `2017-01-01T03:30:30` or `2017-01-01T03:30:30.5`&lt;br&gt;
     *     `2017-01-01T03:30:30Z`&lt;br&gt;&lt;br&gt;
     * 
     *   Example URL:&lt;br&gt;
     *     `https://api.goshippo.com/shipments/?object_created_gte=2017-01-01T00:00:30&amp;object_created_lt=2017-04-01T00:00:30`
     * @param page The page number you want to select
     * @param results The number of results to return per page (max 100)
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListShipmentsResponse list(
            Optional<Long> page,
            Optional<Long> results,
            Optional<String> shippoApiVersion) throws Exception {
        ListShipmentsRequest request =
            ListShipmentsRequest
                .builder()
                .page(page)
                .results(results)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/shipments");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                ListShipmentsRequest.class,
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
                      "ListShipments", 
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
                            "ListShipments",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListShipments",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListShipments",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListShipmentsResponse.Builder _resBuilder = 
            ListShipmentsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListShipmentsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ShipmentPaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ShipmentPaginatedList>() {});
                _res.withShipmentPaginatedList(Optional.ofNullable(_out));
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
     * Create a new shipment
     * Creates a new shipment object.
     * @return The call builder
     */
    public CreateShipmentRequestBuilder create() {
        return new CreateShipmentRequestBuilder(this);
    }

    /**
     * Create a new shipment
     * Creates a new shipment object.
     * @param shipmentCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateShipmentResponse create(
            ShipmentCreateRequest shipmentCreateRequest) throws Exception {
        return create(Optional.empty(), shipmentCreateRequest);
    }
    
    /**
     * Create a new shipment
     * Creates a new shipment object.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param shipmentCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateShipmentResponse create(
            Optional<String> shippoApiVersion,
            ShipmentCreateRequest shipmentCreateRequest) throws Exception {
        CreateShipmentRequest request =
            CreateShipmentRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .shipmentCreateRequest(shipmentCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/shipments");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "shipmentCreateRequest",
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
                      "CreateShipment", 
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
                            "CreateShipment",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateShipment",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateShipment",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateShipmentResponse.Builder _resBuilder = 
            CreateShipmentResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateShipmentResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Shipment _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Shipment>() {});
                _res.withShipment(Optional.ofNullable(_out));
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
     * Retrieve a shipment
     * Returns an existing shipment using an object ID
     * @return The call builder
     */
    public GetShipmentRequestBuilder get() {
        return new GetShipmentRequestBuilder(this);
    }

    /**
     * Retrieve a shipment
     * Returns an existing shipment using an object ID
     * @param shipmentId Object ID of the shipment to update
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetShipmentResponse get(
            String shipmentId) throws Exception {
        return get(shipmentId, Optional.empty());
    }
    
    /**
     * Retrieve a shipment
     * Returns an existing shipment using an object ID
     * @param shipmentId Object ID of the shipment to update
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetShipmentResponse get(
            String shipmentId,
            Optional<String> shippoApiVersion) throws Exception {
        GetShipmentRequest request =
            GetShipmentRequest
                .builder()
                .shipmentId(shipmentId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetShipmentRequest.class,
                _baseUrl,
                "/shipments/{ShipmentId}",
                request, this.sdkConfiguration.globals);
        
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
                      "GetShipment", 
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
                            "GetShipment",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetShipment",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetShipment",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetShipmentResponse.Builder _resBuilder = 
            GetShipmentResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetShipmentResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Shipment _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Shipment>() {});
                _res.withShipment(Optional.ofNullable(_out));
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

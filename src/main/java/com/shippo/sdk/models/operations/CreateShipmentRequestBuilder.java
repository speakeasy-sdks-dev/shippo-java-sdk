/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.models.components.ShipmentCreateRequest;
import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateShipmentRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private ShipmentCreateRequest shipmentCreateRequest;
    private final SDKMethodInterfaces.MethodCallCreateShipment sdk;

    public CreateShipmentRequestBuilder(SDKMethodInterfaces.MethodCallCreateShipment sdk) {
        this.sdk = sdk;
    }
                
    public CreateShipmentRequestBuilder shippoApiVersion(java.lang.String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateShipmentRequestBuilder shippoApiVersion(java.util.Optional<java.lang.String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateShipmentRequestBuilder shipmentCreateRequest(com.shippo.sdk.models.components.ShipmentCreateRequest shipmentCreateRequest) {
        Utils.checkNotNull(shipmentCreateRequest, "shipmentCreateRequest");
        this.shipmentCreateRequest = shipmentCreateRequest;
        return this;
    }

    public CreateShipmentResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            shipmentCreateRequest);
    }
}

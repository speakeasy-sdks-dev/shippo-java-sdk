/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetShipmentRequestBuilder {

    private String shipmentId;
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetShipment sdk;

    public GetShipmentRequestBuilder(SDKMethodInterfaces.MethodCallGetShipment sdk) {
        this.sdk = sdk;
    }

    public GetShipmentRequestBuilder shipmentId(java.lang.String shipmentId) {
        Utils.checkNotNull(shipmentId, "shipmentId");
        this.shipmentId = shipmentId;
        return this;
    }
                
    public GetShipmentRequestBuilder shippoApiVersion(java.lang.String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetShipmentRequestBuilder shippoApiVersion(java.util.Optional<java.lang.String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetShipmentResponse call() throws Exception {

        return sdk.get(
            shipmentId,
            shippoApiVersion);
    }
}

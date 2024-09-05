/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetCarrierAccountRequestBuilder {

    private String carrierAccountId;
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetCarrierAccount sdk;

    public GetCarrierAccountRequestBuilder(SDKMethodInterfaces.MethodCallGetCarrierAccount sdk) {
        this.sdk = sdk;
    }

    public GetCarrierAccountRequestBuilder carrierAccountId(java.lang.String carrierAccountId) {
        Utils.checkNotNull(carrierAccountId, "carrierAccountId");
        this.carrierAccountId = carrierAccountId;
        return this;
    }
                
    public GetCarrierAccountRequestBuilder shippoApiVersion(java.lang.String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetCarrierAccountRequestBuilder shippoApiVersion(java.util.Optional<java.lang.String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetCarrierAccountResponse call() throws Exception {

        return sdk.get(
            carrierAccountId,
            shippoApiVersion);
    }
}

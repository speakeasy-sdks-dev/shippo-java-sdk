/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetRateRequestBuilder {

    private String rateId;
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetRate sdk;

    public GetRateRequestBuilder(SDKMethodInterfaces.MethodCallGetRate sdk) {
        this.sdk = sdk;
    }

    public GetRateRequestBuilder rateId(java.lang.String rateId) {
        Utils.checkNotNull(rateId, "rateId");
        this.rateId = rateId;
        return this;
    }
                
    public GetRateRequestBuilder shippoApiVersion(java.lang.String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetRateRequestBuilder shippoApiVersion(java.util.Optional<java.lang.String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetRateResponse call() throws Exception {

        return sdk.get(
            rateId,
            shippoApiVersion);
    }
}

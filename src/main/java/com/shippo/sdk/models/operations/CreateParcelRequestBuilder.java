/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateParcelRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private CreateParcelRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallCreateParcel sdk;

    public CreateParcelRequestBuilder(SDKMethodInterfaces.MethodCallCreateParcel sdk) {
        this.sdk = sdk;
    }
                
    public CreateParcelRequestBuilder shippoApiVersion(java.lang.String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateParcelRequestBuilder shippoApiVersion(java.util.Optional<java.lang.String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateParcelRequestBuilder requestBody(com.shippo.sdk.models.operations.CreateParcelRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateParcelResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            requestBody);
    }
}

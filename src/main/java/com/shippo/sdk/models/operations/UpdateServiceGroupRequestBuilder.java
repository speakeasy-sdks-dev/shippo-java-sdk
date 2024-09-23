/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.models.components.ServiceGroupUpdateRequest;
import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateServiceGroupRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private Optional<? extends ServiceGroupUpdateRequest> serviceGroupUpdateRequest = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateServiceGroup sdk;

    public UpdateServiceGroupRequestBuilder(SDKMethodInterfaces.MethodCallUpdateServiceGroup sdk) {
        this.sdk = sdk;
    }
                
    public UpdateServiceGroupRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public UpdateServiceGroupRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public UpdateServiceGroupRequestBuilder serviceGroupUpdateRequest(ServiceGroupUpdateRequest serviceGroupUpdateRequest) {
        Utils.checkNotNull(serviceGroupUpdateRequest, "serviceGroupUpdateRequest");
        this.serviceGroupUpdateRequest = Optional.of(serviceGroupUpdateRequest);
        return this;
    }

    public UpdateServiceGroupRequestBuilder serviceGroupUpdateRequest(Optional<? extends ServiceGroupUpdateRequest> serviceGroupUpdateRequest) {
        Utils.checkNotNull(serviceGroupUpdateRequest, "serviceGroupUpdateRequest");
        this.serviceGroupUpdateRequest = serviceGroupUpdateRequest;
        return this;
    }

    public UpdateServiceGroupResponse call() throws Exception {

        return sdk.update(
            shippoApiVersion,
            serviceGroupUpdateRequest);
    }
}

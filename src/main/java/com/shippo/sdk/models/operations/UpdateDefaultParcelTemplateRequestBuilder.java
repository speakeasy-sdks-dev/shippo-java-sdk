/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.models.components.DefaultParcelTemplateUpdateRequest;
import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class UpdateDefaultParcelTemplateRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private Optional<? extends DefaultParcelTemplateUpdateRequest> defaultParcelTemplateUpdateRequest = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateDefaultParcelTemplate sdk;

    public UpdateDefaultParcelTemplateRequestBuilder(SDKMethodInterfaces.MethodCallUpdateDefaultParcelTemplate sdk) {
        this.sdk = sdk;
    }
                
    public UpdateDefaultParcelTemplateRequestBuilder shippoApiVersion(java.lang.String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public UpdateDefaultParcelTemplateRequestBuilder shippoApiVersion(java.util.Optional<java.lang.String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public UpdateDefaultParcelTemplateRequestBuilder defaultParcelTemplateUpdateRequest(com.shippo.sdk.models.components.DefaultParcelTemplateUpdateRequest defaultParcelTemplateUpdateRequest) {
        Utils.checkNotNull(defaultParcelTemplateUpdateRequest, "defaultParcelTemplateUpdateRequest");
        this.defaultParcelTemplateUpdateRequest = Optional.of(defaultParcelTemplateUpdateRequest);
        return this;
    }

    public UpdateDefaultParcelTemplateRequestBuilder defaultParcelTemplateUpdateRequest(java.util.Optional<? extends com.shippo.sdk.models.components.DefaultParcelTemplateUpdateRequest> defaultParcelTemplateUpdateRequest) {
        Utils.checkNotNull(defaultParcelTemplateUpdateRequest, "defaultParcelTemplateUpdateRequest");
        this.defaultParcelTemplateUpdateRequest = defaultParcelTemplateUpdateRequest;
        return this;
    }

    public UpdateDefaultParcelTemplateResponse call() throws Exception {

        return sdk.updateDefaultParcelTemplate(
            shippoApiVersion,
            defaultParcelTemplateUpdateRequest);
    }
}

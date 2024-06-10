/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.utils.LazySingletonValue;
import com.shippo.sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateParcelRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private com.shippo.sdk.models.components.ParcelRequest parcelRequest;
    private final SDKMethodInterfaces.MethodCallCreateParcel sdk;

    public CreateParcelRequestBuilder(SDKMethodInterfaces.MethodCallCreateParcel sdk) {
        this.sdk = sdk;
    }
                
    public CreateParcelRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateParcelRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateParcelRequestBuilder parcelRequest(com.shippo.sdk.models.components.ParcelRequest parcelRequest) {
        Utils.checkNotNull(parcelRequest, "parcelRequest");
        this.parcelRequest = parcelRequest;
        return this;
    }

    public CreateParcelResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            parcelRequest);
    }
}
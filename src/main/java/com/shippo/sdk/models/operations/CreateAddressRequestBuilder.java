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


public class CreateAddressRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private com.shippo.sdk.models.components.AddressCreateRequest addressCreateRequest;
    private final SDKMethodInterfaces.MethodCallCreateAddress sdk;

    public CreateAddressRequestBuilder(SDKMethodInterfaces.MethodCallCreateAddress sdk) {
        this.sdk = sdk;
    }
                
    public CreateAddressRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateAddressRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateAddressRequestBuilder addressCreateRequest(com.shippo.sdk.models.components.AddressCreateRequest addressCreateRequest) {
        Utils.checkNotNull(addressCreateRequest, "addressCreateRequest");
        this.addressCreateRequest = addressCreateRequest;
        return this;
    }

    public CreateAddressResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            addressCreateRequest);
    }
}
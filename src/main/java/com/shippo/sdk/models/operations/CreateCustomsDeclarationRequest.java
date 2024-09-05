/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.models.components.CustomsDeclarationCreateRequest;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateCustomsDeclarationRequest {

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    /**
     * CustomsDeclaration details.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private CustomsDeclarationCreateRequest customsDeclarationCreateRequest;

    @JsonCreator
    public CreateCustomsDeclarationRequest(
            Optional<String> shippoApiVersion,
            CustomsDeclarationCreateRequest customsDeclarationCreateRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.customsDeclarationCreateRequest = customsDeclarationCreateRequest;
    }
    
    public CreateCustomsDeclarationRequest(
            CustomsDeclarationCreateRequest customsDeclarationCreateRequest) {
        this(Optional.empty(), customsDeclarationCreateRequest);
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    /**
     * CustomsDeclaration details.
     */
    @JsonIgnore
    public CustomsDeclarationCreateRequest customsDeclarationCreateRequest() {
        return customsDeclarationCreateRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateCustomsDeclarationRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateCustomsDeclarationRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * CustomsDeclaration details.
     */
    public CreateCustomsDeclarationRequest withCustomsDeclarationCreateRequest(CustomsDeclarationCreateRequest customsDeclarationCreateRequest) {
        Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
        this.customsDeclarationCreateRequest = customsDeclarationCreateRequest;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomsDeclarationRequest other = (CreateCustomsDeclarationRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.customsDeclarationCreateRequest, other.customsDeclarationCreateRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            customsDeclarationCreateRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCustomsDeclarationRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "customsDeclarationCreateRequest", customsDeclarationCreateRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private CustomsDeclarationCreateRequest customsDeclarationCreateRequest;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * String used to pick a non-default API version to use
         */
        public Builder shippoApiVersion(String shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
            return this;
        }

        /**
         * String used to pick a non-default API version to use
         */
        public Builder shippoApiVersion(Optional<String> shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = shippoApiVersion;
            return this;
        }

        /**
         * CustomsDeclaration details.
         */
        public Builder customsDeclarationCreateRequest(CustomsDeclarationCreateRequest customsDeclarationCreateRequest) {
            Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
            this.customsDeclarationCreateRequest = customsDeclarationCreateRequest;
            return this;
        }
        
        public CreateCustomsDeclarationRequest build() {
            return new CreateCustomsDeclarationRequest(
                shippoApiVersion,
                customsDeclarationCreateRequest);
        }
    }
}


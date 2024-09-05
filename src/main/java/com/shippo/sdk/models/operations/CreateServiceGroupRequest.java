/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.models.components.ServiceGroupCreateRequest;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateServiceGroupRequest {

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ServiceGroupCreateRequest serviceGroupCreateRequest;

    @JsonCreator
    public CreateServiceGroupRequest(
            Optional<String> shippoApiVersion,
            ServiceGroupCreateRequest serviceGroupCreateRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(serviceGroupCreateRequest, "serviceGroupCreateRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.serviceGroupCreateRequest = serviceGroupCreateRequest;
    }
    
    public CreateServiceGroupRequest(
            ServiceGroupCreateRequest serviceGroupCreateRequest) {
        this(Optional.empty(), serviceGroupCreateRequest);
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    @JsonIgnore
    public ServiceGroupCreateRequest serviceGroupCreateRequest() {
        return serviceGroupCreateRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateServiceGroupRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateServiceGroupRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateServiceGroupRequest withServiceGroupCreateRequest(ServiceGroupCreateRequest serviceGroupCreateRequest) {
        Utils.checkNotNull(serviceGroupCreateRequest, "serviceGroupCreateRequest");
        this.serviceGroupCreateRequest = serviceGroupCreateRequest;
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
        CreateServiceGroupRequest other = (CreateServiceGroupRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.serviceGroupCreateRequest, other.serviceGroupCreateRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            serviceGroupCreateRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateServiceGroupRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "serviceGroupCreateRequest", serviceGroupCreateRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private ServiceGroupCreateRequest serviceGroupCreateRequest;  
        
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

        public Builder serviceGroupCreateRequest(ServiceGroupCreateRequest serviceGroupCreateRequest) {
            Utils.checkNotNull(serviceGroupCreateRequest, "serviceGroupCreateRequest");
            this.serviceGroupCreateRequest = serviceGroupCreateRequest;
            return this;
        }
        
        public CreateServiceGroupRequest build() {
            return new CreateServiceGroupRequest(
                shippoApiVersion,
                serviceGroupCreateRequest);
        }
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.models.components.ManifestCreateRequest;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateManifestRequest {

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    /**
     * Manifest details and contact info.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private ManifestCreateRequest manifestCreateRequest;

    @JsonCreator
    public CreateManifestRequest(
            Optional<String> shippoApiVersion,
            ManifestCreateRequest manifestCreateRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.manifestCreateRequest = manifestCreateRequest;
    }
    
    public CreateManifestRequest(
            ManifestCreateRequest manifestCreateRequest) {
        this(Optional.empty(), manifestCreateRequest);
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    /**
     * Manifest details and contact info.
     */
    @JsonIgnore
    public ManifestCreateRequest manifestCreateRequest() {
        return manifestCreateRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateManifestRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateManifestRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * Manifest details and contact info.
     */
    public CreateManifestRequest withManifestCreateRequest(ManifestCreateRequest manifestCreateRequest) {
        Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
        this.manifestCreateRequest = manifestCreateRequest;
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
        CreateManifestRequest other = (CreateManifestRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.manifestCreateRequest, other.manifestCreateRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            manifestCreateRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateManifestRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "manifestCreateRequest", manifestCreateRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private ManifestCreateRequest manifestCreateRequest;  
        
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
         * Manifest details and contact info.
         */
        public Builder manifestCreateRequest(ManifestCreateRequest manifestCreateRequest) {
            Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
            this.manifestCreateRequest = manifestCreateRequest;
            return this;
        }
        
        public CreateManifestRequest build() {
            return new CreateManifestRequest(
                shippoApiVersion,
                manifestCreateRequest);
        }
    }
}


/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class BatchShipmentCreateRequest {

    /**
     * Object ID of the carrier account to be used for this shipment (will override batch default)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("carrier_account")
    private Optional<String> carrierAccount;

    /**
     * A string of up to 100 characters that can be filled with any additional information you want 
     * to attach to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<String> metadata;

    /**
     * A token that sets the shipping method for the batch, overriding the batch default. 
     * Servicelevel tokens can be found &lt;a href="#tag/Service-Levels"&gt;in this list&lt;/a&gt; 
     * or &lt;a href="#operation/ListCarrierAccounts"&gt;at this endpoint&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("servicelevel_token")
    private Optional<String> servicelevelToken;

    @JsonProperty("shipment")
    private ShipmentCreateRequest shipment;

    @JsonCreator
    public BatchShipmentCreateRequest(
            @JsonProperty("carrier_account") Optional<String> carrierAccount,
            @JsonProperty("metadata") Optional<String> metadata,
            @JsonProperty("servicelevel_token") Optional<String> servicelevelToken,
            @JsonProperty("shipment") ShipmentCreateRequest shipment) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        Utils.checkNotNull(shipment, "shipment");
        this.carrierAccount = carrierAccount;
        this.metadata = metadata;
        this.servicelevelToken = servicelevelToken;
        this.shipment = shipment;
    }
    
    public BatchShipmentCreateRequest(
            ShipmentCreateRequest shipment) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), shipment);
    }

    /**
     * Object ID of the carrier account to be used for this shipment (will override batch default)
     */
    @JsonIgnore
    public Optional<String> carrierAccount() {
        return carrierAccount;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want 
     * to attach to the object.
     */
    @JsonIgnore
    public Optional<String> metadata() {
        return metadata;
    }

    /**
     * A token that sets the shipping method for the batch, overriding the batch default. 
     * Servicelevel tokens can be found &lt;a href="#tag/Service-Levels"&gt;in this list&lt;/a&gt; 
     * or &lt;a href="#operation/ListCarrierAccounts"&gt;at this endpoint&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> servicelevelToken() {
        return servicelevelToken;
    }

    @JsonIgnore
    public ShipmentCreateRequest shipment() {
        return shipment;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Object ID of the carrier account to be used for this shipment (will override batch default)
     */
    public BatchShipmentCreateRequest withCarrierAccount(String carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = Optional.ofNullable(carrierAccount);
        return this;
    }

    /**
     * Object ID of the carrier account to be used for this shipment (will override batch default)
     */
    public BatchShipmentCreateRequest withCarrierAccount(Optional<String> carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = carrierAccount;
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want 
     * to attach to the object.
     */
    public BatchShipmentCreateRequest withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want 
     * to attach to the object.
     */
    public BatchShipmentCreateRequest withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * A token that sets the shipping method for the batch, overriding the batch default. 
     * Servicelevel tokens can be found &lt;a href="#tag/Service-Levels"&gt;in this list&lt;/a&gt; 
     * or &lt;a href="#operation/ListCarrierAccounts"&gt;at this endpoint&lt;/a&gt;.
     */
    public BatchShipmentCreateRequest withServicelevelToken(String servicelevelToken) {
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        this.servicelevelToken = Optional.ofNullable(servicelevelToken);
        return this;
    }

    /**
     * A token that sets the shipping method for the batch, overriding the batch default. 
     * Servicelevel tokens can be found &lt;a href="#tag/Service-Levels"&gt;in this list&lt;/a&gt; 
     * or &lt;a href="#operation/ListCarrierAccounts"&gt;at this endpoint&lt;/a&gt;.
     */
    public BatchShipmentCreateRequest withServicelevelToken(Optional<String> servicelevelToken) {
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        this.servicelevelToken = servicelevelToken;
        return this;
    }

    public BatchShipmentCreateRequest withShipment(ShipmentCreateRequest shipment) {
        Utils.checkNotNull(shipment, "shipment");
        this.shipment = shipment;
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
        BatchShipmentCreateRequest other = (BatchShipmentCreateRequest) o;
        return 
            Objects.deepEquals(this.carrierAccount, other.carrierAccount) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.servicelevelToken, other.servicelevelToken) &&
            Objects.deepEquals(this.shipment, other.shipment);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            carrierAccount,
            metadata,
            servicelevelToken,
            shipment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BatchShipmentCreateRequest.class,
                "carrierAccount", carrierAccount,
                "metadata", metadata,
                "servicelevelToken", servicelevelToken,
                "shipment", shipment);
    }
    
    public final static class Builder {
 
        private Optional<String> carrierAccount = Optional.empty();
 
        private Optional<String> metadata = Optional.empty();
 
        private Optional<String> servicelevelToken = Optional.empty();
 
        private ShipmentCreateRequest shipment;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the carrier account to be used for this shipment (will override batch default)
         */
        public Builder carrierAccount(String carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = Optional.ofNullable(carrierAccount);
            return this;
        }

        /**
         * Object ID of the carrier account to be used for this shipment (will override batch default)
         */
        public Builder carrierAccount(Optional<String> carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = carrierAccount;
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want 
         * to attach to the object.
         */
        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want 
         * to attach to the object.
         */
        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * A token that sets the shipping method for the batch, overriding the batch default. 
         * Servicelevel tokens can be found &lt;a href="#tag/Service-Levels"&gt;in this list&lt;/a&gt; 
         * or &lt;a href="#operation/ListCarrierAccounts"&gt;at this endpoint&lt;/a&gt;.
         */
        public Builder servicelevelToken(String servicelevelToken) {
            Utils.checkNotNull(servicelevelToken, "servicelevelToken");
            this.servicelevelToken = Optional.ofNullable(servicelevelToken);
            return this;
        }

        /**
         * A token that sets the shipping method for the batch, overriding the batch default. 
         * Servicelevel tokens can be found &lt;a href="#tag/Service-Levels"&gt;in this list&lt;/a&gt; 
         * or &lt;a href="#operation/ListCarrierAccounts"&gt;at this endpoint&lt;/a&gt;.
         */
        public Builder servicelevelToken(Optional<String> servicelevelToken) {
            Utils.checkNotNull(servicelevelToken, "servicelevelToken");
            this.servicelevelToken = servicelevelToken;
            return this;
        }

        public Builder shipment(ShipmentCreateRequest shipment) {
            Utils.checkNotNull(shipment, "shipment");
            this.shipment = shipment;
            return this;
        }
        
        public BatchShipmentCreateRequest build() {
            return new BatchShipmentCreateRequest(
                carrierAccount,
                metadata,
                servicelevelToken,
                shipment);
        }
    }
}


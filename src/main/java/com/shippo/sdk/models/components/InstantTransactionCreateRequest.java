/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.LazySingletonValue;
import com.shippo.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class InstantTransactionCreateRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("async")
    private Optional<Boolean> async;

    @JsonProperty("carrier_account")
    private String carrierAccount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label_file_type")
    private Optional<? extends LabelFileType> labelFileType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<String> metadata;

    @JsonProperty("servicelevel_token")
    private String servicelevelToken;

    @JsonProperty("shipment")
    private ShipmentCreateRequest shipment;

    @JsonCreator
    public InstantTransactionCreateRequest(
            @JsonProperty("async") Optional<Boolean> async,
            @JsonProperty("carrier_account") String carrierAccount,
            @JsonProperty("label_file_type") Optional<? extends LabelFileType> labelFileType,
            @JsonProperty("metadata") Optional<String> metadata,
            @JsonProperty("servicelevel_token") String servicelevelToken,
            @JsonProperty("shipment") ShipmentCreateRequest shipment) {
        Utils.checkNotNull(async, "async");
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        Utils.checkNotNull(labelFileType, "labelFileType");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        Utils.checkNotNull(shipment, "shipment");
        this.async = async;
        this.carrierAccount = carrierAccount;
        this.labelFileType = labelFileType;
        this.metadata = metadata;
        this.servicelevelToken = servicelevelToken;
        this.shipment = shipment;
    }
    
    public InstantTransactionCreateRequest(
            String carrierAccount,
            String servicelevelToken,
            ShipmentCreateRequest shipment) {
        this(Optional.empty(), carrierAccount, Optional.empty(), Optional.empty(), servicelevelToken, shipment);
    }

    @JsonIgnore
    public Optional<Boolean> async() {
        return async;
    }

    @JsonIgnore
    public String carrierAccount() {
        return carrierAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LabelFileType> labelFileType() {
        return (Optional<LabelFileType>) labelFileType;
    }

    @JsonIgnore
    public Optional<String> metadata() {
        return metadata;
    }

    @JsonIgnore
    public String servicelevelToken() {
        return servicelevelToken;
    }

    @JsonIgnore
    public ShipmentCreateRequest shipment() {
        return shipment;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public InstantTransactionCreateRequest withAsync(boolean async) {
        Utils.checkNotNull(async, "async");
        this.async = Optional.ofNullable(async);
        return this;
    }

    public InstantTransactionCreateRequest withAsync(Optional<Boolean> async) {
        Utils.checkNotNull(async, "async");
        this.async = async;
        return this;
    }

    public InstantTransactionCreateRequest withCarrierAccount(String carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = carrierAccount;
        return this;
    }

    public InstantTransactionCreateRequest withLabelFileType(LabelFileType labelFileType) {
        Utils.checkNotNull(labelFileType, "labelFileType");
        this.labelFileType = Optional.ofNullable(labelFileType);
        return this;
    }

    public InstantTransactionCreateRequest withLabelFileType(Optional<? extends LabelFileType> labelFileType) {
        Utils.checkNotNull(labelFileType, "labelFileType");
        this.labelFileType = labelFileType;
        return this;
    }

    public InstantTransactionCreateRequest withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public InstantTransactionCreateRequest withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public InstantTransactionCreateRequest withServicelevelToken(String servicelevelToken) {
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        this.servicelevelToken = servicelevelToken;
        return this;
    }

    public InstantTransactionCreateRequest withShipment(ShipmentCreateRequest shipment) {
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
        InstantTransactionCreateRequest other = (InstantTransactionCreateRequest) o;
        return 
            Objects.deepEquals(this.async, other.async) &&
            Objects.deepEquals(this.carrierAccount, other.carrierAccount) &&
            Objects.deepEquals(this.labelFileType, other.labelFileType) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.servicelevelToken, other.servicelevelToken) &&
            Objects.deepEquals(this.shipment, other.shipment);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            async,
            carrierAccount,
            labelFileType,
            metadata,
            servicelevelToken,
            shipment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InstantTransactionCreateRequest.class,
                "async", async,
                "carrierAccount", carrierAccount,
                "labelFileType", labelFileType,
                "metadata", metadata,
                "servicelevelToken", servicelevelToken,
                "shipment", shipment);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> async;
 
        private String carrierAccount;
 
        private Optional<? extends LabelFileType> labelFileType = Optional.empty();
 
        private Optional<String> metadata = Optional.empty();
 
        private String servicelevelToken;
 
        private ShipmentCreateRequest shipment;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder async(boolean async) {
            Utils.checkNotNull(async, "async");
            this.async = Optional.ofNullable(async);
            return this;
        }

        public Builder async(Optional<Boolean> async) {
            Utils.checkNotNull(async, "async");
            this.async = async;
            return this;
        }

        public Builder carrierAccount(String carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = carrierAccount;
            return this;
        }

        public Builder labelFileType(LabelFileType labelFileType) {
            Utils.checkNotNull(labelFileType, "labelFileType");
            this.labelFileType = Optional.ofNullable(labelFileType);
            return this;
        }

        public Builder labelFileType(Optional<? extends LabelFileType> labelFileType) {
            Utils.checkNotNull(labelFileType, "labelFileType");
            this.labelFileType = labelFileType;
            return this;
        }

        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder servicelevelToken(String servicelevelToken) {
            Utils.checkNotNull(servicelevelToken, "servicelevelToken");
            this.servicelevelToken = servicelevelToken;
            return this;
        }

        public Builder shipment(ShipmentCreateRequest shipment) {
            Utils.checkNotNull(shipment, "shipment");
            this.shipment = shipment;
            return this;
        }
        
        public InstantTransactionCreateRequest build() {
            if (async == null) {
                async = _SINGLETON_VALUE_Async.value();
            }            return new InstantTransactionCreateRequest(
                async,
                carrierAccount,
                labelFileType,
                metadata,
                servicelevelToken,
                shipment);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Async =
                new LazySingletonValue<>(
                        "async",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}


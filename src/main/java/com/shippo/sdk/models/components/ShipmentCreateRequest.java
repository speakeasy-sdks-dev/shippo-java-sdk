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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ShipmentCreateRequest {

    /**
     * An object holding optional extra services to be requested.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extra")
    private Optional<? extends ShipmentExtra> extra;

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<String> metadata;

    /**
     * Date the shipment will be tendered to the carrier. Must be in the format `2014-01-18T00:35:03.463Z`. 
     * Defaults to current date and time if no value is provided. Please note that some carriers require this value to
     * be in the future, on a working day, or similar.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipment_date")
    private Optional<String> shipmentDate;

    @JsonProperty("address_from")
    private AddressFrom addressFrom;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_return")
    private Optional<? extends AddressReturn> addressReturn;

    @JsonProperty("address_to")
    private AddressTo addressTo;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customs_declaration")
    private Optional<? extends ShipmentCreateRequestCustomsDeclaration> customsDeclaration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("async")
    private Optional<Boolean> async;

    /**
     * List of &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; `object_id`s used to filter 
     * the returned rates.  If set, only rates from these carriers will be returned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("carrier_accounts")
    private Optional<? extends List<String>> carrierAccounts;

    @JsonProperty("parcels")
    private List<Parcels> parcels;

    @JsonCreator
    public ShipmentCreateRequest(
            @JsonProperty("extra") Optional<? extends ShipmentExtra> extra,
            @JsonProperty("metadata") Optional<String> metadata,
            @JsonProperty("shipment_date") Optional<String> shipmentDate,
            @JsonProperty("address_from") AddressFrom addressFrom,
            @JsonProperty("address_return") Optional<? extends AddressReturn> addressReturn,
            @JsonProperty("address_to") AddressTo addressTo,
            @JsonProperty("customs_declaration") Optional<? extends ShipmentCreateRequestCustomsDeclaration> customsDeclaration,
            @JsonProperty("async") Optional<Boolean> async,
            @JsonProperty("carrier_accounts") Optional<? extends List<String>> carrierAccounts,
            @JsonProperty("parcels") List<Parcels> parcels) {
        Utils.checkNotNull(extra, "extra");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(shipmentDate, "shipmentDate");
        Utils.checkNotNull(addressFrom, "addressFrom");
        Utils.checkNotNull(addressReturn, "addressReturn");
        Utils.checkNotNull(addressTo, "addressTo");
        Utils.checkNotNull(customsDeclaration, "customsDeclaration");
        Utils.checkNotNull(async, "async");
        Utils.checkNotNull(carrierAccounts, "carrierAccounts");
        Utils.checkNotNull(parcels, "parcels");
        this.extra = extra;
        this.metadata = metadata;
        this.shipmentDate = shipmentDate;
        this.addressFrom = addressFrom;
        this.addressReturn = addressReturn;
        this.addressTo = addressTo;
        this.customsDeclaration = customsDeclaration;
        this.async = async;
        this.carrierAccounts = carrierAccounts;
        this.parcels = parcels;
    }
    
    public ShipmentCreateRequest(
            AddressFrom addressFrom,
            AddressTo addressTo,
            List<Parcels> parcels) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), addressFrom, Optional.empty(), addressTo, Optional.empty(), Optional.empty(), Optional.empty(), parcels);
    }

    /**
     * An object holding optional extra services to be requested.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ShipmentExtra> extra() {
        return (Optional<ShipmentExtra>) extra;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    @JsonIgnore
    public Optional<String> metadata() {
        return metadata;
    }

    /**
     * Date the shipment will be tendered to the carrier. Must be in the format `2014-01-18T00:35:03.463Z`. 
     * Defaults to current date and time if no value is provided. Please note that some carriers require this value to
     * be in the future, on a working day, or similar.
     */
    @JsonIgnore
    public Optional<String> shipmentDate() {
        return shipmentDate;
    }

    @JsonIgnore
    public AddressFrom addressFrom() {
        return addressFrom;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AddressReturn> addressReturn() {
        return (Optional<AddressReturn>) addressReturn;
    }

    @JsonIgnore
    public AddressTo addressTo() {
        return addressTo;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ShipmentCreateRequestCustomsDeclaration> customsDeclaration() {
        return (Optional<ShipmentCreateRequestCustomsDeclaration>) customsDeclaration;
    }

    @JsonIgnore
    public Optional<Boolean> async() {
        return async;
    }

    /**
     * List of &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; `object_id`s used to filter 
     * the returned rates.  If set, only rates from these carriers will be returned.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> carrierAccounts() {
        return (Optional<List<String>>) carrierAccounts;
    }

    @JsonIgnore
    public List<Parcels> parcels() {
        return parcels;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An object holding optional extra services to be requested.
     */
    public ShipmentCreateRequest withExtra(ShipmentExtra extra) {
        Utils.checkNotNull(extra, "extra");
        this.extra = Optional.ofNullable(extra);
        return this;
    }

    /**
     * An object holding optional extra services to be requested.
     */
    public ShipmentCreateRequest withExtra(Optional<? extends ShipmentExtra> extra) {
        Utils.checkNotNull(extra, "extra");
        this.extra = extra;
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    public ShipmentCreateRequest withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    public ShipmentCreateRequest withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Date the shipment will be tendered to the carrier. Must be in the format `2014-01-18T00:35:03.463Z`. 
     * Defaults to current date and time if no value is provided. Please note that some carriers require this value to
     * be in the future, on a working day, or similar.
     */
    public ShipmentCreateRequest withShipmentDate(String shipmentDate) {
        Utils.checkNotNull(shipmentDate, "shipmentDate");
        this.shipmentDate = Optional.ofNullable(shipmentDate);
        return this;
    }

    /**
     * Date the shipment will be tendered to the carrier. Must be in the format `2014-01-18T00:35:03.463Z`. 
     * Defaults to current date and time if no value is provided. Please note that some carriers require this value to
     * be in the future, on a working day, or similar.
     */
    public ShipmentCreateRequest withShipmentDate(Optional<String> shipmentDate) {
        Utils.checkNotNull(shipmentDate, "shipmentDate");
        this.shipmentDate = shipmentDate;
        return this;
    }

    public ShipmentCreateRequest withAddressFrom(AddressFrom addressFrom) {
        Utils.checkNotNull(addressFrom, "addressFrom");
        this.addressFrom = addressFrom;
        return this;
    }

    public ShipmentCreateRequest withAddressReturn(AddressReturn addressReturn) {
        Utils.checkNotNull(addressReturn, "addressReturn");
        this.addressReturn = Optional.ofNullable(addressReturn);
        return this;
    }

    public ShipmentCreateRequest withAddressReturn(Optional<? extends AddressReturn> addressReturn) {
        Utils.checkNotNull(addressReturn, "addressReturn");
        this.addressReturn = addressReturn;
        return this;
    }

    public ShipmentCreateRequest withAddressTo(AddressTo addressTo) {
        Utils.checkNotNull(addressTo, "addressTo");
        this.addressTo = addressTo;
        return this;
    }

    public ShipmentCreateRequest withCustomsDeclaration(ShipmentCreateRequestCustomsDeclaration customsDeclaration) {
        Utils.checkNotNull(customsDeclaration, "customsDeclaration");
        this.customsDeclaration = Optional.ofNullable(customsDeclaration);
        return this;
    }

    public ShipmentCreateRequest withCustomsDeclaration(Optional<? extends ShipmentCreateRequestCustomsDeclaration> customsDeclaration) {
        Utils.checkNotNull(customsDeclaration, "customsDeclaration");
        this.customsDeclaration = customsDeclaration;
        return this;
    }

    public ShipmentCreateRequest withAsync(boolean async) {
        Utils.checkNotNull(async, "async");
        this.async = Optional.ofNullable(async);
        return this;
    }

    public ShipmentCreateRequest withAsync(Optional<Boolean> async) {
        Utils.checkNotNull(async, "async");
        this.async = async;
        return this;
    }

    /**
     * List of &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; `object_id`s used to filter 
     * the returned rates.  If set, only rates from these carriers will be returned.
     */
    public ShipmentCreateRequest withCarrierAccounts(List<String> carrierAccounts) {
        Utils.checkNotNull(carrierAccounts, "carrierAccounts");
        this.carrierAccounts = Optional.ofNullable(carrierAccounts);
        return this;
    }

    /**
     * List of &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; `object_id`s used to filter 
     * the returned rates.  If set, only rates from these carriers will be returned.
     */
    public ShipmentCreateRequest withCarrierAccounts(Optional<? extends List<String>> carrierAccounts) {
        Utils.checkNotNull(carrierAccounts, "carrierAccounts");
        this.carrierAccounts = carrierAccounts;
        return this;
    }

    public ShipmentCreateRequest withParcels(List<Parcels> parcels) {
        Utils.checkNotNull(parcels, "parcels");
        this.parcels = parcels;
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
        ShipmentCreateRequest other = (ShipmentCreateRequest) o;
        return 
            Objects.deepEquals(this.extra, other.extra) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.shipmentDate, other.shipmentDate) &&
            Objects.deepEquals(this.addressFrom, other.addressFrom) &&
            Objects.deepEquals(this.addressReturn, other.addressReturn) &&
            Objects.deepEquals(this.addressTo, other.addressTo) &&
            Objects.deepEquals(this.customsDeclaration, other.customsDeclaration) &&
            Objects.deepEquals(this.async, other.async) &&
            Objects.deepEquals(this.carrierAccounts, other.carrierAccounts) &&
            Objects.deepEquals(this.parcels, other.parcels);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            extra,
            metadata,
            shipmentDate,
            addressFrom,
            addressReturn,
            addressTo,
            customsDeclaration,
            async,
            carrierAccounts,
            parcels);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ShipmentCreateRequest.class,
                "extra", extra,
                "metadata", metadata,
                "shipmentDate", shipmentDate,
                "addressFrom", addressFrom,
                "addressReturn", addressReturn,
                "addressTo", addressTo,
                "customsDeclaration", customsDeclaration,
                "async", async,
                "carrierAccounts", carrierAccounts,
                "parcels", parcels);
    }
    
    public final static class Builder {
 
        private Optional<? extends ShipmentExtra> extra = Optional.empty();
 
        private Optional<String> metadata = Optional.empty();
 
        private Optional<String> shipmentDate = Optional.empty();
 
        private AddressFrom addressFrom;
 
        private Optional<? extends AddressReturn> addressReturn = Optional.empty();
 
        private AddressTo addressTo;
 
        private Optional<? extends ShipmentCreateRequestCustomsDeclaration> customsDeclaration = Optional.empty();
 
        private Optional<Boolean> async = Optional.empty();
 
        private Optional<? extends List<String>> carrierAccounts = Optional.empty();
 
        private List<Parcels> parcels;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An object holding optional extra services to be requested.
         */
        public Builder extra(ShipmentExtra extra) {
            Utils.checkNotNull(extra, "extra");
            this.extra = Optional.ofNullable(extra);
            return this;
        }

        /**
         * An object holding optional extra services to be requested.
         */
        public Builder extra(Optional<? extends ShipmentExtra> extra) {
            Utils.checkNotNull(extra, "extra");
            this.extra = extra;
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
         */
        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
         */
        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Date the shipment will be tendered to the carrier. Must be in the format `2014-01-18T00:35:03.463Z`. 
         * Defaults to current date and time if no value is provided. Please note that some carriers require this value to
         * be in the future, on a working day, or similar.
         */
        public Builder shipmentDate(String shipmentDate) {
            Utils.checkNotNull(shipmentDate, "shipmentDate");
            this.shipmentDate = Optional.ofNullable(shipmentDate);
            return this;
        }

        /**
         * Date the shipment will be tendered to the carrier. Must be in the format `2014-01-18T00:35:03.463Z`. 
         * Defaults to current date and time if no value is provided. Please note that some carriers require this value to
         * be in the future, on a working day, or similar.
         */
        public Builder shipmentDate(Optional<String> shipmentDate) {
            Utils.checkNotNull(shipmentDate, "shipmentDate");
            this.shipmentDate = shipmentDate;
            return this;
        }

        public Builder addressFrom(AddressFrom addressFrom) {
            Utils.checkNotNull(addressFrom, "addressFrom");
            this.addressFrom = addressFrom;
            return this;
        }

        public Builder addressReturn(AddressReturn addressReturn) {
            Utils.checkNotNull(addressReturn, "addressReturn");
            this.addressReturn = Optional.ofNullable(addressReturn);
            return this;
        }

        public Builder addressReturn(Optional<? extends AddressReturn> addressReturn) {
            Utils.checkNotNull(addressReturn, "addressReturn");
            this.addressReturn = addressReturn;
            return this;
        }

        public Builder addressTo(AddressTo addressTo) {
            Utils.checkNotNull(addressTo, "addressTo");
            this.addressTo = addressTo;
            return this;
        }

        public Builder customsDeclaration(ShipmentCreateRequestCustomsDeclaration customsDeclaration) {
            Utils.checkNotNull(customsDeclaration, "customsDeclaration");
            this.customsDeclaration = Optional.ofNullable(customsDeclaration);
            return this;
        }

        public Builder customsDeclaration(Optional<? extends ShipmentCreateRequestCustomsDeclaration> customsDeclaration) {
            Utils.checkNotNull(customsDeclaration, "customsDeclaration");
            this.customsDeclaration = customsDeclaration;
            return this;
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

        /**
         * List of &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; `object_id`s used to filter 
         * the returned rates.  If set, only rates from these carriers will be returned.
         */
        public Builder carrierAccounts(List<String> carrierAccounts) {
            Utils.checkNotNull(carrierAccounts, "carrierAccounts");
            this.carrierAccounts = Optional.ofNullable(carrierAccounts);
            return this;
        }

        /**
         * List of &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; `object_id`s used to filter 
         * the returned rates.  If set, only rates from these carriers will be returned.
         */
        public Builder carrierAccounts(Optional<? extends List<String>> carrierAccounts) {
            Utils.checkNotNull(carrierAccounts, "carrierAccounts");
            this.carrierAccounts = carrierAccounts;
            return this;
        }

        public Builder parcels(List<Parcels> parcels) {
            Utils.checkNotNull(parcels, "parcels");
            this.parcels = parcels;
            return this;
        }
        
        public ShipmentCreateRequest build() {
            return new ShipmentCreateRequest(
                extra,
                metadata,
                shipmentDate,
                addressFrom,
                addressReturn,
                addressTo,
                customsDeclaration,
                async,
                carrierAccounts,
                parcels);
        }
    }
}


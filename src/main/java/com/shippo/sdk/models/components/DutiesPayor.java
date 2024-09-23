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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * DutiesPayor - Specifies who will pay the duties for the shipment. Only accepted for FedEx shipments.
 */

public class DutiesPayor {

    /**
     * Account number to be billed for duties.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<String> account;

    /**
     * Party to be billed for duties.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends CustomsDeclarationCreateRequestType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends CustomsDeclarationCreateRequestAddress> address;

    @JsonCreator
    public DutiesPayor(
            @JsonProperty("account") Optional<String> account,
            @JsonProperty("type") Optional<? extends CustomsDeclarationCreateRequestType> type,
            @JsonProperty("address") Optional<? extends CustomsDeclarationCreateRequestAddress> address) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(address, "address");
        this.account = account;
        this.type = type;
        this.address = address;
    }
    
    public DutiesPayor() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Account number to be billed for duties.
     */
    @JsonIgnore
    public Optional<String> account() {
        return account;
    }

    /**
     * Party to be billed for duties.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CustomsDeclarationCreateRequestType> type() {
        return (Optional<CustomsDeclarationCreateRequestType>) type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CustomsDeclarationCreateRequestAddress> address() {
        return (Optional<CustomsDeclarationCreateRequestAddress>) address;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Account number to be billed for duties.
     */
    public DutiesPayor withAccount(String account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    /**
     * Account number to be billed for duties.
     */
    public DutiesPayor withAccount(Optional<String> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    /**
     * Party to be billed for duties.
     */
    public DutiesPayor withType(CustomsDeclarationCreateRequestType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Party to be billed for duties.
     */
    public DutiesPayor withType(Optional<? extends CustomsDeclarationCreateRequestType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public DutiesPayor withAddress(CustomsDeclarationCreateRequestAddress address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public DutiesPayor withAddress(Optional<? extends CustomsDeclarationCreateRequestAddress> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
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
        DutiesPayor other = (DutiesPayor) o;
        return 
            Objects.deepEquals(this.account, other.account) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.address, other.address);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            account,
            type,
            address);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DutiesPayor.class,
                "account", account,
                "type", type,
                "address", address);
    }
    
    public final static class Builder {
 
        private Optional<String> account = Optional.empty();
 
        private Optional<? extends CustomsDeclarationCreateRequestType> type = Optional.empty();
 
        private Optional<? extends CustomsDeclarationCreateRequestAddress> address = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Account number to be billed for duties.
         */
        public Builder account(String account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        /**
         * Account number to be billed for duties.
         */
        public Builder account(Optional<String> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        /**
         * Party to be billed for duties.
         */
        public Builder type(CustomsDeclarationCreateRequestType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Party to be billed for duties.
         */
        public Builder type(Optional<? extends CustomsDeclarationCreateRequestType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder address(CustomsDeclarationCreateRequestAddress address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends CustomsDeclarationCreateRequestAddress> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }
        
        public DutiesPayor build() {
            return new DutiesPayor(
                account,
                type,
                address);
        }
    }
}


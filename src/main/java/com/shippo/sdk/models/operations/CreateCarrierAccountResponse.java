/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.models.components.CarrierAccount;
import com.shippo.sdk.utils.Response;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class CreateCarrierAccountResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    private Optional<? extends CarrierAccount> carrierAccount;

    @JsonCreator
    public CreateCarrierAccountResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CarrierAccount> carrierAccount) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.carrierAccount = carrierAccount;
    }
    
    public CreateCarrierAccountResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CarrierAccount> carrierAccount() {
        return (Optional<CarrierAccount>) carrierAccount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateCarrierAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateCarrierAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateCarrierAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public CreateCarrierAccountResponse withCarrierAccount(CarrierAccount carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = Optional.ofNullable(carrierAccount);
        return this;
    }

    public CreateCarrierAccountResponse withCarrierAccount(Optional<? extends CarrierAccount> carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = carrierAccount;
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
        CreateCarrierAccountResponse other = (CreateCarrierAccountResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.carrierAccount, other.carrierAccount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            carrierAccount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCarrierAccountResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "carrierAccount", carrierAccount);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CarrierAccount> carrierAccount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        public Builder carrierAccount(CarrierAccount carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = Optional.ofNullable(carrierAccount);
            return this;
        }

        public Builder carrierAccount(Optional<? extends CarrierAccount> carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = carrierAccount;
            return this;
        }
        
        public CreateCarrierAccountResponse build() {
            return new CreateCarrierAccountResponse(
                contentType,
                statusCode,
                rawResponse,
                carrierAccount);
        }
    }
}


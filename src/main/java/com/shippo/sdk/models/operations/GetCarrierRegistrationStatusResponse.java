/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.models.components.CarrierAccountRegistrationStatus;
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


public class GetCarrierRegistrationStatusResponse implements Response {

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

    private Optional<? extends CarrierAccountRegistrationStatus> carrierAccountRegistrationStatus;

    @JsonCreator
    public GetCarrierRegistrationStatusResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CarrierAccountRegistrationStatus> carrierAccountRegistrationStatus) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(carrierAccountRegistrationStatus, "carrierAccountRegistrationStatus");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.carrierAccountRegistrationStatus = carrierAccountRegistrationStatus;
    }
    
    public GetCarrierRegistrationStatusResponse(
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
    public Optional<CarrierAccountRegistrationStatus> carrierAccountRegistrationStatus() {
        return (Optional<CarrierAccountRegistrationStatus>) carrierAccountRegistrationStatus;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCarrierRegistrationStatusResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCarrierRegistrationStatusResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCarrierRegistrationStatusResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public GetCarrierRegistrationStatusResponse withCarrierAccountRegistrationStatus(CarrierAccountRegistrationStatus carrierAccountRegistrationStatus) {
        Utils.checkNotNull(carrierAccountRegistrationStatus, "carrierAccountRegistrationStatus");
        this.carrierAccountRegistrationStatus = Optional.ofNullable(carrierAccountRegistrationStatus);
        return this;
    }

    public GetCarrierRegistrationStatusResponse withCarrierAccountRegistrationStatus(Optional<? extends CarrierAccountRegistrationStatus> carrierAccountRegistrationStatus) {
        Utils.checkNotNull(carrierAccountRegistrationStatus, "carrierAccountRegistrationStatus");
        this.carrierAccountRegistrationStatus = carrierAccountRegistrationStatus;
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
        GetCarrierRegistrationStatusResponse other = (GetCarrierRegistrationStatusResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.carrierAccountRegistrationStatus, other.carrierAccountRegistrationStatus);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            carrierAccountRegistrationStatus);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCarrierRegistrationStatusResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "carrierAccountRegistrationStatus", carrierAccountRegistrationStatus);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CarrierAccountRegistrationStatus> carrierAccountRegistrationStatus = Optional.empty();  
        
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

        public Builder carrierAccountRegistrationStatus(CarrierAccountRegistrationStatus carrierAccountRegistrationStatus) {
            Utils.checkNotNull(carrierAccountRegistrationStatus, "carrierAccountRegistrationStatus");
            this.carrierAccountRegistrationStatus = Optional.ofNullable(carrierAccountRegistrationStatus);
            return this;
        }

        public Builder carrierAccountRegistrationStatus(Optional<? extends CarrierAccountRegistrationStatus> carrierAccountRegistrationStatus) {
            Utils.checkNotNull(carrierAccountRegistrationStatus, "carrierAccountRegistrationStatus");
            this.carrierAccountRegistrationStatus = carrierAccountRegistrationStatus;
            return this;
        }
        
        public GetCarrierRegistrationStatusResponse build() {
            return new GetCarrierRegistrationStatusResponse(
                contentType,
                statusCode,
                rawResponse,
                carrierAccountRegistrationStatus);
        }
    }
}


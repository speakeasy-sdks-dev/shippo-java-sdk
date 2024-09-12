/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.models.components.CustomsDeclaration;
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


public class GetCustomsDeclarationResponse implements Response {

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

    private Optional<? extends CustomsDeclaration> customsDeclaration;

    @JsonCreator
    public GetCustomsDeclarationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CustomsDeclaration> customsDeclaration) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(customsDeclaration, "customsDeclaration");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.customsDeclaration = customsDeclaration;
    }
    
    public GetCustomsDeclarationResponse(
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
    public Optional<CustomsDeclaration> customsDeclaration() {
        return (Optional<CustomsDeclaration>) customsDeclaration;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetCustomsDeclarationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetCustomsDeclarationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetCustomsDeclarationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public GetCustomsDeclarationResponse withCustomsDeclaration(CustomsDeclaration customsDeclaration) {
        Utils.checkNotNull(customsDeclaration, "customsDeclaration");
        this.customsDeclaration = Optional.ofNullable(customsDeclaration);
        return this;
    }

    public GetCustomsDeclarationResponse withCustomsDeclaration(Optional<? extends CustomsDeclaration> customsDeclaration) {
        Utils.checkNotNull(customsDeclaration, "customsDeclaration");
        this.customsDeclaration = customsDeclaration;
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
        GetCustomsDeclarationResponse other = (GetCustomsDeclarationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.customsDeclaration, other.customsDeclaration);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            customsDeclaration);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCustomsDeclarationResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "customsDeclaration", customsDeclaration);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CustomsDeclaration> customsDeclaration = Optional.empty();  
        
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

        public Builder customsDeclaration(CustomsDeclaration customsDeclaration) {
            Utils.checkNotNull(customsDeclaration, "customsDeclaration");
            this.customsDeclaration = Optional.ofNullable(customsDeclaration);
            return this;
        }

        public Builder customsDeclaration(Optional<? extends CustomsDeclaration> customsDeclaration) {
            Utils.checkNotNull(customsDeclaration, "customsDeclaration");
            this.customsDeclaration = customsDeclaration;
            return this;
        }
        
        public GetCustomsDeclarationResponse build() {
            return new GetCustomsDeclarationResponse(
                contentType,
                statusCode,
                rawResponse,
                customsDeclaration);
        }
    }
}


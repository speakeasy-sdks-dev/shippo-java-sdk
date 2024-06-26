/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ParcelCreateRequest {

    /**
     * An object holding optional extra services to be requested for each parcel in a multi-piece shipment. 
     * See the &lt;a href="#section/Parcel-Extras"&gt;Parcel Extra table below&lt;/a&gt; for all available services.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extra")
    private Optional<? extends ParcelExtra> extra;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends String> metadata;

    /**
     * The unit used for weight.
     */
    @JsonProperty("mass_unit")
    private WeightUnitEnum massUnit;

    /**
     * Weight of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * The measure unit used for length, width and height.
     */
    @JsonProperty("distance_unit")
    private DistanceUnitEnum distanceUnit;

    /**
     * Height of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonProperty("height")
    private String height;

    /**
     * Length of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonProperty("length")
    private String length;

    /**
     * Width of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonProperty("width")
    private String width;

    @JsonCreator
    public ParcelCreateRequest(
            @JsonProperty("extra") Optional<? extends ParcelExtra> extra,
            @JsonProperty("metadata") Optional<? extends String> metadata,
            @JsonProperty("mass_unit") WeightUnitEnum massUnit,
            @JsonProperty("weight") String weight,
            @JsonProperty("distance_unit") DistanceUnitEnum distanceUnit,
            @JsonProperty("height") String height,
            @JsonProperty("length") String length,
            @JsonProperty("width") String width) {
        Utils.checkNotNull(extra, "extra");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(massUnit, "massUnit");
        Utils.checkNotNull(weight, "weight");
        Utils.checkNotNull(distanceUnit, "distanceUnit");
        Utils.checkNotNull(height, "height");
        Utils.checkNotNull(length, "length");
        Utils.checkNotNull(width, "width");
        this.extra = extra;
        this.metadata = metadata;
        this.massUnit = massUnit;
        this.weight = weight;
        this.distanceUnit = distanceUnit;
        this.height = height;
        this.length = length;
        this.width = width;
    }
    
    public ParcelCreateRequest(
            WeightUnitEnum massUnit,
            String weight,
            DistanceUnitEnum distanceUnit,
            String height,
            String length,
            String width) {
        this(Optional.empty(), Optional.empty(), massUnit, weight, distanceUnit, height, length, width);
    }

    /**
     * An object holding optional extra services to be requested for each parcel in a multi-piece shipment. 
     * See the &lt;a href="#section/Parcel-Extras"&gt;Parcel Extra table below&lt;/a&gt; for all available services.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ParcelExtra> extra() {
        return (Optional<ParcelExtra>) extra;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> metadata() {
        return (Optional<String>) metadata;
    }

    /**
     * The unit used for weight.
     */
    @JsonIgnore
    public WeightUnitEnum massUnit() {
        return massUnit;
    }

    /**
     * Weight of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonIgnore
    public String weight() {
        return weight;
    }

    /**
     * The measure unit used for length, width and height.
     */
    @JsonIgnore
    public DistanceUnitEnum distanceUnit() {
        return distanceUnit;
    }

    /**
     * Height of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonIgnore
    public String height() {
        return height;
    }

    /**
     * Length of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonIgnore
    public String length() {
        return length;
    }

    /**
     * Width of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    @JsonIgnore
    public String width() {
        return width;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An object holding optional extra services to be requested for each parcel in a multi-piece shipment. 
     * See the &lt;a href="#section/Parcel-Extras"&gt;Parcel Extra table below&lt;/a&gt; for all available services.
     */
    public ParcelCreateRequest withExtra(ParcelExtra extra) {
        Utils.checkNotNull(extra, "extra");
        this.extra = Optional.ofNullable(extra);
        return this;
    }

    /**
     * An object holding optional extra services to be requested for each parcel in a multi-piece shipment. 
     * See the &lt;a href="#section/Parcel-Extras"&gt;Parcel Extra table below&lt;/a&gt; for all available services.
     */
    public ParcelCreateRequest withExtra(Optional<? extends ParcelExtra> extra) {
        Utils.checkNotNull(extra, "extra");
        this.extra = extra;
        return this;
    }

    public ParcelCreateRequest withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public ParcelCreateRequest withMetadata(Optional<? extends String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The unit used for weight.
     */
    public ParcelCreateRequest withMassUnit(WeightUnitEnum massUnit) {
        Utils.checkNotNull(massUnit, "massUnit");
        this.massUnit = massUnit;
        return this;
    }

    /**
     * Weight of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    public ParcelCreateRequest withWeight(String weight) {
        Utils.checkNotNull(weight, "weight");
        this.weight = weight;
        return this;
    }

    /**
     * The measure unit used for length, width and height.
     */
    public ParcelCreateRequest withDistanceUnit(DistanceUnitEnum distanceUnit) {
        Utils.checkNotNull(distanceUnit, "distanceUnit");
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * Height of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    public ParcelCreateRequest withHeight(String height) {
        Utils.checkNotNull(height, "height");
        this.height = height;
        return this;
    }

    /**
     * Length of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    public ParcelCreateRequest withLength(String length) {
        Utils.checkNotNull(length, "length");
        this.length = length;
        return this;
    }

    /**
     * Width of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
     */
    public ParcelCreateRequest withWidth(String width) {
        Utils.checkNotNull(width, "width");
        this.width = width;
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
        ParcelCreateRequest other = (ParcelCreateRequest) o;
        return 
            java.util.Objects.deepEquals(this.extra, other.extra) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.massUnit, other.massUnit) &&
            java.util.Objects.deepEquals(this.weight, other.weight) &&
            java.util.Objects.deepEquals(this.distanceUnit, other.distanceUnit) &&
            java.util.Objects.deepEquals(this.height, other.height) &&
            java.util.Objects.deepEquals(this.length, other.length) &&
            java.util.Objects.deepEquals(this.width, other.width);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            extra,
            metadata,
            massUnit,
            weight,
            distanceUnit,
            height,
            length,
            width);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ParcelCreateRequest.class,
                "extra", extra,
                "metadata", metadata,
                "massUnit", massUnit,
                "weight", weight,
                "distanceUnit", distanceUnit,
                "height", height,
                "length", length,
                "width", width);
    }
    
    public final static class Builder {
 
        private Optional<? extends ParcelExtra> extra = Optional.empty();
 
        private Optional<? extends String> metadata = Optional.empty();
 
        private WeightUnitEnum massUnit;
 
        private String weight;
 
        private DistanceUnitEnum distanceUnit;
 
        private String height;
 
        private String length;
 
        private String width;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An object holding optional extra services to be requested for each parcel in a multi-piece shipment. 
         * See the &lt;a href="#section/Parcel-Extras"&gt;Parcel Extra table below&lt;/a&gt; for all available services.
         */
        public Builder extra(ParcelExtra extra) {
            Utils.checkNotNull(extra, "extra");
            this.extra = Optional.ofNullable(extra);
            return this;
        }

        /**
         * An object holding optional extra services to be requested for each parcel in a multi-piece shipment. 
         * See the &lt;a href="#section/Parcel-Extras"&gt;Parcel Extra table below&lt;/a&gt; for all available services.
         */
        public Builder extra(Optional<? extends ParcelExtra> extra) {
            Utils.checkNotNull(extra, "extra");
            this.extra = extra;
            return this;
        }

        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * The unit used for weight.
         */
        public Builder massUnit(WeightUnitEnum massUnit) {
            Utils.checkNotNull(massUnit, "massUnit");
            this.massUnit = massUnit;
            return this;
        }

        /**
         * Weight of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
         */
        public Builder weight(String weight) {
            Utils.checkNotNull(weight, "weight");
            this.weight = weight;
            return this;
        }

        /**
         * The measure unit used for length, width and height.
         */
        public Builder distanceUnit(DistanceUnitEnum distanceUnit) {
            Utils.checkNotNull(distanceUnit, "distanceUnit");
            this.distanceUnit = distanceUnit;
            return this;
        }

        /**
         * Height of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.
         */
        public Builder height(String height) {
            Utils.checkNotNull(height, "height");
            this.height = height;
            return this;
        }

        /**
         * Length of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
         */
        public Builder length(String length) {
            Utils.checkNotNull(length, "length");
            this.length = length;
            return this;
        }

        /**
         * Width of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted.
         */
        public Builder width(String width) {
            Utils.checkNotNull(width, "width");
            this.width = width;
            return this;
        }
        
        public ParcelCreateRequest build() {
            return new ParcelCreateRequest(
                extra,
                metadata,
                massUnit,
                weight,
                distanceUnit,
                height,
                length,
                width);
        }
    }
}


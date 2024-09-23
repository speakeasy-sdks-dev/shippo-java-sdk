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
 * ParcelExtra - An object holding optional extra services to be requested for each parcel in a multi-piece shipment. 
 * See the &lt;a href="#section/Parcel-Extras"&gt;Parcel Extra table below&lt;/a&gt; for all available services.
 */

public class ParcelExtra {

    /**
     * Specify collection on delivery details (UPS only).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("COD")
    private Optional<? extends Cod> cod;

    /**
     * To add insurace to your parcel, specify `amount`, `content` and `currency`. &lt;br&gt;&lt;br&gt;If you do not want to add insurance to you parcel, do not set these parameters.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("insurance")
    private Optional<? extends ParcelInsurance> insurance;

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference_1")
    private Optional<String> reference1;

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference_2")
    private Optional<String> reference2;

    @JsonCreator
    public ParcelExtra(
            @JsonProperty("COD") Optional<? extends Cod> cod,
            @JsonProperty("insurance") Optional<? extends ParcelInsurance> insurance,
            @JsonProperty("reference_1") Optional<String> reference1,
            @JsonProperty("reference_2") Optional<String> reference2) {
        Utils.checkNotNull(cod, "cod");
        Utils.checkNotNull(insurance, "insurance");
        Utils.checkNotNull(reference1, "reference1");
        Utils.checkNotNull(reference2, "reference2");
        this.cod = cod;
        this.insurance = insurance;
        this.reference1 = reference1;
        this.reference2 = reference2;
    }
    
    public ParcelExtra() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Specify collection on delivery details (UPS only).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Cod> cod() {
        return (Optional<Cod>) cod;
    }

    /**
     * To add insurace to your parcel, specify `amount`, `content` and `currency`. &lt;br&gt;&lt;br&gt;If you do not want to add insurance to you parcel, do not set these parameters.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ParcelInsurance> insurance() {
        return (Optional<ParcelInsurance>) insurance;
    }

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    @JsonIgnore
    public Optional<String> reference1() {
        return reference1;
    }

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    @JsonIgnore
    public Optional<String> reference2() {
        return reference2;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specify collection on delivery details (UPS only).
     */
    public ParcelExtra withCod(Cod cod) {
        Utils.checkNotNull(cod, "cod");
        this.cod = Optional.ofNullable(cod);
        return this;
    }

    /**
     * Specify collection on delivery details (UPS only).
     */
    public ParcelExtra withCod(Optional<? extends Cod> cod) {
        Utils.checkNotNull(cod, "cod");
        this.cod = cod;
        return this;
    }

    /**
     * To add insurace to your parcel, specify `amount`, `content` and `currency`. &lt;br&gt;&lt;br&gt;If you do not want to add insurance to you parcel, do not set these parameters.
     */
    public ParcelExtra withInsurance(ParcelInsurance insurance) {
        Utils.checkNotNull(insurance, "insurance");
        this.insurance = Optional.ofNullable(insurance);
        return this;
    }

    /**
     * To add insurace to your parcel, specify `amount`, `content` and `currency`. &lt;br&gt;&lt;br&gt;If you do not want to add insurance to you parcel, do not set these parameters.
     */
    public ParcelExtra withInsurance(Optional<? extends ParcelInsurance> insurance) {
        Utils.checkNotNull(insurance, "insurance");
        this.insurance = insurance;
        return this;
    }

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    public ParcelExtra withReference1(String reference1) {
        Utils.checkNotNull(reference1, "reference1");
        this.reference1 = Optional.ofNullable(reference1);
        return this;
    }

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    public ParcelExtra withReference1(Optional<String> reference1) {
        Utils.checkNotNull(reference1, "reference1");
        this.reference1 = reference1;
        return this;
    }

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    public ParcelExtra withReference2(String reference2) {
        Utils.checkNotNull(reference2, "reference2");
        this.reference2 = Optional.ofNullable(reference2);
        return this;
    }

    /**
     * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
     */
    public ParcelExtra withReference2(Optional<String> reference2) {
        Utils.checkNotNull(reference2, "reference2");
        this.reference2 = reference2;
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
        ParcelExtra other = (ParcelExtra) o;
        return 
            Objects.deepEquals(this.cod, other.cod) &&
            Objects.deepEquals(this.insurance, other.insurance) &&
            Objects.deepEquals(this.reference1, other.reference1) &&
            Objects.deepEquals(this.reference2, other.reference2);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cod,
            insurance,
            reference1,
            reference2);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ParcelExtra.class,
                "cod", cod,
                "insurance", insurance,
                "reference1", reference1,
                "reference2", reference2);
    }
    
    public final static class Builder {
 
        private Optional<? extends Cod> cod = Optional.empty();
 
        private Optional<? extends ParcelInsurance> insurance = Optional.empty();
 
        private Optional<String> reference1 = Optional.empty();
 
        private Optional<String> reference2 = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specify collection on delivery details (UPS only).
         */
        public Builder cod(Cod cod) {
            Utils.checkNotNull(cod, "cod");
            this.cod = Optional.ofNullable(cod);
            return this;
        }

        /**
         * Specify collection on delivery details (UPS only).
         */
        public Builder cod(Optional<? extends Cod> cod) {
            Utils.checkNotNull(cod, "cod");
            this.cod = cod;
            return this;
        }

        /**
         * To add insurace to your parcel, specify `amount`, `content` and `currency`. &lt;br&gt;&lt;br&gt;If you do not want to add insurance to you parcel, do not set these parameters.
         */
        public Builder insurance(ParcelInsurance insurance) {
            Utils.checkNotNull(insurance, "insurance");
            this.insurance = Optional.ofNullable(insurance);
            return this;
        }

        /**
         * To add insurace to your parcel, specify `amount`, `content` and `currency`. &lt;br&gt;&lt;br&gt;If you do not want to add insurance to you parcel, do not set these parameters.
         */
        public Builder insurance(Optional<? extends ParcelInsurance> insurance) {
            Utils.checkNotNull(insurance, "insurance");
            this.insurance = insurance;
            return this;
        }

        /**
         * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
         */
        public Builder reference1(String reference1) {
            Utils.checkNotNull(reference1, "reference1");
            this.reference1 = Optional.ofNullable(reference1);
            return this;
        }

        /**
         * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
         */
        public Builder reference1(Optional<String> reference1) {
            Utils.checkNotNull(reference1, "reference1");
            this.reference1 = reference1;
            return this;
        }

        /**
         * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
         */
        public Builder reference2(String reference2) {
            Utils.checkNotNull(reference2, "reference2");
            this.reference2 = Optional.ofNullable(reference2);
            return this;
        }

        /**
         * Optional text to be printed on the shipping label if supported by carrier. Up to 50 characters.
         */
        public Builder reference2(Optional<String> reference2) {
            Utils.checkNotNull(reference2, "reference2");
            this.reference2 = reference2;
            return this;
        }
        
        public ParcelExtra build() {
            return new ParcelExtra(
                cod,
                insurance,
                reference1,
                reference2);
        }
    }
}


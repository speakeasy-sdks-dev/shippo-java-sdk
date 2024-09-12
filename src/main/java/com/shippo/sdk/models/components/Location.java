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
 * Location - Location where the parcel(s) will be picked up.
 */

public class Location {

    /**
     * The pickup address, which includes your name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    @JsonProperty("address")
    private AddressCompleteCreateRequest address;

    /**
     * Where your parcels will be available for pickup. "Security Deck" and "Shipping Dock" are only 
     * supported for DHL Express.
     */
    @JsonProperty("building_location_type")
    private BuildingLocationType buildingLocationType;

    /**
     * The type of building where the pickup is located.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("building_type")
    private Optional<? extends BuildingType> buildingType;

    /**
     * Pickup instructions for the courier. This is a mandatory field if the building_location_type is "Other".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instructions")
    private Optional<String> instructions;

    @JsonCreator
    public Location(
            @JsonProperty("address") AddressCompleteCreateRequest address,
            @JsonProperty("building_location_type") BuildingLocationType buildingLocationType,
            @JsonProperty("building_type") Optional<? extends BuildingType> buildingType,
            @JsonProperty("instructions") Optional<String> instructions) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(buildingLocationType, "buildingLocationType");
        Utils.checkNotNull(buildingType, "buildingType");
        Utils.checkNotNull(instructions, "instructions");
        this.address = address;
        this.buildingLocationType = buildingLocationType;
        this.buildingType = buildingType;
        this.instructions = instructions;
    }
    
    public Location(
            AddressCompleteCreateRequest address,
            BuildingLocationType buildingLocationType) {
        this(address, buildingLocationType, Optional.empty(), Optional.empty());
    }

    /**
     * The pickup address, which includes your name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    @JsonIgnore
    public AddressCompleteCreateRequest address() {
        return address;
    }

    /**
     * Where your parcels will be available for pickup. "Security Deck" and "Shipping Dock" are only 
     * supported for DHL Express.
     */
    @JsonIgnore
    public BuildingLocationType buildingLocationType() {
        return buildingLocationType;
    }

    /**
     * The type of building where the pickup is located.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BuildingType> buildingType() {
        return (Optional<BuildingType>) buildingType;
    }

    /**
     * Pickup instructions for the courier. This is a mandatory field if the building_location_type is "Other".
     */
    @JsonIgnore
    public Optional<String> instructions() {
        return instructions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The pickup address, which includes your name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    public Location withAddress(AddressCompleteCreateRequest address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Where your parcels will be available for pickup. "Security Deck" and "Shipping Dock" are only 
     * supported for DHL Express.
     */
    public Location withBuildingLocationType(BuildingLocationType buildingLocationType) {
        Utils.checkNotNull(buildingLocationType, "buildingLocationType");
        this.buildingLocationType = buildingLocationType;
        return this;
    }

    /**
     * The type of building where the pickup is located.
     */
    public Location withBuildingType(BuildingType buildingType) {
        Utils.checkNotNull(buildingType, "buildingType");
        this.buildingType = Optional.ofNullable(buildingType);
        return this;
    }

    /**
     * The type of building where the pickup is located.
     */
    public Location withBuildingType(Optional<? extends BuildingType> buildingType) {
        Utils.checkNotNull(buildingType, "buildingType");
        this.buildingType = buildingType;
        return this;
    }

    /**
     * Pickup instructions for the courier. This is a mandatory field if the building_location_type is "Other".
     */
    public Location withInstructions(String instructions) {
        Utils.checkNotNull(instructions, "instructions");
        this.instructions = Optional.ofNullable(instructions);
        return this;
    }

    /**
     * Pickup instructions for the courier. This is a mandatory field if the building_location_type is "Other".
     */
    public Location withInstructions(Optional<String> instructions) {
        Utils.checkNotNull(instructions, "instructions");
        this.instructions = instructions;
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
        Location other = (Location) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.buildingLocationType, other.buildingLocationType) &&
            Objects.deepEquals(this.buildingType, other.buildingType) &&
            Objects.deepEquals(this.instructions, other.instructions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            buildingLocationType,
            buildingType,
            instructions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Location.class,
                "address", address,
                "buildingLocationType", buildingLocationType,
                "buildingType", buildingType,
                "instructions", instructions);
    }
    
    public final static class Builder {
 
        private AddressCompleteCreateRequest address;
 
        private BuildingLocationType buildingLocationType;
 
        private Optional<? extends BuildingType> buildingType = Optional.empty();
 
        private Optional<String> instructions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The pickup address, which includes your name, company name, street address, city, state, zip code, 
         * country, phone number, and email address (strings). Special characters should not be included in 
         * any address element, especially name, company, and email.
         */
        public Builder address(AddressCompleteCreateRequest address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * Where your parcels will be available for pickup. "Security Deck" and "Shipping Dock" are only 
         * supported for DHL Express.
         */
        public Builder buildingLocationType(BuildingLocationType buildingLocationType) {
            Utils.checkNotNull(buildingLocationType, "buildingLocationType");
            this.buildingLocationType = buildingLocationType;
            return this;
        }

        /**
         * The type of building where the pickup is located.
         */
        public Builder buildingType(BuildingType buildingType) {
            Utils.checkNotNull(buildingType, "buildingType");
            this.buildingType = Optional.ofNullable(buildingType);
            return this;
        }

        /**
         * The type of building where the pickup is located.
         */
        public Builder buildingType(Optional<? extends BuildingType> buildingType) {
            Utils.checkNotNull(buildingType, "buildingType");
            this.buildingType = buildingType;
            return this;
        }

        /**
         * Pickup instructions for the courier. This is a mandatory field if the building_location_type is "Other".
         */
        public Builder instructions(String instructions) {
            Utils.checkNotNull(instructions, "instructions");
            this.instructions = Optional.ofNullable(instructions);
            return this;
        }

        /**
         * Pickup instructions for the courier. This is a mandatory field if the building_location_type is "Other".
         */
        public Builder instructions(Optional<String> instructions) {
            Utils.checkNotNull(instructions, "instructions");
            this.instructions = instructions;
            return this;
        }
        
        public Location build() {
            return new Location(
                address,
                buildingLocationType,
                buildingType,
                instructions);
        }
    }
}


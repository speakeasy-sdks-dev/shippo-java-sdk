/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * WeightUnitEnum - The unit used for weight.
 */
public enum WeightUnitEnum {
    G("g"),
    KG("kg"),
    LB("lb"),
    OZ("oz");

    @JsonValue
    private final String value;

    private WeightUnitEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
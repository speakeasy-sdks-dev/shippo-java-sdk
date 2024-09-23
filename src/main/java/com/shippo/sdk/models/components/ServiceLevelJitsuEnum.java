/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelJitsuEnum - |Token | Service name|
 * |:---|:---|
 * | axlehire_same_day | Same Day|
 * | axlehire_next_day | Next Day|
 * 
 */
public enum ServiceLevelJitsuEnum {
    AXLEHIRE_SAME_DAY("axlehire_same_day"),
    AXLEHIRE_NEXT_DAY("axlehire_next_day");

    @JsonValue
    private final String value;

    private ServiceLevelJitsuEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}

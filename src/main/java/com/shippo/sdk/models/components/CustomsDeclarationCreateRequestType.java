/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CustomsDeclarationCreateRequestType - Party to be billed for duties.
 */
public enum CustomsDeclarationCreateRequestType {
    SENDER("SENDER"),
    RECIPIENT("RECIPIENT"),
    THIRD_PARTY("THIRD_PARTY");

    @JsonValue
    private final String value;

    private CustomsDeclarationCreateRequestType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}

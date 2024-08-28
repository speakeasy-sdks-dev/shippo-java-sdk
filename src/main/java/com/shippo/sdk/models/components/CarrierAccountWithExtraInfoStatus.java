/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CarrierAccountWithExtraInfoStatus - Current authentication status. Possible values: 'disconnected' (authorization lost, reconnect needed), 'connected' (authorized and active), 'authorization_pending' (awaiting initial authorization flow).
 */
public enum CarrierAccountWithExtraInfoStatus {
    DISCONNECTED("disconnected"),
    CONNECTED("connected"),
    AUTHORIZATION_PENDING("authorization_pending");

    @JsonValue
    private final String value;

    private CarrierAccountWithExtraInfoStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}

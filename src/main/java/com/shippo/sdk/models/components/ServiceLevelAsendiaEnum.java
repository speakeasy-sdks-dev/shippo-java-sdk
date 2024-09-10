/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelAsendiaEnum - |Token | Service name|
 * |:---|:---|
 * | asendia_us_priority_tracked | Asendia USA Priority Tracked|
 * | asendia_us_international_express | Asendia USA International Express|
 * | asendia_us_international_priority_airmail | Asendia USA International Priority Airmail|
 * | asendia_us_international_surface_airlift | Asendia USA International Surface Air Lift|
 * | asendia_us_priority_mail_international | Asendia USA Priority Mail International|
 * | asendia_us_priority_mail_express_international | Asendia USA Priority Mail Express International|
 * | asendia_us_epacket | Asendia USA International ePacket|
 * | asendia_us_other | Asendia USA Other Services (custom)|
 * 
 */
public enum ServiceLevelAsendiaEnum {
    ASENDIA_US_PRIORITY_TRACKED("asendia_us_priority_tracked"),
    ASENDIA_US_INTERNATIONAL_EXPRESS("asendia_us_international_express"),
    ASENDIA_US_INTERNATIONAL_PRIORITY_AIRMAIL("asendia_us_international_priority_airmail"),
    ASENDIA_US_INTERNATIONAL_SURFACE_AIRLIFT("asendia_us_international_surface_airlift"),
    ASENDIA_US_PRIORITY_MAIL_INTERNATIONAL("asendia_us_priority_mail_international"),
    ASENDIA_US_PRIORITY_MAIL_EXPRESS_INTERNATIONAL("asendia_us_priority_mail_express_international"),
    ASENDIA_US_EPACKET("asendia_us_epacket"),
    ASENDIA_US_OTHER("asendia_us_other");

    @JsonValue
    private final String value;

    private ServiceLevelAsendiaEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}

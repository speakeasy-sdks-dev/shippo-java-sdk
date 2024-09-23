/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelAustraliaPostEnum - |Token | Service name|
 * |:---|:---|
 * | australia_post_express_post | Express Post|
 * | australia_post_parcel_post | Parcel Post|
 * | australia_post_pack_and_track_international | Pack and Track International|
 * | australia_post_international_airmail | International Airmail|
 * | australia_post_express_post_international | Express Post International|
 * | australia_post_express_courier_international | Express Courier International|
 * | australia_post_international_express | International Express|
 * | australia_post_international_standard | International Standard|
 * | australia_post_international_economy | International Economy|
 * | australia_post_parcel_post_return | Parcel Post Return|
 * 
 */
public enum ServiceLevelAustraliaPostEnum {
    AUSTRALIA_POST_EXPRESS_POST("australia_post_express_post"),
    AUSTRALIA_POST_PARCEL_POST("australia_post_parcel_post"),
    AUSTRALIA_POST_PACK_AND_TRACK_INTERNATIONAL("australia_post_pack_and_track_international"),
    AUSTRALIA_POST_INTERNATIONAL_AIRMAIL("australia_post_international_airmail"),
    AUSTRALIA_POST_EXPRESS_POST_INTERNATIONAL("australia_post_express_post_international"),
    AUSTRALIA_POST_EXPRESS_COURIER_INTERNATIONAL("australia_post_express_courier_international"),
    AUSTRALIA_POST_INTERNATIONAL_EXPRESS("australia_post_international_express"),
    AUSTRALIA_POST_INTERNATIONAL_STANDARD("australia_post_international_standard"),
    AUSTRALIA_POST_INTERNATIONAL_ECONOMY("australia_post_international_economy"),
    AUSTRALIA_POST_PARCEL_POST_RETURN("australia_post_parcel_post_return");

    @JsonValue
    private final String value;

    private ServiceLevelAustraliaPostEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}

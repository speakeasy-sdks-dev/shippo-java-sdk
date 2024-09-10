/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelCanadaPostEnum - |Token | Service name|
 * |:---|:---|
 * | canada_post_regular_parcel | Regular Parcel|
 * | canada_post_expedited_parcel | Expedited Parcel|
 * | canada_post_priority | Priority|
 * | canada_post_xpresspost | Xpresspost|
 * | canada_post_xpresspost_international | Xpresspost International|
 * | canada_post_xpresspost_usa | Xpresspost USA|
 * | canada_post_expedited_parcel_usa | Expedited Parcel USA|
 * | canada_post_tracked_packet_usa | Tracked Packet USA|
 * | canada_post_small_packet_usa_air | Small Packet USA Air|
 * | canada_post_tracked_packet_international | Tracked Packet International|
 * | canada_post_small_packet_international_air | Small Package International Air|
 * 
 */
public enum ServiceLevelCanadaPostEnum {
    CANADA_POST_REGULAR_PARCEL("canada_post_regular_parcel"),
    CANADA_POST_EXPEDITED_PARCEL("canada_post_expedited_parcel"),
    CANADA_POST_PRIORITY("canada_post_priority"),
    CANADA_POST_XPRESSPOST("canada_post_xpresspost"),
    CANADA_POST_XPRESSPOST_INTERNATIONAL("canada_post_xpresspost_international"),
    CANADA_POST_XPRESSPOST_USA("canada_post_xpresspost_usa"),
    CANADA_POST_EXPEDITED_PARCEL_USA("canada_post_expedited_parcel_usa"),
    CANADA_POST_TRACKED_PACKET_USA("canada_post_tracked_packet_usa"),
    CANADA_POST_SMALL_PACKET_USA_AIR("canada_post_small_packet_usa_air"),
    CANADA_POST_TRACKED_PACKET_INTERNATIONAL("canada_post_tracked_packet_international"),
    CANADA_POST_SMALL_PACKET_INTERNATIONAL_AIR("canada_post_small_packet_international_air");

    @JsonValue
    private final String value;

    private ServiceLevelCanadaPostEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}

/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.utils;

import java.lang.reflect.Field;

class FormMetadata {

    String style = "form";
    boolean explode = true;
    boolean json;
    String name;

    private FormMetadata() {
    }

    // form:name=propName,style=spaceDelimited,explode=true
    static FormMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("form", new FormMetadata(), field);
    }
}

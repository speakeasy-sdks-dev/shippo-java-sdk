/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shippo.sdk.utils.OneOfDeserializer;
import com.shippo.sdk.utils.TypedObject;
import com.shippo.sdk.utils.Utils.JsonShape;
import com.shippo.sdk.utils.Utils.TypeReferenceWithShape;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = AddressReturn._Deserializer.class)
public class AddressReturn {

    @JsonValue
    private TypedObject value;
    
    private AddressReturn(TypedObject value) {
        this.value = value;
    }

    public static AddressReturn of(AddressCreateRequest value) {
        Utils.checkNotNull(value, "value");
        return new AddressReturn(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AddressCreateRequest>(){}));
    }

    public static AddressReturn of(String value) {
        Utils.checkNotNull(value, "value");
        return new AddressReturn(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.shippo.sdk.models.components.AddressCreateRequest}</li>
     * <li>{@code java.lang.String}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressReturn other = (AddressReturn) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<AddressReturn> {

        public _Deserializer() {
            super(AddressReturn.class, false,
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AddressCreateRequest>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddressReturn.class,
                "value", value);
    }
 
}

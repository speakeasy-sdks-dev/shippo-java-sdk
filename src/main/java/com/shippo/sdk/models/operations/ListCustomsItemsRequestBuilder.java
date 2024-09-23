/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.LazySingletonValue;
import com.shippo.sdk.utils.Utils;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class ListCustomsItemsRequestBuilder {

    private Optional<Long> page = Utils.readDefaultOrConstValue(
                            "page",
                            "1",
                            new TypeReference<Optional<Long>>() {});
    private Optional<Long> results = Utils.readDefaultOrConstValue(
                            "results",
                            "25",
                            new TypeReference<Optional<Long>>() {});
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListCustomsItems sdk;

    public ListCustomsItemsRequestBuilder(SDKMethodInterfaces.MethodCallListCustomsItems sdk) {
        this.sdk = sdk;
    }
                
    public ListCustomsItemsRequestBuilder page(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public ListCustomsItemsRequestBuilder page(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public ListCustomsItemsRequestBuilder results(long results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.of(results);
        return this;
    }

    public ListCustomsItemsRequestBuilder results(Optional<Long> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }
                
    public ListCustomsItemsRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public ListCustomsItemsRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public ListCustomsItemsResponse call() throws Exception {
        if (page == null) {
            page = _SINGLETON_VALUE_Page.value();
        }
        if (results == null) {
            results = _SINGLETON_VALUE_Results.value();
        }
        return sdk.list(
            page,
            results,
            shippoApiVersion);
    }

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Page =
            new LazySingletonValue<>(
                    "page",
                    "1",
                    new TypeReference<Optional<Long>>() {});

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Results =
            new LazySingletonValue<>(
                    "results",
                    "25",
                    new TypeReference<Optional<Long>>() {});
}

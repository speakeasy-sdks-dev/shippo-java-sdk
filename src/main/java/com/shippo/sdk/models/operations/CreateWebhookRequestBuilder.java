/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.utils.LazySingletonValue;
import com.shippo.sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateWebhookRequestBuilder {

    private com.shippo.sdk.models.components.WebhookUpdateRequest request;
    private final SDKMethodInterfaces.MethodCallCreateWebhook sdk;

    public CreateWebhookRequestBuilder(SDKMethodInterfaces.MethodCallCreateWebhook sdk) {
        this.sdk = sdk;
    }

    public CreateWebhookRequestBuilder request(com.shippo.sdk.models.components.WebhookUpdateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateWebhookResponse call() throws Exception {

        return sdk.createWebhook(
            request);
    }
}

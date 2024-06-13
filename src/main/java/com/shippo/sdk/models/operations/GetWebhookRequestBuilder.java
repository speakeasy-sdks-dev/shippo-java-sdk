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


public class GetWebhookRequestBuilder {

    private String webhookId;
    private final SDKMethodInterfaces.MethodCallGetWebhook sdk;

    public GetWebhookRequestBuilder(SDKMethodInterfaces.MethodCallGetWebhook sdk) {
        this.sdk = sdk;
    }

    public GetWebhookRequestBuilder webhookId(String webhookId) {
        Utils.checkNotNull(webhookId, "webhookId");
        this.webhookId = webhookId;
        return this;
    }

    public GetWebhookResponse call() throws Exception {

        return sdk.getWebhook(
            webhookId);
    }
}

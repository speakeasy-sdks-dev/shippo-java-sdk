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


public class UpdateWebhookRequestBuilder {

    private String webhookId;
    private com.shippo.sdk.models.components.WebhookUpdateRequest webhookUpdateRequest;
    private final SDKMethodInterfaces.MethodCallUpdateWebhook sdk;

    public UpdateWebhookRequestBuilder(SDKMethodInterfaces.MethodCallUpdateWebhook sdk) {
        this.sdk = sdk;
    }

    public UpdateWebhookRequestBuilder webhookId(String webhookId) {
        Utils.checkNotNull(webhookId, "webhookId");
        this.webhookId = webhookId;
        return this;
    }

    public UpdateWebhookRequestBuilder webhookUpdateRequest(com.shippo.sdk.models.components.WebhookUpdateRequest webhookUpdateRequest) {
        Utils.checkNotNull(webhookUpdateRequest, "webhookUpdateRequest");
        this.webhookUpdateRequest = webhookUpdateRequest;
        return this;
    }

    public UpdateWebhookResponse call() throws Exception {

        return sdk.updateWebhook(
            webhookId,
            webhookUpdateRequest);
    }
}

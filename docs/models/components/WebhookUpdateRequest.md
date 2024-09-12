# WebhookUpdateRequest


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `event`                                                                 | [WebhookEventTypeEnum](../../models/components/WebhookEventTypeEnum.md) | :heavy_check_mark:                                                      | N/A                                                                     |
| `url`                                                                   | *String*                                                                | :heavy_check_mark:                                                      | URL webhook events are sent to.                                         |
| `active`                                                                | *Optional<Boolean>*                                                     | :heavy_minus_sign:                                                      | Determines whether the webhook is active or not.                        |
| `isTest`                                                                | *Optional<Boolean>*                                                     | :heavy_minus_sign:                                                      | Determines whether the webhook is a test webhook or not.                |
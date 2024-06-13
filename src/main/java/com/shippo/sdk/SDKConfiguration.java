/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.shippo.sdk.utils.Hook.SdkInitData;
import com.shippo.sdk.utils.HTTPClient;
import com.shippo.sdk.utils.RetryConfig;
import com.shippo.sdk.models.components.Security;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "2018-02-08";
    public String sdkVersion = "0.2.0";
    public String genVersion = "2.342.2";
    public String userAgent = "speakeasy-sdk/java 0.2.0 2.342.2 2018-02-08 com.shippo.sdk";

    private com.shippo.sdk.utils.Hooks _hooks = createHooks();

    private static com.shippo.sdk.utils.Hooks createHooks() {
        com.shippo.sdk.utils.Hooks hooks = new com.shippo.sdk.utils.Hooks();
        return hooks;
    }
    
    public com.shippo.sdk.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(com.shippo.sdk.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        com.shippo.sdk.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    public Map<String, Map<String, Map<String, java.lang.Object>>> globals = new HashMap<>(){{
        put("parameters", new HashMap<>());
    }};
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}

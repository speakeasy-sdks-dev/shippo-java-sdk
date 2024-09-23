/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.shippo.sdk.models.operations.SDKMethodInterfaces.*;
import com.shippo.sdk.utils.HTTPClient;
import com.shippo.sdk.utils.RetryConfig;
import com.shippo.sdk.utils.SpeakeasyHTTPClient;
import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

/**
 * Shippo external API.: Use this API to integrate with the Shippo service
 */
public class Shippo {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        "https://api.goshippo.com",
    };

    /**
     * Addresses are the locations a parcel is being shipped **from** and **to**. They represent company and residential places. Among other things, you can use address objects to create shipments, calculate shipping rates, and purchase shipping labels.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Address"/&gt;
     */
    private final Addresses addresses;

    /**
     * A batch is a technique for creating multiple labels at once. Use the  batch object to create and purchase many shipments in two API calls. After creating the batch, retrieve the batch to verify that all shipments are valid. You can add and remove shipments after you have created the batch. When all shipments are valid you can purchase the batch and retrieve all the shipping labels.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Batch"/&gt;
     * 
     * # Batch Shipment
     * The batch shipment object is a wrapper around a shipment object, which include shipment-specific information 
     * for batch processing.
     * 
     * Note: batch shipments can only be created on the batch endpoint, either when creating a batch object or by through 
     * the `/batches/{BATCH_OBJECT_ID}/add_shipments` endpoint
     * &lt;SchemaDefinition schemaRef="#/components/schemas/BatchShipment"/&gt;
     */
    private final Batches batches;

    /**
     * Carriers are the companies who deliver your package. Shippo uses Carrier account objects as credentials to retrieve shipping rates and purchase labels from shipping Carriers.
     * 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CarrierAccount"/&gt;
     */
    private final CarrierAccounts carrierAccounts;

    /**
     * Customs declarations are relevant information, including one or multiple customs items, you need to provide for 
     * customs clearance for your international shipments.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CustomsDeclaration"/&gt;
     */
    private final CustomsDeclarations customsDeclarations;

    /**
     * Customs declarations are relevant information, including one or multiple customs items, you need to provide for customs clearance for your international shipments.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CustomsItem"/&gt;
     */
    private final CustomsItems customsItems;

    /**
     * Rates at checkout is a tool for merchants to display up-to-date shipping estimates based on what's in their customers cart and where they’re shipping to.
     * Merchants set up curated shipping options for customers in the checkout flow based on data in the shopping cart. The request must include the **to** address and item information. Optional fields are the **from** address and package information. If the optional fields are not included, the service will use the default address and/or package configured for rates at checkout. The response is a list of shipping options based on the Service Group configuration.
     * (see &lt;a href="#tag/Service-Groups"&gt;Service Group configuration&lt;/a&gt; for details).
     * &lt;SchemaDefinition schemaRef="#/components/schemas/LiveRate"/&gt;
     * 
     * 
     * # Default Parcel Template
     * Assign one of your user parcel templates to be the default used when generating Live Rates. This template will be used by default when generating Live Rates, unless you explicitly provide a parcel in the Live Rates request.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/&gt;
     */
    private final RatesAtCheckout ratesAtCheckout;

    /**
     * A manifest is a single-page document with a barcode that carriers can scan to accept all packages into transit without the need to scan each item individually. 
     * They are close-outs of shipping labels of a certain day. Some carriers require manifests to  process the shipments.
     * 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Manifest"/&gt;
     * 
     * # Manifest Errors
     * The following codes and messages are the possible errors that may occur when creating Manifests.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ManifestErrors"/&gt;
     */
    private final Manifests manifests;

    /**
     * An order is a request from a customer to purchase goods from a merchant. 
     * Use the orders object to load orders from your system to the Shippo dashboard.
     * You can use the orders object to create, retrieve, list, and manage orders programmatically. 
     * You can also retrieve shipping rates, purchase labels, and track shipments for each order.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Order"/&gt;
     * 
     * # Line Item
     * &lt;p style="text-align: center; background-color: #F2F3F4;"&gt;
     *   &lt;/br&gt;Line Items, and their corresponding abstract Products and Variants, might be exposed as a separate resource 
     *   in the future. Currently it's a nested object within the order resource.&lt;/br&gt;&lt;/br&gt;
     * &lt;/p&gt;
     *  A line item is an individual object in an order. For example, if your order contains a t-shirt, shorts, and a jacket, each item is represented by a line item.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/LineItem"/&gt;
     */
    private final Orders orders;

    /**
     * A carrier parcel template represents a package used for shipping that has preset dimensions defined by a carrier. Some examples of a carrier parcel template include USPS Flat Rate Box and Fedex Small Pak. When using a carrier parcel template, the rates returned may be limited to the carrier that provides the box. You can create user parcel templates using a carrier parcel template. Shippo takes the dimensions of the carrier parcel template but you must configure the weight.
     * 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CarrierParcelTemplate"/&gt;
     */
    private final CarrierParcelTemplates carrierParcelTemplates;

    /**
     * A parcel is an item you are shipping. The parcel object includes details about its physical make-up of the parcel. It includes dimensions and weight that Shippo uses to calculate rates. 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Parcel"/&gt;
     * 
     * # Parcel Extras
     * The following values are supported for the `extra` field of the parcel object.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ParcelExtra"/&gt;
     */
    private final Parcels parcels;

    /**
     * A pickup is when you schedule a carrier to collect a package for delivery.
     * Use Shippo’s pickups endpoint to schedule pickups with USPS and DHL Express for eligible shipments that you have already created.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Pickup"/&gt;
     */
    private final Pickups pickups;

    /**
     * A rate is the cost to ship a parcel from a carrier. The rate object details the service level including the cost and transit time. 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Rate"/&gt;
     */
    private final Rates rates;

    /**
     * Refunds are reimbursements for successfully created but unused shipping labels or other charges.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Refund"/&gt;
     */
    private final Refunds refunds;

    /**
     * A service group is a set of service levels grouped together. 
     * Rates at checkout uses services groups to present available shipping options to customers in their shopping basket.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ServiceGroup"/&gt;
     */
    private final ServiceGroups serviceGroups;

    /**
     * A shipment is the act of transporting goods. A shipment object contains **to** and **from** addresses, and the parcel details that you are shipping. You can use the shipment object to retrieve shipping rates and purchase a shipping label.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Shipment"/&gt;
     *  
     * # Shipment Extras
     * The following values are supported for the `extra` field of the shipment object.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ShipmentExtra"/&gt;
     */
    private final Shipments shipments;

    /**
     * &lt;p style="text-align: center; background-color: #F2F3F4;"&gt;&lt;/br&gt;
     * If you purchased your shipping label through Shippo, you can also get all the tracking details of your Shipment 
     * from the &lt;a href="#tag/Transactions"&gt;Transaction&lt;/a&gt; object.
     * &lt;/br&gt;&lt;/br&gt;&lt;/p&gt;
     * A tracking status of a package is an indication of current location of a package in the supply chain. For example,  sorting, warehousing, or out for delivery. Use the tracking status object to track the location of your shipments.
     * 
     * When using your &lt;a href="https://docs.goshippo.com/docs/guides_general/authentication/"&gt;Test&lt;/a&gt; token for tracking, you need to use Shippo's 
     * predefined tokens for testing different tracking statuses. You can find more information in our 
     * &lt;a href="https://docs.goshippo.com/docs/tracking/tracking/"&gt;Tracking tutorial&lt;/a&gt; on how to do this, and what the 
     * payloads look like.      
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Track"/&gt;
     */
    private final TrackingStatus trackingStatus;

    /**
     * A transaction is the purchase of a shipping label from a shipping provider for a specific service. You can print purchased labels and used them to ship a parcel with a carrier, such as USPS or FedEx.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Transaction"/&gt;
     */
    private final Transactions transactions;

    /**
     * A user parcel template represents a package used for shipping that has preset dimensions and attributes defined 
     * by you. They are useful for capturing attributes of parcel-types you frequently use for shipping, allowing 
     * them to be defined once and then used for many shipments. These parcel templates can also be used for live rates.
     * 
     * User parcel templates can also be created using a carrier parcel template, where the dimensions will be copied from 
     * the carrier presets, but the weight can be configured by you.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/&gt;
     */
    private final UserParcelTemplates userParcelTemplates;

    /**
     * Shippo Accounts are used by Shippo Platform Accounts to create and manage Managed Shippo Accounts. 
     * Managed Shippo Accounts are headless accounts that represent your customers. They are opaque to your end customers, meaning customers do not need to create their own Shippo login or have a billing relationship with Shippo. 
     * They can be used by marketplaces, e-commerce platforms, and third-party logistics providers who want to offer, seamless, built-in shipping functionality to their customers. 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ShippoAccount"/&gt;
     */
    private final ShippoAccounts shippoAccounts;

    /**
     * Webhooks are a way for Shippo to notify your application when a specific event occurs. For example, when a label is purchased or when a shipment tracking status has changed. You can use webhooks to trigger actions in your application, such as sending an email or updating a database.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Webhook"/&gt;
     * 
     * # Webhook Payload
     * The payload is the body of the POST request Shippo sends to the URL specified at the time of webhook registration.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/WebhookPayload"/&gt;
     */
    private final Webhooks webhooks;

    /**
     * Addresses are the locations a parcel is being shipped **from** and **to**. They represent company and residential places. Among other things, you can use address objects to create shipments, calculate shipping rates, and purchase shipping labels.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Address"/&gt;
     */
    public Addresses addresses() {
        return addresses;
    }

    /**
     * A batch is a technique for creating multiple labels at once. Use the  batch object to create and purchase many shipments in two API calls. After creating the batch, retrieve the batch to verify that all shipments are valid. You can add and remove shipments after you have created the batch. When all shipments are valid you can purchase the batch and retrieve all the shipping labels.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Batch"/&gt;
     * 
     * # Batch Shipment
     * The batch shipment object is a wrapper around a shipment object, which include shipment-specific information 
     * for batch processing.
     * 
     * Note: batch shipments can only be created on the batch endpoint, either when creating a batch object or by through 
     * the `/batches/{BATCH_OBJECT_ID}/add_shipments` endpoint
     * &lt;SchemaDefinition schemaRef="#/components/schemas/BatchShipment"/&gt;
     */
    public Batches batches() {
        return batches;
    }

    /**
     * Carriers are the companies who deliver your package. Shippo uses Carrier account objects as credentials to retrieve shipping rates and purchase labels from shipping Carriers.
     * 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CarrierAccount"/&gt;
     */
    public CarrierAccounts carrierAccounts() {
        return carrierAccounts;
    }

    /**
     * Customs declarations are relevant information, including one or multiple customs items, you need to provide for 
     * customs clearance for your international shipments.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CustomsDeclaration"/&gt;
     */
    public CustomsDeclarations customsDeclarations() {
        return customsDeclarations;
    }

    /**
     * Customs declarations are relevant information, including one or multiple customs items, you need to provide for customs clearance for your international shipments.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CustomsItem"/&gt;
     */
    public CustomsItems customsItems() {
        return customsItems;
    }

    /**
     * Rates at checkout is a tool for merchants to display up-to-date shipping estimates based on what's in their customers cart and where they’re shipping to.
     * Merchants set up curated shipping options for customers in the checkout flow based on data in the shopping cart. The request must include the **to** address and item information. Optional fields are the **from** address and package information. If the optional fields are not included, the service will use the default address and/or package configured for rates at checkout. The response is a list of shipping options based on the Service Group configuration.
     * (see &lt;a href="#tag/Service-Groups"&gt;Service Group configuration&lt;/a&gt; for details).
     * &lt;SchemaDefinition schemaRef="#/components/schemas/LiveRate"/&gt;
     * 
     * 
     * # Default Parcel Template
     * Assign one of your user parcel templates to be the default used when generating Live Rates. This template will be used by default when generating Live Rates, unless you explicitly provide a parcel in the Live Rates request.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/&gt;
     */
    public RatesAtCheckout ratesAtCheckout() {
        return ratesAtCheckout;
    }

    /**
     * A manifest is a single-page document with a barcode that carriers can scan to accept all packages into transit without the need to scan each item individually. 
     * They are close-outs of shipping labels of a certain day. Some carriers require manifests to  process the shipments.
     * 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Manifest"/&gt;
     * 
     * # Manifest Errors
     * The following codes and messages are the possible errors that may occur when creating Manifests.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ManifestErrors"/&gt;
     */
    public Manifests manifests() {
        return manifests;
    }

    /**
     * An order is a request from a customer to purchase goods from a merchant. 
     * Use the orders object to load orders from your system to the Shippo dashboard.
     * You can use the orders object to create, retrieve, list, and manage orders programmatically. 
     * You can also retrieve shipping rates, purchase labels, and track shipments for each order.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Order"/&gt;
     * 
     * # Line Item
     * &lt;p style="text-align: center; background-color: #F2F3F4;"&gt;
     *   &lt;/br&gt;Line Items, and their corresponding abstract Products and Variants, might be exposed as a separate resource 
     *   in the future. Currently it's a nested object within the order resource.&lt;/br&gt;&lt;/br&gt;
     * &lt;/p&gt;
     *  A line item is an individual object in an order. For example, if your order contains a t-shirt, shorts, and a jacket, each item is represented by a line item.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/LineItem"/&gt;
     */
    public Orders orders() {
        return orders;
    }

    /**
     * A carrier parcel template represents a package used for shipping that has preset dimensions defined by a carrier. Some examples of a carrier parcel template include USPS Flat Rate Box and Fedex Small Pak. When using a carrier parcel template, the rates returned may be limited to the carrier that provides the box. You can create user parcel templates using a carrier parcel template. Shippo takes the dimensions of the carrier parcel template but you must configure the weight.
     * 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/CarrierParcelTemplate"/&gt;
     */
    public CarrierParcelTemplates carrierParcelTemplates() {
        return carrierParcelTemplates;
    }

    /**
     * A parcel is an item you are shipping. The parcel object includes details about its physical make-up of the parcel. It includes dimensions and weight that Shippo uses to calculate rates. 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Parcel"/&gt;
     * 
     * # Parcel Extras
     * The following values are supported for the `extra` field of the parcel object.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ParcelExtra"/&gt;
     */
    public Parcels parcels() {
        return parcels;
    }

    /**
     * A pickup is when you schedule a carrier to collect a package for delivery.
     * Use Shippo’s pickups endpoint to schedule pickups with USPS and DHL Express for eligible shipments that you have already created.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Pickup"/&gt;
     */
    public Pickups pickups() {
        return pickups;
    }

    /**
     * A rate is the cost to ship a parcel from a carrier. The rate object details the service level including the cost and transit time. 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Rate"/&gt;
     */
    public Rates rates() {
        return rates;
    }

    /**
     * Refunds are reimbursements for successfully created but unused shipping labels or other charges.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Refund"/&gt;
     */
    public Refunds refunds() {
        return refunds;
    }

    /**
     * A service group is a set of service levels grouped together. 
     * Rates at checkout uses services groups to present available shipping options to customers in their shopping basket.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ServiceGroup"/&gt;
     */
    public ServiceGroups serviceGroups() {
        return serviceGroups;
    }

    /**
     * A shipment is the act of transporting goods. A shipment object contains **to** and **from** addresses, and the parcel details that you are shipping. You can use the shipment object to retrieve shipping rates and purchase a shipping label.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Shipment"/&gt;
     *  
     * # Shipment Extras
     * The following values are supported for the `extra` field of the shipment object.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ShipmentExtra"/&gt;
     */
    public Shipments shipments() {
        return shipments;
    }

    /**
     * &lt;p style="text-align: center; background-color: #F2F3F4;"&gt;&lt;/br&gt;
     * If you purchased your shipping label through Shippo, you can also get all the tracking details of your Shipment 
     * from the &lt;a href="#tag/Transactions"&gt;Transaction&lt;/a&gt; object.
     * &lt;/br&gt;&lt;/br&gt;&lt;/p&gt;
     * A tracking status of a package is an indication of current location of a package in the supply chain. For example,  sorting, warehousing, or out for delivery. Use the tracking status object to track the location of your shipments.
     * 
     * When using your &lt;a href="https://docs.goshippo.com/docs/guides_general/authentication/"&gt;Test&lt;/a&gt; token for tracking, you need to use Shippo's 
     * predefined tokens for testing different tracking statuses. You can find more information in our 
     * &lt;a href="https://docs.goshippo.com/docs/tracking/tracking/"&gt;Tracking tutorial&lt;/a&gt; on how to do this, and what the 
     * payloads look like.      
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Track"/&gt;
     */
    public TrackingStatus trackingStatus() {
        return trackingStatus;
    }

    /**
     * A transaction is the purchase of a shipping label from a shipping provider for a specific service. You can print purchased labels and used them to ship a parcel with a carrier, such as USPS or FedEx.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Transaction"/&gt;
     */
    public Transactions transactions() {
        return transactions;
    }

    /**
     * A user parcel template represents a package used for shipping that has preset dimensions and attributes defined 
     * by you. They are useful for capturing attributes of parcel-types you frequently use for shipping, allowing 
     * them to be defined once and then used for many shipments. These parcel templates can also be used for live rates.
     * 
     * User parcel templates can also be created using a carrier parcel template, where the dimensions will be copied from 
     * the carrier presets, but the weight can be configured by you.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/&gt;
     */
    public UserParcelTemplates userParcelTemplates() {
        return userParcelTemplates;
    }

    /**
     * Shippo Accounts are used by Shippo Platform Accounts to create and manage Managed Shippo Accounts. 
     * Managed Shippo Accounts are headless accounts that represent your customers. They are opaque to your end customers, meaning customers do not need to create their own Shippo login or have a billing relationship with Shippo. 
     * They can be used by marketplaces, e-commerce platforms, and third-party logistics providers who want to offer, seamless, built-in shipping functionality to their customers. 
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ShippoAccount"/&gt;
     */
    public ShippoAccounts shippoAccounts() {
        return shippoAccounts;
    }

    /**
     * Webhooks are a way for Shippo to notify your application when a specific event occurs. For example, when a label is purchased or when a shipment tracking status has changed. You can use webhooks to trigger actions in your application, such as sending an email or updating a database.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/Webhook"/&gt;
     * 
     * # Webhook Payload
     * The payload is the body of the POST request Shippo sends to the URL specified at the time of webhook registration.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/WebhookPayload"/&gt;
     */
    public Webhooks webhooks() {
        return webhooks;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        /**
         * Configures the SDK security to use the provided secret.
         *
         * @param apiKeyHeader The secret to use for all requests.
         * @return The builder instance.
         */
        public Builder apiKeyHeader(String apiKeyHeader) {
            this.sdkConfiguration.securitySource = SecuritySource.of(com.shippo.sdk.models.components.Security.builder()
              .apiKeyHeader(apiKeyHeader)
              .build());
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Allows setting the shippoApiVersion parameter for all supported operations.
         *
         * @param shippoApiVersion The value to set.
         * @return The builder instance.
         */
        public Builder shippoApiVersion(String shippoApiVersion) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("header")) {
                this.sdkConfiguration.globals.get("parameters").put("header", new java.util.HashMap<>());
            }

            this.sdkConfiguration.globals.get("parameters").get("header").put("shippoApiVersion", shippoApiVersion);

            return this;
        }
        
        // Visible for testing, will be accessed via reflection
        void _hooks(com.shippo.sdk.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);    
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public Shippo build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new Shippo(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private Shippo(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.addresses = new Addresses(sdkConfiguration);
        this.batches = new Batches(sdkConfiguration);
        this.carrierAccounts = new CarrierAccounts(sdkConfiguration);
        this.customsDeclarations = new CustomsDeclarations(sdkConfiguration);
        this.customsItems = new CustomsItems(sdkConfiguration);
        this.ratesAtCheckout = new RatesAtCheckout(sdkConfiguration);
        this.manifests = new Manifests(sdkConfiguration);
        this.orders = new Orders(sdkConfiguration);
        this.carrierParcelTemplates = new CarrierParcelTemplates(sdkConfiguration);
        this.parcels = new Parcels(sdkConfiguration);
        this.pickups = new Pickups(sdkConfiguration);
        this.rates = new Rates(sdkConfiguration);
        this.refunds = new Refunds(sdkConfiguration);
        this.serviceGroups = new ServiceGroups(sdkConfiguration);
        this.shipments = new Shipments(sdkConfiguration);
        this.trackingStatus = new TrackingStatus(sdkConfiguration);
        this.transactions = new Transactions(sdkConfiguration);
        this.userParcelTemplates = new UserParcelTemplates(sdkConfiguration);
        this.shippoAccounts = new ShippoAccounts(sdkConfiguration);
        this.webhooks = new Webhooks(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}

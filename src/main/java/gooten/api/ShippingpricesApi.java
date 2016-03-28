package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.ShippingPricesRequest;
import gooten.api.model.ShippingPricesResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface ShippingpricesApi extends ApiClient.Api {


  /**
   * Get a list of shipping options and prices for items
   * Get a list of shipping options and prices for items.
   * @param shippingPricesRequest DTO with required information
   * @param partnerBillingKey Partner billing key
   * @return ShippingPricesResult
   */
  @RequestLine("POST /shippingprices/?partnerBillingKey={partnerBillingKey}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ShippingPricesResult pOSTShippingprices(ShippingPricesRequest shippingPricesRequest, @Param("partnerBillingKey") String partnerBillingKey);
  
}

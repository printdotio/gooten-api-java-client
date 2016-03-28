package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.Order;
import gooten.api.model.OrderPriceResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface PriceestimateApi extends ApiClient.Api {


  /**
   * Get an order price
   * Get the price of an order, including discounts from a coupon.
   * @param order Order to potentially be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderPriceResult
   */
  @RequestLine("POST /v/{version}/source/{source}/priceestimate/")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  OrderPriceResult pOSTPriceestimate(Order order, @Param("version") Integer version, @Param("source") String source);
  
}

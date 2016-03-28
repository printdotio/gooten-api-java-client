package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.ShipEstimate;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface ShippriceestimateApi extends ApiClient.Api {


  /**
   * Get a baseline ship price for an item
   * Price returned is an estimate which may or may not be realistically attainable.
   * @param productId Product ID
   * @param countryCode Country Code it will be shipped to
   * @param currencyCode Currency Code the estimate should be in. Defaults to USD.
   * @return ShipEstimate
   */
  @RequestLine("GET /shippriceestimate/?productId={productId}&countryCode={countryCode}&currencyCode={currencyCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ShipEstimate getShippriceestimate(@Param("productId") Integer productId, @Param("countryCode") String countryCode, @Param("currencyCode") String currencyCode);
  

}

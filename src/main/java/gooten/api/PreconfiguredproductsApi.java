package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.PreconfiguredProductsInsertResponse;
import gooten.api.model.PreconfiguredProductInsert;
import gooten.api.model.PreconfiguredProductsResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface PreconfiguredproductsApi extends ApiClient.Api {


  /**
   * Insert a preconfigured product
   * Insert a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return PreconfiguredProductsInsertResponse
   */
  @RequestLine("POST /v/{version}/source/{source}/preconfiguredproducts/")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  PreconfiguredProductsInsertResponse createPreconfiguredproducts(PreconfiguredProductInsert preconfiguredProductInsert, @Param("version") Integer version, @Param("source") String source);
  
  /**
   * Delete a preconfigured product
   * Delete a preconfigured product from your recipe.
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param sku The preconfigured product&#39;s sku.
   * @return PreconfiguredProductsInsertResponse
   */
  @RequestLine("DELETE /v/{version}/source/{source}/preconfiguredproducts/?sku={sku}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  PreconfiguredProductsInsertResponse deletePreconfiguredproducts(@Param("version") Integer version, @Param("source") String source, @Param("sku") String sku);
  
  /**
   * Get a list of your preconfigured products
   * Get a list of your preconfigured products. The products returned are entirely specific to your recipe.
   * @param countryCode The country code where it would be shipped to. For example, &#39;US&#39; or &#39;CA&#39;
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
   * @return PreconfiguredProductsResponse
   */
  @RequestLine("GET /v/{version}/source/{source}/preconfiguredproducts/?countryCode={countryCode}&languageCode={languageCode}&currencyCode={currencyCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  PreconfiguredProductsResponse getPreconfiguredproducts(@Param("countryCode") String countryCode, @Param("version") Integer version, @Param("source") String source, @Param("languageCode") String languageCode, @Param("currencyCode") String currencyCode);
  
  /**
   * Update a preconfigured product
   * Update a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return PreconfiguredProductsInsertResponse
   */
  @RequestLine("PUT /v/{version}/source/{source}/preconfiguredproducts/")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  PreconfiguredProductsInsertResponse updatePreconfiguredproducts(PreconfiguredProductInsert preconfiguredProductInsert, @Param("version") Integer version, @Param("source") String source);
  

}

package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.ProductVariantResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface ProductvariantsApi extends ApiClient.Api {


  /**
   * Get a list of available product variations. Includes pricing information
   * Get a list of all available product variations, or if one passes in a specific product type id (productId), gets a list of available variations of a recipe product.
   * @param countryCode The country code the order would be shipped to. For example, &#39;US&#39; or &#39;FR&#39;
   * @param productId Recipe product ID, such as those returned from the /products service
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api, widget
   * @param partnerBillingKey Partner billing key
   * @param all Whether or not to return all available printio products, or just ones in your recipe. Pass &#39;true&#39; or &#39;false&#39;.
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
   * @return ProductVariantResponse
   */
  @RequestLine("GET /v/{version}/source/{source}/productvariants/?partnerBillingKey={partnerBillingKey}&countryCode={countryCode}&productId={productId}&all={all}&languageCode={languageCode}&currencyCode={currencyCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ProductVariantResponse getProductvariants(@Param("countryCode") String countryCode, @Param("productId") String productId, @Param("version") Integer version, @Param("source") String source, @Param("partnerBillingKey") String partnerBillingKey, @Param("all") String all, @Param("languageCode") String languageCode, @Param("currencyCode") String currencyCode);
  
}

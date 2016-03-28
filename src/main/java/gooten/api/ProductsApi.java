package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.ProductList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface ProductsApi extends ApiClient.Api {


  /**
   * Get a list of products
   * Get a list of products. The products returned may have variants. Products returned are only those within the overall recipe. All images returned from the service are dynamically resizable by adding width and height querystrings.
   * @param countryCode The country code where it would be shipped to. For example, &#39;US&#39; or &#39;CA&#39;
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param partnerBillingKey Partner billing key
   * @param all Whether or not to return all available printio products, or just ones in your recipe. Pass &#39;true&#39; or &#39;false&#39;.
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
   * @return ProductList
   */
  @RequestLine("GET /v/{version}/source/{source}/products/?partnerBillingKey={partnerBillingKey}&countryCode={countryCode}&all={all}&languageCode={languageCode}&currencyCode={currencyCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ProductList getProducts(@Param("countryCode") String countryCode, @Param("version") Integer version, @Param("source") String source, @Param("partnerBillingKey") String partnerBillingKey, @Param("all") String all, @Param("languageCode") String languageCode, @Param("currencyCode") String currencyCode);
  
}

package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.ProductBuildInfoResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface ProducttemplatesApi extends ApiClient.Api {


  /**
   * Get a list of product templates
   * Get a list of product templates.
   * @param sku Productvariant sku.
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @return ProductBuildInfoResponse
   */
  @RequestLine("GET /producttemplates/?sku={sku}&languageCode={languageCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ProductBuildInfoResponse getProducttemplates(@Param("sku") String sku, @Param("languageCode") String languageCode);
  

}

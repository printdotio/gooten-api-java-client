package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.ProductPreviewResponse;
import gooten.api.model.ProductPreviewRequest;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface ProductpreviewApi extends ApiClient.Api {


  /**
   * Submit an image (or images) to be rendered into a product preview.
   * Submit an image (or images) to be rendered into a product preview.
   * @param productPreviewRequest Request detailing the operation needing completed
   * @return ProductPreviewResponse
   */
  @RequestLine("POST /productpreview/")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ProductPreviewResponse pOSTProductpreview(ProductPreviewRequest productPreviewRequest);
  

}

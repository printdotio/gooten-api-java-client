package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ProductPreviewResponse;
import io.swagger.client.model.ProductPreviewRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProductpreviewApi {
  private ApiClient apiClient;

  public ProductpreviewApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductpreviewApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Submit an image (or images) to be rendered into a product preview.
   * Submit an image (or images) to be rendered into a product preview.
   * @param productPreviewRequest Request detailing the operation needing completed
   * @return ProductPreviewResponse
   * @throws ApiException if fails to make API call
   */
  public ProductPreviewResponse pOSTProductpreview(ProductPreviewRequest productPreviewRequest) throws ApiException {
    Object localVarPostBody = productPreviewRequest;
    
    // verify the required parameter 'productPreviewRequest' is set
    if (productPreviewRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'productPreviewRequest' when calling pOSTProductpreview");
    }
    
    // create path and map variables
    String localVarPath = "/productpreview/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ProductPreviewResponse> localVarReturnType = new GenericType<ProductPreviewResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

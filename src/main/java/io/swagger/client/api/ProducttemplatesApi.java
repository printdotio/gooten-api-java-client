package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ProductBuildInfoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProducttemplatesApi {
  private ApiClient apiClient;

  public ProducttemplatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProducttemplatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a list of product templates
   * Get a list of product templates.
   * @param sku Productvariant sku.
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @return ProductBuildInfoResponse
   * @throws ApiException if fails to make API call
   */
  public ProductBuildInfoResponse getProducttemplates(String sku, String languageCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sku' is set
    if (sku == null) {
      throw new ApiException(400, "Missing the required parameter 'sku' when calling getProducttemplates");
    }
    
    // create path and map variables
    String localVarPath = "/producttemplates/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sku", sku));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "languageCode", languageCode));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ProductBuildInfoResponse> localVarReturnType = new GenericType<ProductBuildInfoResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

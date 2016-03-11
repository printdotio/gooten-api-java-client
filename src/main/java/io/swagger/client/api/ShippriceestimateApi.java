package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ShipEstimate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ShippriceestimateApi {
  private ApiClient apiClient;

  public ShippriceestimateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ShippriceestimateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a baseline ship price for an item
   * Price returned is an estimate which may or may not be realistically attainable.
   * @param productId Product ID
   * @param countryCode Country Code it will be shipped to
   * @param currencyCode Currency Code the estimate should be in. Defaults to USD.
   * @return ShipEstimate
   * @throws ApiException if fails to make API call
   */
  public ShipEstimate getShippriceestimate(Integer productId, String countryCode, String currencyCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling getShippriceestimate");
    }
    
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCode' when calling getShippriceestimate");
    }
    
    // create path and map variables
    String localVarPath = "/shippriceestimate/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currencyCode", currencyCode));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ShipEstimate> localVarReturnType = new GenericType<ShipEstimate>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

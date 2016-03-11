package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Order;
import io.swagger.client.model.OrderPriceResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class PriceestimateApi {
  private ApiClient apiClient;

  public PriceestimateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PriceestimateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get an order price
   * Get the price of an order, including discounts from a coupon.
   * @param order Order to potentially be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderPriceResult
   * @throws ApiException if fails to make API call
   */
  public OrderPriceResult pOSTPriceestimate(Order order, Integer version, String source) throws ApiException {
    Object localVarPostBody = order;
    
    // verify the required parameter 'order' is set
    if (order == null) {
      throw new ApiException(400, "Missing the required parameter 'order' when calling pOSTPriceestimate");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling pOSTPriceestimate");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling pOSTPriceestimate");
    }
    
    // create path and map variables
    String localVarPath = "/priceestimate/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

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

    
    GenericType<OrderPriceResult> localVarReturnType = new GenericType<OrderPriceResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

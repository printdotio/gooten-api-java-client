package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.OrderStatusUpdateResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class OrderstatusApi {
  private ApiClient apiClient;

  public OrderstatusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrderstatusApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Update an order status
   * Update status of each order item.
   * @param id Order Id
   * @param orderStatusName Order status name for update
   * @return OrderStatusUpdateResult
   * @throws ApiException if fails to make API call
   */
  public OrderStatusUpdateResult pOSTOrderstatus(String id, String orderStatusName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling pOSTOrderstatus");
    }
    
    // verify the required parameter 'orderStatusName' is set
    if (orderStatusName == null) {
      throw new ApiException(400, "Missing the required parameter 'orderStatusName' when calling pOSTOrderstatus");
    }
    
    // create path and map variables
    String localVarPath = "/orderstatus/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderStatusName", orderStatusName));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<OrderStatusUpdateResult> localVarReturnType = new GenericType<OrderStatusUpdateResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

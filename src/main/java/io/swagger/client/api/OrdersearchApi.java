package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.SubmittedOrderList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class OrdersearchApi {
  private ApiClient apiClient;

  public OrdersearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Search an orders
   * Search through the orders and return information about orders that match search criteria.
   * @param genericValues Any value which is related to order (partner name, address, phone, couponCode, etc...)
   * @param lastName Partner last name
   * @param email Partner email
   * @param postalCode Billing/Shipping address postal code
   * @param startDate Start date of the date range when order was created
   * @param endDate End date of the date range when order was created
   * @param uniqueUserId User Id
   * @param partnerId Partner Id
   * @param pageSize How many items to return in reponse.
   * @param page Page number, how many items to skip.
   * @return SubmittedOrderList
   * @throws ApiException if fails to make API call
   */
  public SubmittedOrderList gETOrdersearch(String genericValues, String lastName, String email, String postalCode, String startDate, String endDate, String uniqueUserId, Integer partnerId, Integer pageSize, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ordersearch/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "genericValues", genericValues));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastName", lastName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postalCode", postalCode));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uniqueUserId", uniqueUserId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "partnerId", partnerId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SubmittedOrderList> localVarReturnType = new GenericType<SubmittedOrderList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

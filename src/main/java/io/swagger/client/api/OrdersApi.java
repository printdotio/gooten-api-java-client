package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.PostSubmittedOrder;
import io.swagger.client.model.OrderResult;
import io.swagger.client.model.PostOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class OrdersApi {
  private ApiClient apiClient;

  public OrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get an order
   * Gets basic information about an order.
   * @param id Order Id
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param languageCode Resultant info language. Defaults to &#39;en&#39;.
   * @return PostSubmittedOrder
   * @throws ApiException if fails to make API call
   */
  public PostSubmittedOrder gETOrders(String id, Integer version, String source, String languageCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gETOrders");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling gETOrders");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling gETOrders");
    }
    
    // create path and map variables
    String localVarPath = "/orders/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
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

    
    GenericType<PostSubmittedOrder> localVarReturnType = new GenericType<PostSubmittedOrder>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Submit an order
   * Places an order into the system. An order can be submitted as PrePayment (in order to temporarily place an order and get an ID for Paypal) using the IsPreSubmit flag.
   * @param order Order to be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderResult
   * @throws ApiException if fails to make API call
   */
  public OrderResult pOSTOrders(PostOrder order, Integer version, String source) throws ApiException {
    Object localVarPostBody = order;
    
    // verify the required parameter 'order' is set
    if (order == null) {
      throw new ApiException(400, "Missing the required parameter 'order' when calling pOSTOrders");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling pOSTOrders");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling pOSTOrders");
    }
    
    // create path and map variables
    String localVarPath = "/orders/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
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

    
    GenericType<OrderResult> localVarReturnType = new GenericType<OrderResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

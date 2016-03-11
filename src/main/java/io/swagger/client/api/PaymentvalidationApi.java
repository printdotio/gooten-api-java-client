package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.PaymentValidationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class PaymentvalidationApi {
  private ApiClient apiClient;

  public PaymentvalidationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentvalidationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Submit payment validation for PayPal
   * Submit payment validation for PayPal
   * @param orderId Order Id returned from orders/POST
   * @param payPalKey The PayPal key returned from the Mobile SDK
   * @return PaymentValidationResponse
   * @throws ApiException if fails to make API call
   */
  public PaymentValidationResponse paymentvalidation(String orderId, String payPalKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling paymentvalidation");
    }
    
    // verify the required parameter 'payPalKey' is set
    if (payPalKey == null) {
      throw new ApiException(400, "Missing the required parameter 'payPalKey' when calling paymentvalidation");
    }
    
    // create path and map variables
    String localVarPath = "/paymentvalidation/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "OrderId", orderId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "PayPalKey", payPalKey));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PaymentValidationResponse> localVarReturnType = new GenericType<PaymentValidationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

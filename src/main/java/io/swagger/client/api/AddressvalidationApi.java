package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class AddressvalidationApi {
  private ApiClient apiClient;

  public AddressvalidationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AddressvalidationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Validates an address and returns a suggested address (if available) and a validation score.
   * Validates an address and returns a suggested address (if available) and a validation score.
   * @param line1 Address line1.
   * @param line2 Address line2.
   * @param city Address city.
   * @param state Address state.
   * @param postalCode Address postal code/zip.
   * @param countryCode Address country code.
   * @return Result
   * @throws ApiException if fails to make API call
   */
  public Result addressvalidation(String line1, String line2, String city, String state, String postalCode, String countryCode) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/addressvalidation/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "line1", line1));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "line2", line2));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postalCode", postalCode));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

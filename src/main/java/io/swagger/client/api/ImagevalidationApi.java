package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ImageValidatorResult;
import io.swagger.client.model.ImageValidationVm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ImagevalidationApi {
  private ApiClient apiClient;

  public ImagevalidationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ImagevalidationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Submit image validation
   * Validates an images and returns a validation errors (if available).
   * @param req Image validation request, contains sku and image sizes per space
   * @return ImageValidatorResult
   * @throws ApiException if fails to make API call
   */
  public ImageValidatorResult pOSTImagevalidation(ImageValidationVm req) throws ApiException {
    Object localVarPostBody = req;
    
    // verify the required parameter 'req' is set
    if (req == null) {
      throw new ApiException(400, "Missing the required parameter 'req' when calling pOSTImagevalidation");
    }
    
    // create path and map variables
    String localVarPath = "/imagevalidation/".replaceAll("\\{format\\}","json");

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

    
    GenericType<ImageValidatorResult> localVarReturnType = new GenericType<ImageValidatorResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

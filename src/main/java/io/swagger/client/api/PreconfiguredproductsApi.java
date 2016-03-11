package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.PreconfiguredProductsInsertResponse;
import io.swagger.client.model.PreconfiguredProductInsert;
import io.swagger.client.model.PreconfiguredProductsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class PreconfiguredproductsApi {
  private ApiClient apiClient;

  public PreconfiguredproductsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PreconfiguredproductsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Insert a preconfigured product
   * Insert a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return PreconfiguredProductsInsertResponse
   * @throws ApiException if fails to make API call
   */
  public PreconfiguredProductsInsertResponse createPreconfiguredproducts(PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source) throws ApiException {
    Object localVarPostBody = preconfiguredProductInsert;
    
    // verify the required parameter 'preconfiguredProductInsert' is set
    if (preconfiguredProductInsert == null) {
      throw new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling createPreconfiguredproducts");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling createPreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling createPreconfiguredproducts");
    }
    
    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
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

    
    GenericType<PreconfiguredProductsInsertResponse> localVarReturnType = new GenericType<PreconfiguredProductsInsertResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete a preconfigured product
   * Delete a preconfigured product from your recipe.
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param sku The preconfigured product&#39;s sku.
   * @return PreconfiguredProductsInsertResponse
   * @throws ApiException if fails to make API call
   */
  public PreconfiguredProductsInsertResponse deletePreconfiguredproducts(Integer version, String source, String sku) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling deletePreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling deletePreconfiguredproducts");
    }
    
    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sku", sku));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<PreconfiguredProductsInsertResponse> localVarReturnType = new GenericType<PreconfiguredProductsInsertResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a list of your preconfigured products
   * Get a list of your preconfigured products. The products returned are entirely specific to your recipe.
   * @param countryCode The country code where it would be shipped to. For example, &#39;US&#39; or &#39;CA&#39;
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
   * @return PreconfiguredProductsResponse
   * @throws ApiException if fails to make API call
   */
  public PreconfiguredProductsResponse getPreconfiguredproducts(String countryCode, Integer version, String source, String languageCode, String currencyCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCode' when calling getPreconfiguredproducts");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getPreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling getPreconfiguredproducts");
    }
    
    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "languageCode", languageCode));
    
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

    
    GenericType<PreconfiguredProductsResponse> localVarReturnType = new GenericType<PreconfiguredProductsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a preconfigured product
   * Update a preconfigured product into your recipe.
   * @param preconfiguredProductInsert The product to be inserted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return PreconfiguredProductsInsertResponse
   * @throws ApiException if fails to make API call
   */
  public PreconfiguredProductsInsertResponse updatePreconfiguredproducts(PreconfiguredProductInsert preconfiguredProductInsert, Integer version, String source) throws ApiException {
    Object localVarPostBody = preconfiguredProductInsert;
    
    // verify the required parameter 'preconfiguredProductInsert' is set
    if (preconfiguredProductInsert == null) {
      throw new ApiException(400, "Missing the required parameter 'preconfiguredProductInsert' when calling updatePreconfiguredproducts");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updatePreconfiguredproducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling updatePreconfiguredproducts");
    }
    
    // create path and map variables
    String localVarPath = "/preconfiguredproducts/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
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

    
    GenericType<PreconfiguredProductsInsertResponse> localVarReturnType = new GenericType<PreconfiguredProductsInsertResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

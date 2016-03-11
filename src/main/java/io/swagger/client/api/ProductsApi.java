package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ProductList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProductsApi {
  private ApiClient apiClient;

  public ProductsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProductsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get a list of products
   * Get a list of products. The products returned may have variants. Products returned are only those within the overall recipe. All images returned from the service are dynamically resizable by adding width and height querystrings.
   * @param countryCode The country code where it would be shipped to. For example, &#39;US&#39; or &#39;CA&#39;
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param all Whether or not to return all available printio products, or just ones in your recipe. Pass &#39;true&#39; or &#39;false&#39;.
   * @param languageCode Two-character language code, defaults to \&quot;en\&quot; (english)
   * @param currencyCode Three character currency code, defaults to \&quot;USD\&quot; (united states dollar)
   * @return ProductList
   * @throws ApiException if fails to make API call
   */
  public ProductList getProducts(String countryCode, Integer version, String source, String all, String languageCode, String currencyCode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'countryCode' is set
    if (countryCode == null) {
      throw new ApiException(400, "Missing the required parameter 'countryCode' when calling getProducts");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getProducts");
    }
    
    // verify the required parameter 'source' is set
    if (source == null) {
      throw new ApiException(400, "Missing the required parameter 'source' when calling getProducts");
    }
    
    // create path and map variables
    String localVarPath = "/products/v/{version}/source/{source}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countryCode", countryCode));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "all", all));
    
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

    
    GenericType<ProductList> localVarReturnType = new GenericType<ProductList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

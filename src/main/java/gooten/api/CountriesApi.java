package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.CountryList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface CountriesApi extends ApiClient.Api {


  /**
   * Get a list of supported countries. Output is in specified language.
   * Get a list of supported countries. Output is in specified language.
   * @param languageCode Two-character language code, like \&quot;en\&quot; (english)
   * @param key A string used to query the language dictionary for specific values within a category.
   * @return CountryList
   */
  @RequestLine("GET /countries/?languageCode={languageCode}&key={key}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  CountryList countries(@Param("languageCode") String languageCode, @Param("key") String key);
  
}

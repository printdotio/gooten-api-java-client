package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.UserInfo;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface UserinfoApi extends ApiClient.Api {


  /**
   * Get the user&#39;s language code and country based upon IP
   * IP-based user info lookup
   * @param languageCode Two-character language code, if known at the time.
   * @return UserInfo
   */
  @RequestLine("GET /userinfo/?languageCode={languageCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  UserInfo getUserinfo(@Param("languageCode") String languageCode);
  

}

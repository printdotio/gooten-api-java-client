package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.FileResult;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface ImagesApi extends ApiClient.Api {


  /**
   * POSTs files to a temporary store
   * POSTs files to a temporary store
   * @param images Form/multipart file post
   * @return FileResult
   */
  @RequestLine("POST /images/")
  @Headers({
    "Content-type: application/x-www-form-urlencoded",
    "Accepts: application/json",
  })
  FileResult postImages(@Param("images") File images);
  
}

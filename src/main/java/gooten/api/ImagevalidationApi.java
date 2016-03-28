package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.ImageValidatorResult;
import gooten.api.model.ImageValidationVm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface ImagevalidationApi extends ApiClient.Api {


  /**
   * Submit image validation
   * Validates an images and returns a validation errors (if available).
   * @param req Image validation request, contains sku and image sizes per space
   * @return ImageValidatorResult
   */
  @RequestLine("POST /imagevalidation/")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  ImageValidatorResult pOSTImagevalidation(ImageValidationVm req);
  
}

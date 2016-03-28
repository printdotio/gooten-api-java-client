package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.Result;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface AddressvalidationApi extends ApiClient.Api {


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
   */
  @RequestLine("GET /addressvalidation/?line1={line1}&line2={line2}&city={city}&state={state}&postalCode={postalCode}&countryCode={countryCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  Result addressvalidation(@Param("line1") String line1, @Param("line2") String line2, @Param("city") String city, @Param("state") String state, @Param("postalCode") String postalCode, @Param("countryCode") String countryCode);
  

}

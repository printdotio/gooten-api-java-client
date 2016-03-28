package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.PaymentValidationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public interface PaymentvalidationApi extends ApiClient.Api {


  /**
   * Submit payment validation for PayPal
   * Submit payment validation for PayPal
   * @param orderId Order Id returned from orders/POST
   * @param payPalKey The PayPal key returned from the Mobile SDK
   * @return PaymentValidationResponse
   */
  @RequestLine("GET /paymentvalidation/?OrderId={orderId}&PayPalKey={payPalKey}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  PaymentValidationResponse paymentvalidation(@Param("orderId") String orderId, @Param("payPalKey") String payPalKey);
  
}

package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.PostSubmittedOrder;
import gooten.api.model.OrderResult;
import gooten.api.model.PostOrder;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface OrdersApi extends ApiClient.Api {


  /**
   * Get an order
   * Gets basic information about an order.
   * @param id Order Id
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @param languageCode Resultant info language. Defaults to &#39;en&#39;.
   * @return PostSubmittedOrder
   */
  @RequestLine("GET /v/{version}/source/{source}/orders/?id={id}&languageCode={languageCode}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  PostSubmittedOrder gETOrders(@Param("id") String id, @Param("version") Integer version, @Param("source") String source, @Param("languageCode") String languageCode);
  
  /**
   * Submit an order
   * Places an order into the system. An order can be submitted as PrePayment (in order to temporarily place an order and get an ID for Paypal) using the IsPreSubmit flag.
   * @param order Order to be submitted
   * @param version Version of the api being used
   * @param source Description of the source-- ios, android, api
   * @return OrderResult
   */
  @RequestLine("POST /v/{version}/source/{source}/orders/")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  OrderResult pOSTOrders(PostOrder order, @Param("version") Integer version, @Param("source") String source);
  

}

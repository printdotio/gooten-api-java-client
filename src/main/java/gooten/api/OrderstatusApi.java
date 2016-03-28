package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.OrderStatusUpdateResult;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface OrderstatusApi extends ApiClient.Api {


  /**
   * Update an order status
   * Update status of each order item.
   * @param partnerBillingKey Partner billing key
   * @param id Order Id
   * @param orderStatusName Order status name for update
   * @return OrderStatusUpdateResult
   */
  @RequestLine("POST /orderstatus/?partnerBillingKey={partnerBillingKey}&id={id}&orderStatusName={orderStatusName}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  OrderStatusUpdateResult pOSTOrderstatus(@Param("partnerBillingKey") String partnerBillingKey, @Param("id") String id, @Param("orderStatusName") String orderStatusName);
  

}

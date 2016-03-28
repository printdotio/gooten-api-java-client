package gooten.api;

import gooten.api.client.ApiClient;

import gooten.api.model.SubmittedOrderList;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public interface OrdersearchApi extends ApiClient.Api {


  /**
   * Search an orders
   * Search through the orders and return information about orders that match search criteria.
   * @param partnerBillingKey Partner billing key
   * @param genericValues Any value which is related to order (partner name, address, phone, couponCode, etc...)
   * @param lastName Partner last name
   * @param email Partner email
   * @param postalCode Billing/Shipping address postal code
   * @param startDate Start date of the date range when order was created
   * @param endDate End date of the date range when order was created
   * @param uniqueUserId User Id
   * @param partnerId Partner Id
   * @param pageSize How many items to return in reponse.
   * @param page Page number, how many items to skip.
   * @return SubmittedOrderList
   */
  @RequestLine("GET /ordersearch/?partnerBillingKey={partnerBillingKey}&genericValues={genericValues}&lastName={lastName}&email={email}&postalCode={postalCode}&startDate={startDate}&endDate={endDate}&uniqueUserId={uniqueUserId}&partnerId={partnerId}&pageSize={pageSize}&page={page}")
  @Headers({
    "Content-type: application/json",
    "Accepts: application/json",
  })
  SubmittedOrderList gETOrdersearch(@Param("partnerBillingKey") String partnerBillingKey, @Param("genericValues") String genericValues, @Param("lastName") String lastName, @Param("email") String email, @Param("postalCode") String postalCode, @Param("startDate") String startDate, @Param("endDate") String endDate, @Param("uniqueUserId") String uniqueUserId, @Param("partnerId") Integer partnerId, @Param("pageSize") Integer pageSize, @Param("page") Integer page);
  

}

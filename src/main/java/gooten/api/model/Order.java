package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.OrderItem;
import gooten.api.model.Payment;
import gooten.api.model.ShipToAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class Order   {
  
  private ShipToAddress shipToAddress = null;
  private List<OrderItem> items = new ArrayList<OrderItem>();
  private Payment payment = null;
  private String couponCode = null;

  
  /**
   **/
  public Order shipToAddress(ShipToAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipToAddress")
  public ShipToAddress getShipToAddress() {
    return shipToAddress;
  }
  public void setShipToAddress(ShipToAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  
  /**
   **/
  public Order items(List<OrderItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Items")
  public List<OrderItem> getItems() {
    return items;
  }
  public void setItems(List<OrderItem> items) {
    this.items = items;
  }

  
  /**
   **/
  public Order payment(Payment payment) {
    this.payment = payment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Payment")
  public Payment getPayment() {
    return payment;
  }
  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  
  /**
   **/
  public Order couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CouponCode")
  public String getCouponCode() {
    return couponCode;
  }
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.shipToAddress, order.shipToAddress) &&
        Objects.equals(this.items, order.items) &&
        Objects.equals(this.payment, order.payment) &&
        Objects.equals(this.couponCode, order.couponCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipToAddress, items, payment, couponCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


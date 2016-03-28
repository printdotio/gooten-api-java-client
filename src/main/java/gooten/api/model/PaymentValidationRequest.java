package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class PaymentValidationRequest   {
  
  private String orderId = null;
  private String payPalKey = null;

  
  /**
   **/
  public PaymentValidationRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("OrderId")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  /**
   **/
  public PaymentValidationRequest payPalKey(String payPalKey) {
    this.payPalKey = payPalKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("PayPalKey")
  public String getPayPalKey() {
    return payPalKey;
  }
  public void setPayPalKey(String payPalKey) {
    this.payPalKey = payPalKey;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentValidationRequest paymentValidationRequest = (PaymentValidationRequest) o;
    return Objects.equals(this.orderId, paymentValidationRequest.orderId) &&
        Objects.equals(this.payPalKey, paymentValidationRequest.payPalKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, payPalKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentValidationRequest {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    payPalKey: ").append(toIndentedString(payPalKey)).append("\n");
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


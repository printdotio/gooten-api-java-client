package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class OrderPayment   {
  
  private String braintreeEncryptedCCNumber = null;
  private String braintreeEncryptedCCExpDate = null;
  private String braintreeEncryptedCCV = null;
  private String braintreePaymentNonce = null;
  private String partnerBillingKey = null;
  private Long total = null;
  private String currencyCode = null;

  
  /**
   **/
  public OrderPayment braintreeEncryptedCCNumber(String braintreeEncryptedCCNumber) {
    this.braintreeEncryptedCCNumber = braintreeEncryptedCCNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("BraintreeEncryptedCCNumber")
  public String getBraintreeEncryptedCCNumber() {
    return braintreeEncryptedCCNumber;
  }
  public void setBraintreeEncryptedCCNumber(String braintreeEncryptedCCNumber) {
    this.braintreeEncryptedCCNumber = braintreeEncryptedCCNumber;
  }

  
  /**
   **/
  public OrderPayment braintreeEncryptedCCExpDate(String braintreeEncryptedCCExpDate) {
    this.braintreeEncryptedCCExpDate = braintreeEncryptedCCExpDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("BraintreeEncryptedCCExpDate")
  public String getBraintreeEncryptedCCExpDate() {
    return braintreeEncryptedCCExpDate;
  }
  public void setBraintreeEncryptedCCExpDate(String braintreeEncryptedCCExpDate) {
    this.braintreeEncryptedCCExpDate = braintreeEncryptedCCExpDate;
  }

  
  /**
   **/
  public OrderPayment braintreeEncryptedCCV(String braintreeEncryptedCCV) {
    this.braintreeEncryptedCCV = braintreeEncryptedCCV;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("BraintreeEncryptedCCV")
  public String getBraintreeEncryptedCCV() {
    return braintreeEncryptedCCV;
  }
  public void setBraintreeEncryptedCCV(String braintreeEncryptedCCV) {
    this.braintreeEncryptedCCV = braintreeEncryptedCCV;
  }

  
  /**
   **/
  public OrderPayment braintreePaymentNonce(String braintreePaymentNonce) {
    this.braintreePaymentNonce = braintreePaymentNonce;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("BraintreePaymentNonce")
  public String getBraintreePaymentNonce() {
    return braintreePaymentNonce;
  }
  public void setBraintreePaymentNonce(String braintreePaymentNonce) {
    this.braintreePaymentNonce = braintreePaymentNonce;
  }

  
  /**
   * A code that when passed allows the order to be submitted on credit.
   **/
  public OrderPayment partnerBillingKey(String partnerBillingKey) {
    this.partnerBillingKey = partnerBillingKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A code that when passed allows the order to be submitted on credit.")
  @JsonProperty("PartnerBillingKey")
  public String getPartnerBillingKey() {
    return partnerBillingKey;
  }
  public void setPartnerBillingKey(String partnerBillingKey) {
    this.partnerBillingKey = partnerBillingKey;
  }

  
  /**
   **/
  public OrderPayment total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   **/
  public OrderPayment currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CurrencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPayment orderPayment = (OrderPayment) o;
    return Objects.equals(this.braintreeEncryptedCCNumber, orderPayment.braintreeEncryptedCCNumber) &&
        Objects.equals(this.braintreeEncryptedCCExpDate, orderPayment.braintreeEncryptedCCExpDate) &&
        Objects.equals(this.braintreeEncryptedCCV, orderPayment.braintreeEncryptedCCV) &&
        Objects.equals(this.braintreePaymentNonce, orderPayment.braintreePaymentNonce) &&
        Objects.equals(this.partnerBillingKey, orderPayment.partnerBillingKey) &&
        Objects.equals(this.total, orderPayment.total) &&
        Objects.equals(this.currencyCode, orderPayment.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(braintreeEncryptedCCNumber, braintreeEncryptedCCExpDate, braintreeEncryptedCCV, braintreePaymentNonce, partnerBillingKey, total, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPayment {\n");
    
    sb.append("    braintreeEncryptedCCNumber: ").append(toIndentedString(braintreeEncryptedCCNumber)).append("\n");
    sb.append("    braintreeEncryptedCCExpDate: ").append(toIndentedString(braintreeEncryptedCCExpDate)).append("\n");
    sb.append("    braintreeEncryptedCCV: ").append(toIndentedString(braintreeEncryptedCCV)).append("\n");
    sb.append("    braintreePaymentNonce: ").append(toIndentedString(braintreePaymentNonce)).append("\n");
    sb.append("    partnerBillingKey: ").append(toIndentedString(partnerBillingKey)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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




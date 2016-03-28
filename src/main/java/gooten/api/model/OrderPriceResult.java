package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.PriceInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class OrderPriceResult   {
  
  private PriceInfo items = null;
  private PriceInfo shipping = null;
  private PriceInfo tax = null;
  private PriceInfo couponCode = null;
  private String couponType = null;
  private String couponUsed = null;
  private Boolean hadCouponApply = null;
  private Long dollarsOff = null;
  private Long percentOff = null;
  private Boolean hadError = null;

  
  /**
   **/
  public OrderPriceResult items(PriceInfo items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Items")
  public PriceInfo getItems() {
    return items;
  }
  public void setItems(PriceInfo items) {
    this.items = items;
  }

  
  /**
   **/
  public OrderPriceResult shipping(PriceInfo shipping) {
    this.shipping = shipping;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Shipping")
  public PriceInfo getShipping() {
    return shipping;
  }
  public void setShipping(PriceInfo shipping) {
    this.shipping = shipping;
  }

  
  /**
   **/
  public OrderPriceResult tax(PriceInfo tax) {
    this.tax = tax;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Tax")
  public PriceInfo getTax() {
    return tax;
  }
  public void setTax(PriceInfo tax) {
    this.tax = tax;
  }

  
  /**
   **/
  public OrderPriceResult couponCode(PriceInfo couponCode) {
    this.couponCode = couponCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CouponCode")
  public PriceInfo getCouponCode() {
    return couponCode;
  }
  public void setCouponCode(PriceInfo couponCode) {
    this.couponCode = couponCode;
  }

  
  /**
   **/
  public OrderPriceResult couponType(String couponType) {
    this.couponType = couponType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CouponType")
  public String getCouponType() {
    return couponType;
  }
  public void setCouponType(String couponType) {
    this.couponType = couponType;
  }

  
  /**
   **/
  public OrderPriceResult couponUsed(String couponUsed) {
    this.couponUsed = couponUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CouponUsed")
  public String getCouponUsed() {
    return couponUsed;
  }
  public void setCouponUsed(String couponUsed) {
    this.couponUsed = couponUsed;
  }

  
  /**
   **/
  public OrderPriceResult hadCouponApply(Boolean hadCouponApply) {
    this.hadCouponApply = hadCouponApply;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("HadCouponApply")
  public Boolean getHadCouponApply() {
    return hadCouponApply;
  }
  public void setHadCouponApply(Boolean hadCouponApply) {
    this.hadCouponApply = hadCouponApply;
  }

  
  /**
   **/
  public OrderPriceResult dollarsOff(Long dollarsOff) {
    this.dollarsOff = dollarsOff;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("DollarsOff")
  public Long getDollarsOff() {
    return dollarsOff;
  }
  public void setDollarsOff(Long dollarsOff) {
    this.dollarsOff = dollarsOff;
  }

  
  /**
   **/
  public OrderPriceResult percentOff(Long percentOff) {
    this.percentOff = percentOff;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("PercentOff")
  public Long getPercentOff() {
    return percentOff;
  }
  public void setPercentOff(Long percentOff) {
    this.percentOff = percentOff;
  }

  
  /**
   **/
  public OrderPriceResult hadError(Boolean hadError) {
    this.hadError = hadError;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("HadError")
  public Boolean getHadError() {
    return hadError;
  }
  public void setHadError(Boolean hadError) {
    this.hadError = hadError;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPriceResult orderPriceResult = (OrderPriceResult) o;
    return Objects.equals(this.items, orderPriceResult.items) &&
        Objects.equals(this.shipping, orderPriceResult.shipping) &&
        Objects.equals(this.tax, orderPriceResult.tax) &&
        Objects.equals(this.couponCode, orderPriceResult.couponCode) &&
        Objects.equals(this.couponType, orderPriceResult.couponType) &&
        Objects.equals(this.couponUsed, orderPriceResult.couponUsed) &&
        Objects.equals(this.hadCouponApply, orderPriceResult.hadCouponApply) &&
        Objects.equals(this.dollarsOff, orderPriceResult.dollarsOff) &&
        Objects.equals(this.percentOff, orderPriceResult.percentOff) &&
        Objects.equals(this.hadError, orderPriceResult.hadError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, shipping, tax, couponCode, couponType, couponUsed, hadCouponApply, dollarsOff, percentOff, hadError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPriceResult {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
    sb.append("    couponUsed: ").append(toIndentedString(couponUsed)).append("\n");
    sb.append("    hadCouponApply: ").append(toIndentedString(hadCouponApply)).append("\n");
    sb.append("    dollarsOff: ").append(toIndentedString(dollarsOff)).append("\n");
    sb.append("    percentOff: ").append(toIndentedString(percentOff)).append("\n");
    sb.append("    hadError: ").append(toIndentedString(hadError)).append("\n");
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


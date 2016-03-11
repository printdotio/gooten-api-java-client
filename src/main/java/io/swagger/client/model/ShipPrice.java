package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ShipPrice   {
  
  private Long price = null;
  private String currencyCode = null;
  private String formattedPrice = null;

  
  /**
   **/
  public ShipPrice price(Long price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Price")
  public Long getPrice() {
    return price;
  }
  public void setPrice(Long price) {
    this.price = price;
  }

  
  /**
   **/
  public ShipPrice currencyCode(String currencyCode) {
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

  
  /**
   **/
  public ShipPrice formattedPrice(String formattedPrice) {
    this.formattedPrice = formattedPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("FormattedPrice")
  public String getFormattedPrice() {
    return formattedPrice;
  }
  public void setFormattedPrice(String formattedPrice) {
    this.formattedPrice = formattedPrice;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipPrice shipPrice = (ShipPrice) o;
    return Objects.equals(this.price, shipPrice.price) &&
        Objects.equals(this.currencyCode, shipPrice.currencyCode) &&
        Objects.equals(this.formattedPrice, shipPrice.formattedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, currencyCode, formattedPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipPrice {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    formattedPrice: ").append(toIndentedString(formattedPrice)).append("\n");
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


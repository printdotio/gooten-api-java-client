package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class PriceInfo   {
  
  private Long price = null;
  private String currencyCode = null;
  private String formattedPrice = null;
  private String currencyFormat = null;
  private Long currencyDigits = null;

  
  /**
   **/
  public PriceInfo price(Long price) {
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
  public PriceInfo currencyCode(String currencyCode) {
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
  public PriceInfo formattedPrice(String formattedPrice) {
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

  
  /**
   **/
  public PriceInfo currencyFormat(String currencyFormat) {
    this.currencyFormat = currencyFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CurrencyFormat")
  public String getCurrencyFormat() {
    return currencyFormat;
  }
  public void setCurrencyFormat(String currencyFormat) {
    this.currencyFormat = currencyFormat;
  }

  
  /**
   **/
  public PriceInfo currencyDigits(Long currencyDigits) {
    this.currencyDigits = currencyDigits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CurrencyDigits")
  public Long getCurrencyDigits() {
    return currencyDigits;
  }
  public void setCurrencyDigits(Long currencyDigits) {
    this.currencyDigits = currencyDigits;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceInfo priceInfo = (PriceInfo) o;
    return Objects.equals(this.price, priceInfo.price) &&
        Objects.equals(this.currencyCode, priceInfo.currencyCode) &&
        Objects.equals(this.formattedPrice, priceInfo.formattedPrice) &&
        Objects.equals(this.currencyFormat, priceInfo.currencyFormat) &&
        Objects.equals(this.currencyDigits, priceInfo.currencyDigits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, currencyCode, formattedPrice, currencyFormat, currencyDigits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceInfo {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    formattedPrice: ").append(toIndentedString(formattedPrice)).append("\n");
    sb.append("    currencyFormat: ").append(toIndentedString(currencyFormat)).append("\n");
    sb.append("    currencyDigits: ").append(toIndentedString(currencyDigits)).append("\n");
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


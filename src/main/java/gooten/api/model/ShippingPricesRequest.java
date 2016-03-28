package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.SkuQuantityPair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class ShippingPricesRequest   {
  
  private String shipToPostalCode = null;
  private String shipToCountry = null;
  private String shipToState = null;
  private String currencyCode = null;
  private String languageCode = null;
  private List<SkuQuantityPair> items = new ArrayList<SkuQuantityPair>();

  
  /**
   **/
  public ShippingPricesRequest shipToPostalCode(String shipToPostalCode) {
    this.shipToPostalCode = shipToPostalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipToPostalCode")
  public String getShipToPostalCode() {
    return shipToPostalCode;
  }
  public void setShipToPostalCode(String shipToPostalCode) {
    this.shipToPostalCode = shipToPostalCode;
  }

  
  /**
   **/
  public ShippingPricesRequest shipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipToCountry")
  public String getShipToCountry() {
    return shipToCountry;
  }
  public void setShipToCountry(String shipToCountry) {
    this.shipToCountry = shipToCountry;
  }

  
  /**
   **/
  public ShippingPricesRequest shipToState(String shipToState) {
    this.shipToState = shipToState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipToState")
  public String getShipToState() {
    return shipToState;
  }
  public void setShipToState(String shipToState) {
    this.shipToState = shipToState;
  }

  
  /**
   **/
  public ShippingPricesRequest currencyCode(String currencyCode) {
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
  public ShippingPricesRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("LanguageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   **/
  public ShippingPricesRequest items(List<SkuQuantityPair> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Items")
  public List<SkuQuantityPair> getItems() {
    return items;
  }
  public void setItems(List<SkuQuantityPair> items) {
    this.items = items;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingPricesRequest shippingPricesRequest = (ShippingPricesRequest) o;
    return Objects.equals(this.shipToPostalCode, shippingPricesRequest.shipToPostalCode) &&
        Objects.equals(this.shipToCountry, shippingPricesRequest.shipToCountry) &&
        Objects.equals(this.shipToState, shippingPricesRequest.shipToState) &&
        Objects.equals(this.currencyCode, shippingPricesRequest.currencyCode) &&
        Objects.equals(this.languageCode, shippingPricesRequest.languageCode) &&
        Objects.equals(this.items, shippingPricesRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipToPostalCode, shipToCountry, shipToState, currencyCode, languageCode, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingPricesRequest {\n");
    
    sb.append("    shipToPostalCode: ").append(toIndentedString(shipToPostalCode)).append("\n");
    sb.append("    shipToCountry: ").append(toIndentedString(shipToCountry)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


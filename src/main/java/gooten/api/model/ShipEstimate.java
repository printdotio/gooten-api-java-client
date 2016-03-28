package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ShipPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class ShipEstimate   {
  
  private ShipPrice minPrice = null;
  private ShipPrice maxPrice = null;
  private String vendorCountryCode = null;
  private Boolean canShipExpedited = null;
  private Long estShipDays = null;

  
  /**
   **/
  public ShipEstimate minPrice(ShipPrice minPrice) {
    this.minPrice = minPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("MinPrice")
  public ShipPrice getMinPrice() {
    return minPrice;
  }
  public void setMinPrice(ShipPrice minPrice) {
    this.minPrice = minPrice;
  }

  
  /**
   **/
  public ShipEstimate maxPrice(ShipPrice maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("MaxPrice")
  public ShipPrice getMaxPrice() {
    return maxPrice;
  }
  public void setMaxPrice(ShipPrice maxPrice) {
    this.maxPrice = maxPrice;
  }

  
  /**
   **/
  public ShipEstimate vendorCountryCode(String vendorCountryCode) {
    this.vendorCountryCode = vendorCountryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("VendorCountryCode")
  public String getVendorCountryCode() {
    return vendorCountryCode;
  }
  public void setVendorCountryCode(String vendorCountryCode) {
    this.vendorCountryCode = vendorCountryCode;
  }

  
  /**
   **/
  public ShipEstimate canShipExpedited(Boolean canShipExpedited) {
    this.canShipExpedited = canShipExpedited;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CanShipExpedited")
  public Boolean getCanShipExpedited() {
    return canShipExpedited;
  }
  public void setCanShipExpedited(Boolean canShipExpedited) {
    this.canShipExpedited = canShipExpedited;
  }

  
  /**
   **/
  public ShipEstimate estShipDays(Long estShipDays) {
    this.estShipDays = estShipDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("EstShipDays")
  public Long getEstShipDays() {
    return estShipDays;
  }
  public void setEstShipDays(Long estShipDays) {
    this.estShipDays = estShipDays;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipEstimate shipEstimate = (ShipEstimate) o;
    return Objects.equals(this.minPrice, shipEstimate.minPrice) &&
        Objects.equals(this.maxPrice, shipEstimate.maxPrice) &&
        Objects.equals(this.vendorCountryCode, shipEstimate.vendorCountryCode) &&
        Objects.equals(this.canShipExpedited, shipEstimate.canShipExpedited) &&
        Objects.equals(this.estShipDays, shipEstimate.estShipDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPrice, maxPrice, vendorCountryCode, canShipExpedited, estShipDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipEstimate {\n");
    
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    vendorCountryCode: ").append(toIndentedString(vendorCountryCode)).append("\n");
    sb.append("    canShipExpedited: ").append(toIndentedString(canShipExpedited)).append("\n");
    sb.append("    estShipDays: ").append(toIndentedString(estShipDays)).append("\n");
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


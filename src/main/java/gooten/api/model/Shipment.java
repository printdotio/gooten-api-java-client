package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class Shipment   {
  
  private String trackingNumber = null;
  private String trackingUrl = null;
  private String shipCarrierName = null;

  
  /**
   **/
  public Shipment trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("TrackingNumber")
  public String getTrackingNumber() {
    return trackingNumber;
  }
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  
  /**
   **/
  public Shipment trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("TrackingUrl")
  public String getTrackingUrl() {
    return trackingUrl;
  }
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  
  /**
   **/
  public Shipment shipCarrierName(String shipCarrierName) {
    this.shipCarrierName = shipCarrierName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipCarrierName")
  public String getShipCarrierName() {
    return shipCarrierName;
  }
  public void setShipCarrierName(String shipCarrierName) {
    this.shipCarrierName = shipCarrierName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.trackingNumber, shipment.trackingNumber) &&
        Objects.equals(this.trackingUrl, shipment.trackingUrl) &&
        Objects.equals(this.shipCarrierName, shipment.shipCarrierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingNumber, trackingUrl, shipCarrierName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    shipCarrierName: ").append(toIndentedString(shipCarrierName)).append("\n");
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




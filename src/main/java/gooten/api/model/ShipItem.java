package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ShipOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class ShipItem   {
  
  private List<String> sKUs = new ArrayList<String>();
  private List<ShipOption> shipOptions = new ArrayList<ShipOption>();

  
  /**
   **/
  public ShipItem sKUs(List<String> sKUs) {
    this.sKUs = sKUs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("SKUs")
  public List<String> getSKUs() {
    return sKUs;
  }
  public void setSKUs(List<String> sKUs) {
    this.sKUs = sKUs;
  }

  
  /**
   **/
  public ShipItem shipOptions(List<ShipOption> shipOptions) {
    this.shipOptions = shipOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipOptions")
  public List<ShipOption> getShipOptions() {
    return shipOptions;
  }
  public void setShipOptions(List<ShipOption> shipOptions) {
    this.shipOptions = shipOptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipItem shipItem = (ShipItem) o;
    return Objects.equals(this.sKUs, shipItem.sKUs) &&
        Objects.equals(this.shipOptions, shipItem.shipOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sKUs, shipOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipItem {\n");
    
    sb.append("    sKUs: ").append(toIndentedString(sKUs)).append("\n");
    sb.append("    shipOptions: ").append(toIndentedString(shipOptions)).append("\n");
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




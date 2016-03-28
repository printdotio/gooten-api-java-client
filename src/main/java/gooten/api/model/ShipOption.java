package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ShipPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class ShipOption   {
  
  private Long id = null;
  private String methodType = null;
  private Long methodId = null;
  private String name = null;
  private String carrierName = null;
  private String carrierLogoUrl = null;
  private ShipPrice price = null;
  private ShipPrice partnerPrice = null;
  private Long estBusinessDaysTilDelivery = null;

  
  /**
   * The ID that can be passed into the /orders POST endpoing as ShipCarrierMethodId to specify an item's shipping method.
   **/
  public ShipOption id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID that can be passed into the /orders POST endpoing as ShipCarrierMethodId to specify an item's shipping method.")
  @JsonProperty("Id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  public ShipOption methodType(String methodType) {
    this.methodType = methodType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("MethodType")
  public String getMethodType() {
    return methodType;
  }
  public void setMethodType(String methodType) {
    this.methodType = methodType;
  }

  
  /**
   **/
  public ShipOption methodId(Long methodId) {
    this.methodId = methodId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("MethodId")
  public Long getMethodId() {
    return methodId;
  }
  public void setMethodId(Long methodId) {
    this.methodId = methodId;
  }

  
  /**
   **/
  public ShipOption name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public ShipOption carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CarrierName")
  public String getCarrierName() {
    return carrierName;
  }
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  
  /**
   **/
  public ShipOption carrierLogoUrl(String carrierLogoUrl) {
    this.carrierLogoUrl = carrierLogoUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CarrierLogoUrl")
  public String getCarrierLogoUrl() {
    return carrierLogoUrl;
  }
  public void setCarrierLogoUrl(String carrierLogoUrl) {
    this.carrierLogoUrl = carrierLogoUrl;
  }

  
  /**
   **/
  public ShipOption price(ShipPrice price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Price")
  public ShipPrice getPrice() {
    return price;
  }
  public void setPrice(ShipPrice price) {
    this.price = price;
  }

  
  /**
   **/
  public ShipOption partnerPrice(ShipPrice partnerPrice) {
    this.partnerPrice = partnerPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PartnerPrice")
  public ShipPrice getPartnerPrice() {
    return partnerPrice;
  }
  public void setPartnerPrice(ShipPrice partnerPrice) {
    this.partnerPrice = partnerPrice;
  }

  
  /**
   **/
  public ShipOption estBusinessDaysTilDelivery(Long estBusinessDaysTilDelivery) {
    this.estBusinessDaysTilDelivery = estBusinessDaysTilDelivery;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("EstBusinessDaysTilDelivery")
  public Long getEstBusinessDaysTilDelivery() {
    return estBusinessDaysTilDelivery;
  }
  public void setEstBusinessDaysTilDelivery(Long estBusinessDaysTilDelivery) {
    this.estBusinessDaysTilDelivery = estBusinessDaysTilDelivery;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipOption shipOption = (ShipOption) o;
    return Objects.equals(this.id, shipOption.id) &&
        Objects.equals(this.methodType, shipOption.methodType) &&
        Objects.equals(this.methodId, shipOption.methodId) &&
        Objects.equals(this.name, shipOption.name) &&
        Objects.equals(this.carrierName, shipOption.carrierName) &&
        Objects.equals(this.carrierLogoUrl, shipOption.carrierLogoUrl) &&
        Objects.equals(this.price, shipOption.price) &&
        Objects.equals(this.partnerPrice, shipOption.partnerPrice) &&
        Objects.equals(this.estBusinessDaysTilDelivery, shipOption.estBusinessDaysTilDelivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, methodType, methodId, name, carrierName, carrierLogoUrl, price, partnerPrice, estBusinessDaysTilDelivery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipOption {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    methodType: ").append(toIndentedString(methodType)).append("\n");
    sb.append("    methodId: ").append(toIndentedString(methodId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    carrierLogoUrl: ").append(toIndentedString(carrierLogoUrl)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    partnerPrice: ").append(toIndentedString(partnerPrice)).append("\n");
    sb.append("    estBusinessDaysTilDelivery: ").append(toIndentedString(estBusinessDaysTilDelivery)).append("\n");
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


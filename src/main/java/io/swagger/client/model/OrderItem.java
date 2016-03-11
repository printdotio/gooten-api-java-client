package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.OrderItemImage;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class OrderItem   {
  
  private Long quantity = null;
  private String SKU = null;
  private Long shipCarrierMethodId = null;
  private List<OrderItemImage> images = new ArrayList<OrderItemImage>();

  
  /**
   **/
  public OrderItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Quantity")
  public Long getQuantity() {
    return quantity;
  }
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public OrderItem SKU(String SKU) {
    this.SKU = SKU;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("SKU")
  public String getSKU() {
    return SKU;
  }
  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  
  /**
   **/
  public OrderItem shipCarrierMethodId(Long shipCarrierMethodId) {
    this.shipCarrierMethodId = shipCarrierMethodId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipCarrierMethodId")
  public Long getShipCarrierMethodId() {
    return shipCarrierMethodId;
  }
  public void setShipCarrierMethodId(Long shipCarrierMethodId) {
    this.shipCarrierMethodId = shipCarrierMethodId;
  }

  
  /**
   **/
  public OrderItem images(List<OrderItemImage> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Images")
  public List<OrderItemImage> getImages() {
    return images;
  }
  public void setImages(List<OrderItemImage> images) {
    this.images = images;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.SKU, orderItem.SKU) &&
        Objects.equals(this.shipCarrierMethodId, orderItem.shipCarrierMethodId) &&
        Objects.equals(this.images, orderItem.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, SKU, shipCarrierMethodId, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    shipCarrierMethodId: ").append(toIndentedString(shipCarrierMethodId)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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


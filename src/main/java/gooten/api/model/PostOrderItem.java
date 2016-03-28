package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.Image;
import gooten.api.model.Meta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class PostOrderItem   {
  
  private Long quantity = null;
  private String SKU = null;
  private Long shipCarrierMethodId = null;
  private String shipType = null;
  private List<Image> images = new ArrayList<Image>();
  private String sourceId = null;
  private Meta meta = null;

  
  /**
   **/
  public PostOrderItem quantity(Long quantity) {
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
  public PostOrderItem SKU(String SKU) {
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
  public PostOrderItem shipCarrierMethodId(Long shipCarrierMethodId) {
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
   * If one does not want to pass a ShipCarrierMethodId of a specific shipping method, one can instead pass 'Standard', 'Overnight', or 'Expedited' here.
   **/
  public PostOrderItem shipType(String shipType) {
    this.shipType = shipType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If one does not want to pass a ShipCarrierMethodId of a specific shipping method, one can instead pass 'Standard', 'Overnight', or 'Expedited' here.")
  @JsonProperty("ShipType")
  public String getShipType() {
    return shipType;
  }
  public void setShipType(String shipType) {
    this.shipType = shipType;
  }

  
  /**
   **/
  public PostOrderItem images(List<Image> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Images")
  public List<Image> getImages() {
    return images;
  }
  public void setImages(List<Image> images) {
    this.images = images;
  }

  
  /**
   * An optional place to pass in an ID for the OrderItem.
   **/
  public PostOrderItem sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An optional place to pass in an ID for the OrderItem.")
  @JsonProperty("SourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * An optional Map<string,string> of misc properties.
   **/
  public PostOrderItem meta(Meta meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An optional Map<string,string> of misc properties.")
  @JsonProperty("Meta")
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOrderItem postOrderItem = (PostOrderItem) o;
    return Objects.equals(this.quantity, postOrderItem.quantity) &&
        Objects.equals(this.SKU, postOrderItem.SKU) &&
        Objects.equals(this.shipCarrierMethodId, postOrderItem.shipCarrierMethodId) &&
        Objects.equals(this.shipType, postOrderItem.shipType) &&
        Objects.equals(this.images, postOrderItem.images) &&
        Objects.equals(this.sourceId, postOrderItem.sourceId) &&
        Objects.equals(this.meta, postOrderItem.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, SKU, shipCarrierMethodId, shipType, images, sourceId, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOrderItem {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    shipCarrierMethodId: ").append(toIndentedString(shipCarrierMethodId)).append("\n");
    sb.append("    shipType: ").append(toIndentedString(shipType)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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


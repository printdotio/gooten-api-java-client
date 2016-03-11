package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class SkuQuantityPair   {
  
  private String SKU = null;
  private Long quantity = null;

  
  /**
   **/
  public SkuQuantityPair SKU(String SKU) {
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
  public SkuQuantityPair quantity(Long quantity) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuQuantityPair skuQuantityPair = (SkuQuantityPair) o;
    return Objects.equals(this.SKU, skuQuantityPair.SKU) &&
        Objects.equals(this.quantity, skuQuantityPair.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SKU, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuQuantityPair {\n");
    
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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


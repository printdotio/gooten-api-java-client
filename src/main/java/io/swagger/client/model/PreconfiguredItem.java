package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Preconfiguration;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class PreconfiguredItem   {
  
  private Long productId = null;
  private String productVariantSku = null;
  private List<Preconfiguration> preconfigurations = new ArrayList<Preconfiguration>();

  
  /**
   * The ID of the product this item references.
   **/
  public PreconfiguredItem productId(Long productId) {
    this.productId = productId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the product this item references.")
  @JsonProperty("ProductId")
  public Long getProductId() {
    return productId;
  }
  public void setProductId(Long productId) {
    this.productId = productId;
  }

  
  /**
   * The sku of the product variant this item references.
   **/
  public PreconfiguredItem productVariantSku(String productVariantSku) {
    this.productVariantSku = productVariantSku;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sku of the product variant this item references.")
  @JsonProperty("ProductVariantSku")
  public String getProductVariantSku() {
    return productVariantSku;
  }
  public void setProductVariantSku(String productVariantSku) {
    this.productVariantSku = productVariantSku;
  }

  
  /**
   **/
  public PreconfiguredItem preconfigurations(List<Preconfiguration> preconfigurations) {
    this.preconfigurations = preconfigurations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Preconfigurations")
  public List<Preconfiguration> getPreconfigurations() {
    return preconfigurations;
  }
  public void setPreconfigurations(List<Preconfiguration> preconfigurations) {
    this.preconfigurations = preconfigurations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreconfiguredItem preconfiguredItem = (PreconfiguredItem) o;
    return Objects.equals(this.productId, preconfiguredItem.productId) &&
        Objects.equals(this.productVariantSku, preconfiguredItem.productVariantSku) &&
        Objects.equals(this.preconfigurations, preconfiguredItem.preconfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productVariantSku, preconfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreconfiguredItem {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productVariantSku: ").append(toIndentedString(productVariantSku)).append("\n");
    sb.append("    preconfigurations: ").append(toIndentedString(preconfigurations)).append("\n");
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


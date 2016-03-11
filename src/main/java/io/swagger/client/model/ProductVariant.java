package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ProductOption;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProductVariant   {
  
  private String sku = null;
  private Long maxImages = null;
  private Boolean hasTemplates = null;
  private List<ProductOption> options = new ArrayList<ProductOption>();

  
  /**
   **/
  public ProductVariant sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  public ProductVariant maxImages(Long maxImages) {
    this.maxImages = maxImages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("MaxImages")
  public Long getMaxImages() {
    return maxImages;
  }
  public void setMaxImages(Long maxImages) {
    this.maxImages = maxImages;
  }

  
  /**
   **/
  public ProductVariant hasTemplates(Boolean hasTemplates) {
    this.hasTemplates = hasTemplates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("HasTemplates")
  public Boolean getHasTemplates() {
    return hasTemplates;
  }
  public void setHasTemplates(Boolean hasTemplates) {
    this.hasTemplates = hasTemplates;
  }

  
  /**
   **/
  public ProductVariant options(List<ProductOption> options) {
    this.options = options;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Options")
  public List<ProductOption> getOptions() {
    return options;
  }
  public void setOptions(List<ProductOption> options) {
    this.options = options;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductVariant productVariant = (ProductVariant) o;
    return Objects.equals(this.sku, productVariant.sku) &&
        Objects.equals(this.maxImages, productVariant.maxImages) &&
        Objects.equals(this.hasTemplates, productVariant.hasTemplates) &&
        Objects.equals(this.options, productVariant.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, maxImages, hasTemplates, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariant {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    maxImages: ").append(toIndentedString(maxImages)).append("\n");
    sb.append("    hasTemplates: ").append(toIndentedString(hasTemplates)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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


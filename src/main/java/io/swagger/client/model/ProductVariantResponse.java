package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ProductOptionList;
import io.swagger.client.model.ProductVariant;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProductVariantResponse   {
  
  private List<ProductVariant> productVariants = new ArrayList<ProductVariant>();
  private List<ProductOptionList> options = new ArrayList<ProductOptionList>();

  
  /**
   **/
  public ProductVariantResponse productVariants(List<ProductVariant> productVariants) {
    this.productVariants = productVariants;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ProductVariants")
  public List<ProductVariant> getProductVariants() {
    return productVariants;
  }
  public void setProductVariants(List<ProductVariant> productVariants) {
    this.productVariants = productVariants;
  }

  
  /**
   **/
  public ProductVariantResponse options(List<ProductOptionList> options) {
    this.options = options;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Options")
  public List<ProductOptionList> getOptions() {
    return options;
  }
  public void setOptions(List<ProductOptionList> options) {
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
    ProductVariantResponse productVariantResponse = (ProductVariantResponse) o;
    return Objects.equals(this.productVariants, productVariantResponse.productVariants) &&
        Objects.equals(this.options, productVariantResponse.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariants, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductVariantResponse {\n");
    
    sb.append("    productVariants: ").append(toIndentedString(productVariants)).append("\n");
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


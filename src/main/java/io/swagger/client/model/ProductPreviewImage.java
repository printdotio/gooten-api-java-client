package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ProductPreviewImageSpec;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProductPreviewImage   {
  
  private String layerId = null;
  private ProductPreviewImageSpec image = null;

  
  /**
   **/
  public ProductPreviewImage layerId(String layerId) {
    this.layerId = layerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("LayerId")
  public String getLayerId() {
    return layerId;
  }
  public void setLayerId(String layerId) {
    this.layerId = layerId;
  }

  
  /**
   **/
  public ProductPreviewImage image(ProductPreviewImageSpec image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Image")
  public ProductPreviewImageSpec getImage() {
    return image;
  }
  public void setImage(ProductPreviewImageSpec image) {
    this.image = image;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPreviewImage productPreviewImage = (ProductPreviewImage) o;
    return Objects.equals(this.layerId, productPreviewImage.layerId) &&
        Objects.equals(this.image, productPreviewImage.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layerId, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPreviewImage {\n");
    
    sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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


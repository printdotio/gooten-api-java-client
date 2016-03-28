package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ProductPreviewImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class ProductPreviewRequest   {
  
  private String sku = null;
  private String template = null;
  private List<ProductPreviewImage> images = new ArrayList<ProductPreviewImage>();
  private Long maxHeight = null;
  private Long maxWidth = null;

  
  /**
   **/
  public ProductPreviewRequest sku(String sku) {
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
  public ProductPreviewRequest template(String template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Template")
  public String getTemplate() {
    return template;
  }
  public void setTemplate(String template) {
    this.template = template;
  }

  
  /**
   **/
  public ProductPreviewRequest images(List<ProductPreviewImage> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Images")
  public List<ProductPreviewImage> getImages() {
    return images;
  }
  public void setImages(List<ProductPreviewImage> images) {
    this.images = images;
  }

  
  /**
   * Max height of the resultant image. Defaults to 500px
   **/
  public ProductPreviewRequest maxHeight(Long maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max height of the resultant image. Defaults to 500px")
  @JsonProperty("MaxHeight")
  public Long getMaxHeight() {
    return maxHeight;
  }
  public void setMaxHeight(Long maxHeight) {
    this.maxHeight = maxHeight;
  }

  
  /**
   * Max width of the resultant image. Defaults to 500px
   **/
  public ProductPreviewRequest maxWidth(Long maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Max width of the resultant image. Defaults to 500px")
  @JsonProperty("MaxWidth")
  public Long getMaxWidth() {
    return maxWidth;
  }
  public void setMaxWidth(Long maxWidth) {
    this.maxWidth = maxWidth;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPreviewRequest productPreviewRequest = (ProductPreviewRequest) o;
    return Objects.equals(this.sku, productPreviewRequest.sku) &&
        Objects.equals(this.template, productPreviewRequest.template) &&
        Objects.equals(this.images, productPreviewRequest.images) &&
        Objects.equals(this.maxHeight, productPreviewRequest.maxHeight) &&
        Objects.equals(this.maxWidth, productPreviewRequest.maxWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, template, images, maxHeight, maxWidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPreviewRequest {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
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




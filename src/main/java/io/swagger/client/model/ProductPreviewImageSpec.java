package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProductPreviewImageSpec   {
  
  private String url = null;
  private Long x1 = null;
  private Long x2 = null;
  private Long y1 = null;
  private Long y2 = null;

  
  /**
   **/
  public ProductPreviewImageSpec url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public ProductPreviewImageSpec x1(Long x1) {
    this.x1 = x1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("X1")
  public Long getX1() {
    return x1;
  }
  public void setX1(Long x1) {
    this.x1 = x1;
  }

  
  /**
   **/
  public ProductPreviewImageSpec x2(Long x2) {
    this.x2 = x2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("X2")
  public Long getX2() {
    return x2;
  }
  public void setX2(Long x2) {
    this.x2 = x2;
  }

  
  /**
   **/
  public ProductPreviewImageSpec y1(Long y1) {
    this.y1 = y1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Y1")
  public Long getY1() {
    return y1;
  }
  public void setY1(Long y1) {
    this.y1 = y1;
  }

  
  /**
   **/
  public ProductPreviewImageSpec y2(Long y2) {
    this.y2 = y2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Y2")
  public Long getY2() {
    return y2;
  }
  public void setY2(Long y2) {
    this.y2 = y2;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPreviewImageSpec productPreviewImageSpec = (ProductPreviewImageSpec) o;
    return Objects.equals(this.url, productPreviewImageSpec.url) &&
        Objects.equals(this.x1, productPreviewImageSpec.x1) &&
        Objects.equals(this.x2, productPreviewImageSpec.x2) &&
        Objects.equals(this.y1, productPreviewImageSpec.y1) &&
        Objects.equals(this.y2, productPreviewImageSpec.y2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, x1, x2, y1, y2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPreviewImageSpec {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    x1: ").append(toIndentedString(x1)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
    sb.append("    y1: ").append(toIndentedString(y1)).append("\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
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


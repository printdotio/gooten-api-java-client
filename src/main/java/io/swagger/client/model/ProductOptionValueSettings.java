package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ProductOptionValueSettings   {
  
  private String iconUrl = null;
  private String iconType = null;
  private String colorRgba = null;

  
  /**
   **/
  public ProductOptionValueSettings iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("IconUrl")
  public String getIconUrl() {
    return iconUrl;
  }
  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  
  /**
   **/
  public ProductOptionValueSettings iconType(String iconType) {
    this.iconType = iconType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("IconType")
  public String getIconType() {
    return iconType;
  }
  public void setIconType(String iconType) {
    this.iconType = iconType;
  }

  
  /**
   **/
  public ProductOptionValueSettings colorRgba(String colorRgba) {
    this.colorRgba = colorRgba;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ColorRgba")
  public String getColorRgba() {
    return colorRgba;
  }
  public void setColorRgba(String colorRgba) {
    this.colorRgba = colorRgba;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOptionValueSettings productOptionValueSettings = (ProductOptionValueSettings) o;
    return Objects.equals(this.iconUrl, productOptionValueSettings.iconUrl) &&
        Objects.equals(this.iconType, productOptionValueSettings.iconType) &&
        Objects.equals(this.colorRgba, productOptionValueSettings.colorRgba);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconUrl, iconType, colorRgba);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOptionValueSettings {\n");
    
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    iconType: ").append(toIndentedString(iconType)).append("\n");
    sb.append("    colorRgba: ").append(toIndentedString(colorRgba)).append("\n");
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


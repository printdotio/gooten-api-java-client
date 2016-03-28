package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class ProductOption   {
  
  private String optionId = null;
  private String valueId = null;
  private String name = null;
  private String value = null;
  private String imageUrl = null;
  private String imageType = null;
  private String rgbaColor = null;
  private String cmValue = null;
  private String sortValue = null;

  
  /**
   **/
  public ProductOption optionId(String optionId) {
    this.optionId = optionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("OptionId")
  public String getOptionId() {
    return optionId;
  }
  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  
  /**
   **/
  public ProductOption valueId(String valueId) {
    this.valueId = valueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ValueId")
  public String getValueId() {
    return valueId;
  }
  public void setValueId(String valueId) {
    this.valueId = valueId;
  }

  
  /**
   **/
  public ProductOption name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public ProductOption value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  public ProductOption imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ImageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  
  /**
   **/
  public ProductOption imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ImageType")
  public String getImageType() {
    return imageType;
  }
  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  
  /**
   **/
  public ProductOption rgbaColor(String rgbaColor) {
    this.rgbaColor = rgbaColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("RgbaColor")
  public String getRgbaColor() {
    return rgbaColor;
  }
  public void setRgbaColor(String rgbaColor) {
    this.rgbaColor = rgbaColor;
  }

  
  /**
   **/
  public ProductOption cmValue(String cmValue) {
    this.cmValue = cmValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CmValue")
  public String getCmValue() {
    return cmValue;
  }
  public void setCmValue(String cmValue) {
    this.cmValue = cmValue;
  }

  
  /**
   **/
  public ProductOption sortValue(String sortValue) {
    this.sortValue = sortValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("SortValue")
  public String getSortValue() {
    return sortValue;
  }
  public void setSortValue(String sortValue) {
    this.sortValue = sortValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOption productOption = (ProductOption) o;
    return Objects.equals(this.optionId, productOption.optionId) &&
        Objects.equals(this.valueId, productOption.valueId) &&
        Objects.equals(this.name, productOption.name) &&
        Objects.equals(this.value, productOption.value) &&
        Objects.equals(this.imageUrl, productOption.imageUrl) &&
        Objects.equals(this.imageType, productOption.imageType) &&
        Objects.equals(this.rgbaColor, productOption.rgbaColor) &&
        Objects.equals(this.cmValue, productOption.cmValue) &&
        Objects.equals(this.sortValue, productOption.sortValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId, valueId, name, value, imageUrl, imageType, rgbaColor, cmValue, sortValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOption {\n");
    
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    rgbaColor: ").append(toIndentedString(rgbaColor)).append("\n");
    sb.append("    cmValue: ").append(toIndentedString(cmValue)).append("\n");
    sb.append("    sortValue: ").append(toIndentedString(sortValue)).append("\n");
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




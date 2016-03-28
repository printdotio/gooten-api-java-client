package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ProductBuildInfoSpace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class ProductBuildOption   {
  
  private String name = null;
  private String imageUrl = null;
  private Boolean isDefault = null;
  private String category = null;
  private Boolean isPartnerSpecific = null;
  private List<ProductBuildInfoSpace> spaces = new ArrayList<ProductBuildInfoSpace>();

  
  /**
   **/
  public ProductBuildOption name(String name) {
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
  public ProductBuildOption imageUrl(String imageUrl) {
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
  public ProductBuildOption isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("IsDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  
  /**
   **/
  public ProductBuildOption category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   **/
  public ProductBuildOption isPartnerSpecific(Boolean isPartnerSpecific) {
    this.isPartnerSpecific = isPartnerSpecific;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("IsPartnerSpecific")
  public Boolean getIsPartnerSpecific() {
    return isPartnerSpecific;
  }
  public void setIsPartnerSpecific(Boolean isPartnerSpecific) {
    this.isPartnerSpecific = isPartnerSpecific;
  }

  
  /**
   **/
  public ProductBuildOption spaces(List<ProductBuildInfoSpace> spaces) {
    this.spaces = spaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Spaces")
  public List<ProductBuildInfoSpace> getSpaces() {
    return spaces;
  }
  public void setSpaces(List<ProductBuildInfoSpace> spaces) {
    this.spaces = spaces;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBuildOption productBuildOption = (ProductBuildOption) o;
    return Objects.equals(this.name, productBuildOption.name) &&
        Objects.equals(this.imageUrl, productBuildOption.imageUrl) &&
        Objects.equals(this.isDefault, productBuildOption.isDefault) &&
        Objects.equals(this.category, productBuildOption.category) &&
        Objects.equals(this.isPartnerSpecific, productBuildOption.isPartnerSpecific) &&
        Objects.equals(this.spaces, productBuildOption.spaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imageUrl, isDefault, category, isPartnerSpecific, spaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBuildOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    isPartnerSpecific: ").append(toIndentedString(isPartnerSpecific)).append("\n");
    sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
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




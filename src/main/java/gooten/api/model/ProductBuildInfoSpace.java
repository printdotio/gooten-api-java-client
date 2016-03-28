package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ProductBuildInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class ProductBuildInfoSpace   {
  
  private String id = null;
  private String description = null;
  private Long index = null;
  private Long defaultRotation = null;
  private List<ProductBuildInfo> layers = new ArrayList<ProductBuildInfo>();

  
  /**
   **/
  public ProductBuildInfoSpace id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ProductBuildInfoSpace description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public ProductBuildInfoSpace index(Long index) {
    this.index = index;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Index")
  public Long getIndex() {
    return index;
  }
  public void setIndex(Long index) {
    this.index = index;
  }

  
  /**
   **/
  public ProductBuildInfoSpace defaultRotation(Long defaultRotation) {
    this.defaultRotation = defaultRotation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("DefaultRotation")
  public Long getDefaultRotation() {
    return defaultRotation;
  }
  public void setDefaultRotation(Long defaultRotation) {
    this.defaultRotation = defaultRotation;
  }

  
  /**
   **/
  public ProductBuildInfoSpace layers(List<ProductBuildInfo> layers) {
    this.layers = layers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Layers")
  public List<ProductBuildInfo> getLayers() {
    return layers;
  }
  public void setLayers(List<ProductBuildInfo> layers) {
    this.layers = layers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBuildInfoSpace productBuildInfoSpace = (ProductBuildInfoSpace) o;
    return Objects.equals(this.id, productBuildInfoSpace.id) &&
        Objects.equals(this.description, productBuildInfoSpace.description) &&
        Objects.equals(this.index, productBuildInfoSpace.index) &&
        Objects.equals(this.defaultRotation, productBuildInfoSpace.defaultRotation) &&
        Objects.equals(this.layers, productBuildInfoSpace.layers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, index, defaultRotation, layers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBuildInfoSpace {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    defaultRotation: ").append(toIndentedString(defaultRotation)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
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


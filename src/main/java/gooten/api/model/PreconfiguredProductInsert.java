package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.PreconfiguredItem;
import gooten.api.model.PreconfiguredProductImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class PreconfiguredProductInsert   {
  
  private String sku = null;
  private String name = null;
  private String description = null;
  private Long price = null;
  private List<PreconfiguredItem> items = new ArrayList<PreconfiguredItem>();
  private List<PreconfiguredProductImage> images = new ArrayList<PreconfiguredProductImage>();

  
  /**
   * A sku that uniquely identifies the preconfigured product.
   **/
  public PreconfiguredProductInsert sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A sku that uniquely identifies the preconfigured product.")
  @JsonProperty("Sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  public PreconfiguredProductInsert name(String name) {
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
  public PreconfiguredProductInsert description(String description) {
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
   * Optional price.
   **/
  public PreconfiguredProductInsert price(Long price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Optional price.")
  @JsonProperty("Price")
  public Long getPrice() {
    return price;
  }
  public void setPrice(Long price) {
    this.price = price;
  }

  
  /**
   * The item[s] that constitue the product.
   **/
  public PreconfiguredProductInsert items(List<PreconfiguredItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The item[s] that constitue the product.")
  @JsonProperty("Items")
  public List<PreconfiguredItem> getItems() {
    return items;
  }
  public void setItems(List<PreconfiguredItem> items) {
    this.items = items;
  }

  
  /**
   * Product images. Can contain large and small images for web, mobile, etc
   **/
  public PreconfiguredProductInsert images(List<PreconfiguredProductImage> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Product images. Can contain large and small images for web, mobile, etc")
  @JsonProperty("Images")
  public List<PreconfiguredProductImage> getImages() {
    return images;
  }
  public void setImages(List<PreconfiguredProductImage> images) {
    this.images = images;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreconfiguredProductInsert preconfiguredProductInsert = (PreconfiguredProductInsert) o;
    return Objects.equals(this.sku, preconfiguredProductInsert.sku) &&
        Objects.equals(this.name, preconfiguredProductInsert.name) &&
        Objects.equals(this.description, preconfiguredProductInsert.description) &&
        Objects.equals(this.price, preconfiguredProductInsert.price) &&
        Objects.equals(this.items, preconfiguredProductInsert.items) &&
        Objects.equals(this.images, preconfiguredProductInsert.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, name, description, price, items, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreconfiguredProductInsert {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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




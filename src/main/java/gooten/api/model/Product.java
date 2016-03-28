package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.Category;
import gooten.api.model.ProductImage;
import gooten.api.model.ProductInfo;
import gooten.api.model.ProductPriceInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class Product   {
  
  private Long id = null;
  private String uId = null;
  private String name = null;
  private String shortDescription = null;
  private Boolean hasAvailableProductVariants = null;
  private Boolean hasProductTemplates = null;
  private Long featuredIndex = null;
  private Long maxZoom = null;
  private ProductPriceInfo retailPrice = null;
  private List<ProductInfo> info = new ArrayList<ProductInfo>();
  private List<ProductImage> productImage = new ArrayList<ProductImage>();
  private ProductPriceInfo priceInfo = null;
  private ProductPriceInfo partnerPriceInfo = null;
  private List<Category> categories = new ArrayList<Category>();

  
  /**
   * The product type id. Represents a type/class of products. Can later be passed into the productvariant service to get available product variations.
   **/
  public Product id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The product type id. Represents a type/class of products. Can later be passed into the productvariant service to get available product variations.")
  @JsonProperty("Id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * An id that syncs between printio's staging and live environments.
   **/
  public Product uId(String uId) {
    this.uId = uId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An id that syncs between printio's staging and live environments.")
  @JsonProperty("UId")
  public String getUId() {
    return uId;
  }
  public void setUId(String uId) {
    this.uId = uId;
  }

  
  /**
   **/
  public Product name(String name) {
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
  public Product shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShortDescription")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  
  /**
   * Whether or not the item returned is a Product, or ProductVariant. Items with a Sku will not have other product variants
   **/
  public Product hasAvailableProductVariants(Boolean hasAvailableProductVariants) {
    this.hasAvailableProductVariants = hasAvailableProductVariants;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the item returned is a Product, or ProductVariant. Items with a Sku will not have other product variants")
  @JsonProperty("HasAvailableProductVariants")
  public Boolean getHasAvailableProductVariants() {
    return hasAvailableProductVariants;
  }
  public void setHasAvailableProductVariants(Boolean hasAvailableProductVariants) {
    this.hasAvailableProductVariants = hasAvailableProductVariants;
  }

  
  /**
   * Whether or not the product has variants with templates.
   **/
  public Product hasProductTemplates(Boolean hasProductTemplates) {
    this.hasProductTemplates = hasProductTemplates;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not the product has variants with templates.")
  @JsonProperty("HasProductTemplates")
  public Boolean getHasProductTemplates() {
    return hasProductTemplates;
  }
  public void setHasProductTemplates(Boolean hasProductTemplates) {
    this.hasProductTemplates = hasProductTemplates;
  }

  
  /**
   * A value to sort featured items by. Note that this is null if IsFeatured=false
   **/
  public Product featuredIndex(Long featuredIndex) {
    this.featuredIndex = featuredIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A value to sort featured items by. Note that this is null if IsFeatured=false")
  @JsonProperty("FeaturedIndex")
  public Long getFeaturedIndex() {
    return featuredIndex;
  }
  public void setFeaturedIndex(Long featuredIndex) {
    this.featuredIndex = featuredIndex;
  }

  
  /**
   **/
  public Product maxZoom(Long maxZoom) {
    this.maxZoom = maxZoom;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("MaxZoom")
  public Long getMaxZoom() {
    return maxZoom;
  }
  public void setMaxZoom(Long maxZoom) {
    this.maxZoom = maxZoom;
  }

  
  /**
   **/
  public Product retailPrice(ProductPriceInfo retailPrice) {
    this.retailPrice = retailPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("RetailPrice")
  public ProductPriceInfo getRetailPrice() {
    return retailPrice;
  }
  public void setRetailPrice(ProductPriceInfo retailPrice) {
    this.retailPrice = retailPrice;
  }

  
  /**
   * Content describing the product.
   **/
  public Product info(List<ProductInfo> info) {
    this.info = info;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Content describing the product.")
  @JsonProperty("Info")
  public List<ProductInfo> getInfo() {
    return info;
  }
  public void setInfo(List<ProductInfo> info) {
    this.info = info;
  }

  
  /**
   * Product images. Note that this contains large and small images for web, mobile, etc
   **/
  public Product productImage(List<ProductImage> productImage) {
    this.productImage = productImage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Product images. Note that this contains large and small images for web, mobile, etc")
  @JsonProperty("ProductImage")
  public List<ProductImage> getProductImage() {
    return productImage;
  }
  public void setProductImage(List<ProductImage> productImage) {
    this.productImage = productImage;
  }

  
  /**
   **/
  public Product priceInfo(ProductPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("PriceInfo")
  public ProductPriceInfo getPriceInfo() {
    return priceInfo;
  }
  public void setPriceInfo(ProductPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
  }

  
  /**
   **/
  public Product partnerPriceInfo(ProductPriceInfo partnerPriceInfo) {
    this.partnerPriceInfo = partnerPriceInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PartnerPriceInfo")
  public ProductPriceInfo getPartnerPriceInfo() {
    return partnerPriceInfo;
  }
  public void setPartnerPriceInfo(ProductPriceInfo partnerPriceInfo) {
    this.partnerPriceInfo = partnerPriceInfo;
  }

  
  /**
   **/
  public Product categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Categories")
  public List<Category> getCategories() {
    return categories;
  }
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.uId, product.uId) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.shortDescription, product.shortDescription) &&
        Objects.equals(this.hasAvailableProductVariants, product.hasAvailableProductVariants) &&
        Objects.equals(this.hasProductTemplates, product.hasProductTemplates) &&
        Objects.equals(this.featuredIndex, product.featuredIndex) &&
        Objects.equals(this.maxZoom, product.maxZoom) &&
        Objects.equals(this.retailPrice, product.retailPrice) &&
        Objects.equals(this.info, product.info) &&
        Objects.equals(this.productImage, product.productImage) &&
        Objects.equals(this.priceInfo, product.priceInfo) &&
        Objects.equals(this.partnerPriceInfo, product.partnerPriceInfo) &&
        Objects.equals(this.categories, product.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uId, name, shortDescription, hasAvailableProductVariants, hasProductTemplates, featuredIndex, maxZoom, retailPrice, info, productImage, priceInfo, partnerPriceInfo, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uId: ").append(toIndentedString(uId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    hasAvailableProductVariants: ").append(toIndentedString(hasAvailableProductVariants)).append("\n");
    sb.append("    hasProductTemplates: ").append(toIndentedString(hasProductTemplates)).append("\n");
    sb.append("    featuredIndex: ").append(toIndentedString(featuredIndex)).append("\n");
    sb.append("    maxZoom: ").append(toIndentedString(maxZoom)).append("\n");
    sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    priceInfo: ").append(toIndentedString(priceInfo)).append("\n");
    sb.append("    partnerPriceInfo: ").append(toIndentedString(partnerPriceInfo)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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


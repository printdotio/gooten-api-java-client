package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.Meta;
import gooten.api.model.ProductPriceInfo;
import gooten.api.model.Shipment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class PostSubmittedItem   {
  
  private String sku = null;
  private Long productId = null;
  private String product = null;
  private Long quantity = null;
  private String status = null;
  private String trackingNumber = null;
  private String trackingUrl = null;
  private String shipCarrierName = null;
  private ProductPriceInfo price = null;
  private ProductPriceInfo discountAmount = null;
  private String sourceId = null;
  private Meta meta = null;
  private List<Shipment> shipments = new ArrayList<Shipment>();

  
  /**
   **/
  public PostSubmittedItem sku(String sku) {
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
  public PostSubmittedItem productId(Long productId) {
    this.productId = productId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ProductId")
  public Long getProductId() {
    return productId;
  }
  public void setProductId(Long productId) {
    this.productId = productId;
  }

  
  /**
   * The type of product that was bought
   **/
  public PostSubmittedItem product(String product) {
    this.product = product;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of product that was bought")
  @JsonProperty("Product")
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }

  
  /**
   **/
  public PostSubmittedItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Quantity")
  public Long getQuantity() {
    return quantity;
  }
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  
  /**
   **/
  public PostSubmittedItem status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Deprecated. Use the Shipments array as this will be removed in a future release.
   **/
  public PostSubmittedItem trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Deprecated. Use the Shipments array as this will be removed in a future release.")
  @JsonProperty("TrackingNumber")
  public String getTrackingNumber() {
    return trackingNumber;
  }
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  
  /**
   * Deprecated. Use the Shipments array as this will be removed in a future release.
   **/
  public PostSubmittedItem trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Deprecated. Use the Shipments array as this will be removed in a future release.")
  @JsonProperty("TrackingUrl")
  public String getTrackingUrl() {
    return trackingUrl;
  }
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  
  /**
   * Deprecated. Use the Shipments array as this will be removed in a future release.
   **/
  public PostSubmittedItem shipCarrierName(String shipCarrierName) {
    this.shipCarrierName = shipCarrierName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Deprecated. Use the Shipments array as this will be removed in a future release.")
  @JsonProperty("ShipCarrierName")
  public String getShipCarrierName() {
    return shipCarrierName;
  }
  public void setShipCarrierName(String shipCarrierName) {
    this.shipCarrierName = shipCarrierName;
  }

  
  /**
   **/
  public PostSubmittedItem price(ProductPriceInfo price) {
    this.price = price;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Price")
  public ProductPriceInfo getPrice() {
    return price;
  }
  public void setPrice(ProductPriceInfo price) {
    this.price = price;
  }

  
  /**
   **/
  public PostSubmittedItem discountAmount(ProductPriceInfo discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("DiscountAmount")
  public ProductPriceInfo getDiscountAmount() {
    return discountAmount;
  }
  public void setDiscountAmount(ProductPriceInfo discountAmount) {
    this.discountAmount = discountAmount;
  }

  
  /**
   * Partner's internal ID-- entirely optional
   **/
  public PostSubmittedItem sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Partner's internal ID-- entirely optional")
  @JsonProperty("SourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * An optional Map<string,string> of misc properties.
   **/
  public PostSubmittedItem meta(Meta meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An optional Map<string,string> of misc properties.")
  @JsonProperty("Meta")
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  
  /**
   **/
  public PostSubmittedItem shipments(List<Shipment> shipments) {
    this.shipments = shipments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Shipments")
  public List<Shipment> getShipments() {
    return shipments;
  }
  public void setShipments(List<Shipment> shipments) {
    this.shipments = shipments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSubmittedItem postSubmittedItem = (PostSubmittedItem) o;
    return Objects.equals(this.sku, postSubmittedItem.sku) &&
        Objects.equals(this.productId, postSubmittedItem.productId) &&
        Objects.equals(this.product, postSubmittedItem.product) &&
        Objects.equals(this.quantity, postSubmittedItem.quantity) &&
        Objects.equals(this.status, postSubmittedItem.status) &&
        Objects.equals(this.trackingNumber, postSubmittedItem.trackingNumber) &&
        Objects.equals(this.trackingUrl, postSubmittedItem.trackingUrl) &&
        Objects.equals(this.shipCarrierName, postSubmittedItem.shipCarrierName) &&
        Objects.equals(this.price, postSubmittedItem.price) &&
        Objects.equals(this.discountAmount, postSubmittedItem.discountAmount) &&
        Objects.equals(this.sourceId, postSubmittedItem.sourceId) &&
        Objects.equals(this.meta, postSubmittedItem.meta) &&
        Objects.equals(this.shipments, postSubmittedItem.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, productId, product, quantity, status, trackingNumber, trackingUrl, shipCarrierName, price, discountAmount, sourceId, meta, shipments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSubmittedItem {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    shipCarrierName: ").append(toIndentedString(shipCarrierName)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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


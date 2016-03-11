package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Meta;
import io.swagger.client.model.PostSubmittedItem;
import io.swagger.client.model.ProductPriceInfo;
import io.swagger.client.model.ShipToAddress;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class PostSubmittedOrder   {
  
  private String id = null;
  private String niceId = null;
  private String souceId = null;
  private List<PostSubmittedItem> items = new ArrayList<PostSubmittedItem>();
  private ProductPriceInfo total = null;
  private ProductPriceInfo shippingTotal = null;
  private ProductPriceInfo discountAmount = null;
  private String discountCode = null;
  private ShipToAddress billingAddress = null;
  private ShipToAddress shippingAddress = null;
  private Meta meta = null;

  
  /**
   * The unique ID we use within our system.
   **/
  public PostSubmittedOrder id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique ID we use within our system.")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * A short, non-unique ID that is optionally used for customer service.
   **/
  public PostSubmittedOrder niceId(String niceId) {
    this.niceId = niceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A short, non-unique ID that is optionally used for customer service.")
  @JsonProperty("NiceId")
  public String getNiceId() {
    return niceId;
  }
  public void setNiceId(String niceId) {
    this.niceId = niceId;
  }

  
  /**
   * Partner's internal ID-- entirely optional
   **/
  public PostSubmittedOrder souceId(String souceId) {
    this.souceId = souceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Partner's internal ID-- entirely optional")
  @JsonProperty("SouceId")
  public String getSouceId() {
    return souceId;
  }
  public void setSouceId(String souceId) {
    this.souceId = souceId;
  }

  
  /**
   **/
  public PostSubmittedOrder items(List<PostSubmittedItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Items")
  public List<PostSubmittedItem> getItems() {
    return items;
  }
  public void setItems(List<PostSubmittedItem> items) {
    this.items = items;
  }

  
  /**
   **/
  public PostSubmittedOrder total(ProductPriceInfo total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Total")
  public ProductPriceInfo getTotal() {
    return total;
  }
  public void setTotal(ProductPriceInfo total) {
    this.total = total;
  }

  
  /**
   **/
  public PostSubmittedOrder shippingTotal(ProductPriceInfo shippingTotal) {
    this.shippingTotal = shippingTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShippingTotal")
  public ProductPriceInfo getShippingTotal() {
    return shippingTotal;
  }
  public void setShippingTotal(ProductPriceInfo shippingTotal) {
    this.shippingTotal = shippingTotal;
  }

  
  /**
   **/
  public PostSubmittedOrder discountAmount(ProductPriceInfo discountAmount) {
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
   **/
  public PostSubmittedOrder discountCode(String discountCode) {
    this.discountCode = discountCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("DiscountCode")
  public String getDiscountCode() {
    return discountCode;
  }
  public void setDiscountCode(String discountCode) {
    this.discountCode = discountCode;
  }

  
  /**
   **/
  public PostSubmittedOrder billingAddress(ShipToAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("BillingAddress")
  public ShipToAddress getBillingAddress() {
    return billingAddress;
  }
  public void setBillingAddress(ShipToAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  /**
   **/
  public PostSubmittedOrder shippingAddress(ShipToAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShippingAddress")
  public ShipToAddress getShippingAddress() {
    return shippingAddress;
  }
  public void setShippingAddress(ShipToAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  /**
   * An optional Map<string,string> of misc properties.
   **/
  public PostSubmittedOrder meta(Meta meta) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSubmittedOrder postSubmittedOrder = (PostSubmittedOrder) o;
    return Objects.equals(this.id, postSubmittedOrder.id) &&
        Objects.equals(this.niceId, postSubmittedOrder.niceId) &&
        Objects.equals(this.souceId, postSubmittedOrder.souceId) &&
        Objects.equals(this.items, postSubmittedOrder.items) &&
        Objects.equals(this.total, postSubmittedOrder.total) &&
        Objects.equals(this.shippingTotal, postSubmittedOrder.shippingTotal) &&
        Objects.equals(this.discountAmount, postSubmittedOrder.discountAmount) &&
        Objects.equals(this.discountCode, postSubmittedOrder.discountCode) &&
        Objects.equals(this.billingAddress, postSubmittedOrder.billingAddress) &&
        Objects.equals(this.shippingAddress, postSubmittedOrder.shippingAddress) &&
        Objects.equals(this.meta, postSubmittedOrder.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, niceId, souceId, items, total, shippingTotal, discountAmount, discountCode, billingAddress, shippingAddress, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSubmittedOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    niceId: ").append(toIndentedString(niceId)).append("\n");
    sb.append("    souceId: ").append(toIndentedString(souceId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    shippingTotal: ").append(toIndentedString(shippingTotal)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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


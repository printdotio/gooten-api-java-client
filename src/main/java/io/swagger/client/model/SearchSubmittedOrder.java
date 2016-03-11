package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Meta;
import io.swagger.client.model.PostSubmittedItem;
import io.swagger.client.model.ProductPriceInfo;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class SearchSubmittedOrder   {
  
  private String id = null;
  private String niceId = null;
  private String sourceId = null;
  private List<PostSubmittedItem> items = new ArrayList<PostSubmittedItem>();
  private ProductPriceInfo total = null;
  private ProductPriceInfo shippingTotal = null;
  private String discountCode = null;
  private ProductPriceInfo discountAmount = null;
  private Meta meta = null;

  
  /**
   **/
  public SearchSubmittedOrder id(String id) {
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
  public SearchSubmittedOrder niceId(String niceId) {
    this.niceId = niceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("NiceId")
  public String getNiceId() {
    return niceId;
  }
  public void setNiceId(String niceId) {
    this.niceId = niceId;
  }

  
  /**
   * Clients can submit an ID they use for the order here.
   **/
  public SearchSubmittedOrder sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Clients can submit an ID they use for the order here.")
  @JsonProperty("SourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   **/
  public SearchSubmittedOrder items(List<PostSubmittedItem> items) {
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
  public SearchSubmittedOrder total(ProductPriceInfo total) {
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
  public SearchSubmittedOrder shippingTotal(ProductPriceInfo shippingTotal) {
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
  public SearchSubmittedOrder discountCode(String discountCode) {
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
  public SearchSubmittedOrder discountAmount(ProductPriceInfo discountAmount) {
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
   * An optional Map<string,string> of misc properties.
   **/
  public SearchSubmittedOrder meta(Meta meta) {
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
    SearchSubmittedOrder searchSubmittedOrder = (SearchSubmittedOrder) o;
    return Objects.equals(this.id, searchSubmittedOrder.id) &&
        Objects.equals(this.niceId, searchSubmittedOrder.niceId) &&
        Objects.equals(this.sourceId, searchSubmittedOrder.sourceId) &&
        Objects.equals(this.items, searchSubmittedOrder.items) &&
        Objects.equals(this.total, searchSubmittedOrder.total) &&
        Objects.equals(this.shippingTotal, searchSubmittedOrder.shippingTotal) &&
        Objects.equals(this.discountCode, searchSubmittedOrder.discountCode) &&
        Objects.equals(this.discountAmount, searchSubmittedOrder.discountAmount) &&
        Objects.equals(this.meta, searchSubmittedOrder.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, niceId, sourceId, items, total, shippingTotal, discountCode, discountAmount, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSubmittedOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    niceId: ").append(toIndentedString(niceId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    shippingTotal: ").append(toIndentedString(shippingTotal)).append("\n");
    sb.append("    discountCode: ").append(toIndentedString(discountCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
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


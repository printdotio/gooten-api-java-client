package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.Meta;
import gooten.api.model.OrderPayment;
import gooten.api.model.PostOrderItem;
import gooten.api.model.ShipToAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class PostOrder   {
  
  private ShipToAddress shipToAddress = null;
  private ShipToAddress billingAddress = null;
  private List<PostOrderItem> items = new ArrayList<PostOrderItem>();
  private OrderPayment payment = null;
  private String sourceId = null;
  private Boolean isPreSubmit = null;
  private String couponCode = null;
  private Meta meta = null;

  
  /**
   **/
  public PostOrder shipToAddress(ShipToAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ShipToAddress")
  public ShipToAddress getShipToAddress() {
    return shipToAddress;
  }
  public void setShipToAddress(ShipToAddress shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  
  /**
   **/
  public PostOrder billingAddress(ShipToAddress billingAddress) {
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
  public PostOrder items(List<PostOrderItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Items")
  public List<PostOrderItem> getItems() {
    return items;
  }
  public void setItems(List<PostOrderItem> items) {
    this.items = items;
  }

  
  /**
   **/
  public PostOrder payment(OrderPayment payment) {
    this.payment = payment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Payment")
  public OrderPayment getPayment() {
    return payment;
  }
  public void setPayment(OrderPayment payment) {
    this.payment = payment;
  }

  
  /**
   * Clients can submit an ID they use for the order here.
   **/
  public PostOrder sourceId(String sourceId) {
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
   * Submit the order into PrePayment status.
   **/
  public PostOrder isPreSubmit(Boolean isPreSubmit) {
    this.isPreSubmit = isPreSubmit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Submit the order into PrePayment status.")
  @JsonProperty("IsPreSubmit")
  public Boolean getIsPreSubmit() {
    return isPreSubmit;
  }
  public void setIsPreSubmit(Boolean isPreSubmit) {
    this.isPreSubmit = isPreSubmit;
  }

  
  /**
   **/
  public PostOrder couponCode(String couponCode) {
    this.couponCode = couponCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CouponCode")
  public String getCouponCode() {
    return couponCode;
  }
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  
  /**
   * An optional Map<string,string> of misc properties.
   **/
  public PostOrder meta(Meta meta) {
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
    PostOrder postOrder = (PostOrder) o;
    return Objects.equals(this.shipToAddress, postOrder.shipToAddress) &&
        Objects.equals(this.billingAddress, postOrder.billingAddress) &&
        Objects.equals(this.items, postOrder.items) &&
        Objects.equals(this.payment, postOrder.payment) &&
        Objects.equals(this.sourceId, postOrder.sourceId) &&
        Objects.equals(this.isPreSubmit, postOrder.isPreSubmit) &&
        Objects.equals(this.couponCode, postOrder.couponCode) &&
        Objects.equals(this.meta, postOrder.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipToAddress, billingAddress, items, payment, sourceId, isPreSubmit, couponCode, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOrder {\n");
    
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    isPreSubmit: ").append(toIndentedString(isPreSubmit)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
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




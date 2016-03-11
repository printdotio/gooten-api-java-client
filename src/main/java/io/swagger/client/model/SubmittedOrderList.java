package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SearchSubmittedOrder;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class SubmittedOrderList   {
  
  private List<SearchSubmittedOrder> orders = new ArrayList<SearchSubmittedOrder>();
  private Long totalPages = null;
  private Long page = null;
  private Boolean hadError = null;

  
  /**
   **/
  public SubmittedOrderList orders(List<SearchSubmittedOrder> orders) {
    this.orders = orders;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Orders")
  public List<SearchSubmittedOrder> getOrders() {
    return orders;
  }
  public void setOrders(List<SearchSubmittedOrder> orders) {
    this.orders = orders;
  }

  
  /**
   **/
  public SubmittedOrderList totalPages(Long totalPages) {
    this.totalPages = totalPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("TotalPages")
  public Long getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }

  
  /**
   **/
  public SubmittedOrderList page(Long page) {
    this.page = page;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Page")
  public Long getPage() {
    return page;
  }
  public void setPage(Long page) {
    this.page = page;
  }

  
  /**
   **/
  public SubmittedOrderList hadError(Boolean hadError) {
    this.hadError = hadError;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("HadError")
  public Boolean getHadError() {
    return hadError;
  }
  public void setHadError(Boolean hadError) {
    this.hadError = hadError;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmittedOrderList submittedOrderList = (SubmittedOrderList) o;
    return Objects.equals(this.orders, submittedOrderList.orders) &&
        Objects.equals(this.totalPages, submittedOrderList.totalPages) &&
        Objects.equals(this.page, submittedOrderList.page) &&
        Objects.equals(this.hadError, submittedOrderList.hadError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders, totalPages, page, hadError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmittedOrderList {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    hadError: ").append(toIndentedString(hadError)).append("\n");
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


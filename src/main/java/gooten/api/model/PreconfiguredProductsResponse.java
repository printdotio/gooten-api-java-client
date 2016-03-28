package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.PreconfiguredProduct;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class PreconfiguredProductsResponse   {
  
  private List<PreconfiguredProduct> preconfiguredProducts = new ArrayList<PreconfiguredProduct>();

  
  /**
   **/
  public PreconfiguredProductsResponse preconfiguredProducts(List<PreconfiguredProduct> preconfiguredProducts) {
    this.preconfiguredProducts = preconfiguredProducts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("PreconfiguredProducts")
  public List<PreconfiguredProduct> getPreconfiguredProducts() {
    return preconfiguredProducts;
  }
  public void setPreconfiguredProducts(List<PreconfiguredProduct> preconfiguredProducts) {
    this.preconfiguredProducts = preconfiguredProducts;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreconfiguredProductsResponse preconfiguredProductsResponse = (PreconfiguredProductsResponse) o;
    return Objects.equals(this.preconfiguredProducts, preconfiguredProductsResponse.preconfiguredProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconfiguredProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreconfiguredProductsResponse {\n");
    
    sb.append("    preconfiguredProducts: ").append(toIndentedString(preconfiguredProducts)).append("\n");
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




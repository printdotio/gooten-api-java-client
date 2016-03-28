package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ProductOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class ProductOptionList   {
  
  private String name = null;
  private List<ProductOption> values = new ArrayList<ProductOption>();

  
  /**
   **/
  public ProductOptionList name(String name) {
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
  public ProductOptionList values(List<ProductOption> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Values")
  public List<ProductOption> getValues() {
    return values;
  }
  public void setValues(List<ProductOption> values) {
    this.values = values;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOptionList productOptionList = (ProductOptionList) o;
    return Objects.equals(this.name, productOptionList.name) &&
        Objects.equals(this.values, productOptionList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOptionList {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


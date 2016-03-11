package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.KeyValuePair;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class LanguageDictionary   {
  
  private String category = null;
  private List<KeyValuePair> values = new ArrayList<KeyValuePair>();

  
  /**
   **/
  public LanguageDictionary category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   **/
  public LanguageDictionary values(List<KeyValuePair> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("values")
  public List<KeyValuePair> getValues() {
    return values;
  }
  public void setValues(List<KeyValuePair> values) {
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
    LanguageDictionary languageDictionary = (LanguageDictionary) o;
    return Objects.equals(this.category, languageDictionary.category) &&
        Objects.equals(this.values, languageDictionary.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageDictionary {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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


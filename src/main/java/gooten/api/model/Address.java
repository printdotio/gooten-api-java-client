package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class Address   {
  
  private String city = null;
  private String countryCode = null;
  private String postalCode = null;
  private String stateOrProvinceCode = null;
  private List<String> streetLines = new ArrayList<String>();

  
  /**
   **/
  public Address city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("City")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CountryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   **/
  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("PostalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   **/
  public Address stateOrProvinceCode(String stateOrProvinceCode) {
    this.stateOrProvinceCode = stateOrProvinceCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("StateOrProvinceCode")
  public String getStateOrProvinceCode() {
    return stateOrProvinceCode;
  }
  public void setStateOrProvinceCode(String stateOrProvinceCode) {
    this.stateOrProvinceCode = stateOrProvinceCode;
  }

  
  /**
   **/
  public Address streetLines(List<String> streetLines) {
    this.streetLines = streetLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("StreetLines")
  public List<String> getStreetLines() {
    return streetLines;
  }
  public void setStreetLines(List<String> streetLines) {
    this.streetLines = streetLines;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.city, address.city) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.stateOrProvinceCode, address.stateOrProvinceCode) &&
        Objects.equals(this.streetLines, address.streetLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, countryCode, postalCode, stateOrProvinceCode, streetLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvinceCode: ").append(toIndentedString(stateOrProvinceCode)).append("\n");
    sb.append("    streetLines: ").append(toIndentedString(streetLines)).append("\n");
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


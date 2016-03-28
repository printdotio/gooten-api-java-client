package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class ShipToAddress   {
  
  private String firstName = null;
  private String lastName = null;
  private String line1 = null;
  private String line2 = null;
  private String city = null;
  private String state = null;
  private String countryCode = null;
  private String postalCode = null;
  private Boolean isBusinessAddress = null;
  private String phone = null;
  private String email = null;

  
  /**
   **/
  public ShipToAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("FirstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  public ShipToAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("LastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  public ShipToAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Line1")
  public String getLine1() {
    return line1;
  }
  public void setLine1(String line1) {
    this.line1 = line1;
  }

  
  /**
   **/
  public ShipToAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Line2")
  public String getLine2() {
    return line2;
  }
  public void setLine2(String line2) {
    this.line2 = line2;
  }

  
  /**
   **/
  public ShipToAddress city(String city) {
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
  public ShipToAddress state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("State")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  public ShipToAddress countryCode(String countryCode) {
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
  public ShipToAddress postalCode(String postalCode) {
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
  public ShipToAddress isBusinessAddress(Boolean isBusinessAddress) {
    this.isBusinessAddress = isBusinessAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("IsBusinessAddress")
  public Boolean getIsBusinessAddress() {
    return isBusinessAddress;
  }
  public void setIsBusinessAddress(Boolean isBusinessAddress) {
    this.isBusinessAddress = isBusinessAddress;
  }

  
  /**
   **/
  public ShipToAddress phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  public ShipToAddress email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipToAddress shipToAddress = (ShipToAddress) o;
    return Objects.equals(this.firstName, shipToAddress.firstName) &&
        Objects.equals(this.lastName, shipToAddress.lastName) &&
        Objects.equals(this.line1, shipToAddress.line1) &&
        Objects.equals(this.line2, shipToAddress.line2) &&
        Objects.equals(this.city, shipToAddress.city) &&
        Objects.equals(this.state, shipToAddress.state) &&
        Objects.equals(this.countryCode, shipToAddress.countryCode) &&
        Objects.equals(this.postalCode, shipToAddress.postalCode) &&
        Objects.equals(this.isBusinessAddress, shipToAddress.isBusinessAddress) &&
        Objects.equals(this.phone, shipToAddress.phone) &&
        Objects.equals(this.email, shipToAddress.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, line1, line2, city, state, countryCode, postalCode, isBusinessAddress, phone, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipToAddress {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    isBusinessAddress: ").append(toIndentedString(isBusinessAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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




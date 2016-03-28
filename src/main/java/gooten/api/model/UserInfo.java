package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class UserInfo   {
  
  private String languageCode = null;
  private String countryCode = null;
  private String countryName = null;
  private String currencyName = null;
  private String currencyCode = null;
  private String currencyFormat = null;

  
  /**
   **/
  public UserInfo languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("LanguageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   **/
  public UserInfo countryCode(String countryCode) {
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
  public UserInfo countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CountryName")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  
  /**
   **/
  public UserInfo currencyName(String currencyName) {
    this.currencyName = currencyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CurrencyName")
  public String getCurrencyName() {
    return currencyName;
  }
  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  
  /**
   **/
  public UserInfo currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CurrencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  /**
   **/
  public UserInfo currencyFormat(String currencyFormat) {
    this.currencyFormat = currencyFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("CurrencyFormat")
  public String getCurrencyFormat() {
    return currencyFormat;
  }
  public void setCurrencyFormat(String currencyFormat) {
    this.currencyFormat = currencyFormat;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.languageCode, userInfo.languageCode) &&
        Objects.equals(this.countryCode, userInfo.countryCode) &&
        Objects.equals(this.countryName, userInfo.countryName) &&
        Objects.equals(this.currencyName, userInfo.currencyName) &&
        Objects.equals(this.currencyCode, userInfo.currencyCode) &&
        Objects.equals(this.currencyFormat, userInfo.currencyFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, countryCode, countryName, currencyName, currencyCode, currencyFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyFormat: ").append(toIndentedString(currencyFormat)).append("\n");
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




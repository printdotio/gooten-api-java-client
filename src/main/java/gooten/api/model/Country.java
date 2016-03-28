package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class Country   {
  
  private String name = null;
  private String code = null;
  private Boolean isSupported = null;
  private String measurementCode = null;
  private String flagUrl = null;
  private Currency defaultCurrency = null;

  
  /**
   **/
  public Country name(String name) {
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
  public Country code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  public Country isSupported(Boolean isSupported) {
    this.isSupported = isSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("IsSupported")
  public Boolean getIsSupported() {
    return isSupported;
  }
  public void setIsSupported(Boolean isSupported) {
    this.isSupported = isSupported;
  }

  
  /**
   **/
  public Country measurementCode(String measurementCode) {
    this.measurementCode = measurementCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("MeasurementCode")
  public String getMeasurementCode() {
    return measurementCode;
  }
  public void setMeasurementCode(String measurementCode) {
    this.measurementCode = measurementCode;
  }

  
  /**
   **/
  public Country flagUrl(String flagUrl) {
    this.flagUrl = flagUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("FlagUrl")
  public String getFlagUrl() {
    return flagUrl;
  }
  public void setFlagUrl(String flagUrl) {
    this.flagUrl = flagUrl;
  }

  
  /**
   **/
  public Country defaultCurrency(Currency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("DefaultCurrency")
  public Currency getDefaultCurrency() {
    return defaultCurrency;
  }
  public void setDefaultCurrency(Currency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(this.name, country.name) &&
        Objects.equals(this.code, country.code) &&
        Objects.equals(this.isSupported, country.isSupported) &&
        Objects.equals(this.measurementCode, country.measurementCode) &&
        Objects.equals(this.flagUrl, country.flagUrl) &&
        Objects.equals(this.defaultCurrency, country.defaultCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, isSupported, measurementCode, flagUrl, defaultCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isSupported: ").append(toIndentedString(isSupported)).append("\n");
    sb.append("    measurementCode: ").append(toIndentedString(measurementCode)).append("\n");
    sb.append("    flagUrl: ").append(toIndentedString(flagUrl)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
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


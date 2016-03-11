package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ValidationFailure   {
  
  private String propertyName = null;
  private String errorMessage = null;
  private String attemptedValue = null;

  
  /**
   **/
  public ValidationFailure propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("PropertyName")
  public String getPropertyName() {
    return propertyName;
  }
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  
  /**
   **/
  public ValidationFailure errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ErrorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  /**
   **/
  public ValidationFailure attemptedValue(String attemptedValue) {
    this.attemptedValue = attemptedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("AttemptedValue")
  public String getAttemptedValue() {
    return attemptedValue;
  }
  public void setAttemptedValue(String attemptedValue) {
    this.attemptedValue = attemptedValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationFailure validationFailure = (ValidationFailure) o;
    return Objects.equals(this.propertyName, validationFailure.propertyName) &&
        Objects.equals(this.errorMessage, validationFailure.errorMessage) &&
        Objects.equals(this.attemptedValue, validationFailure.attemptedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, errorMessage, attemptedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationFailure {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    attemptedValue: ").append(toIndentedString(attemptedValue)).append("\n");
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


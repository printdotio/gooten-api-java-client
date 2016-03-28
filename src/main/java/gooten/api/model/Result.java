package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class Result   {
  
  private Boolean isValid = null;
  private String reason = null;
  private Long score = null;
  private Address proposedAddress = null;

  
  /**
   **/
  public Result isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("IsValid")
  public Boolean getIsValid() {
    return isValid;
  }
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  
  /**
   **/
  public Result reason(String reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   **/
  public Result score(Long score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Score")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }

  
  /**
   **/
  public Result proposedAddress(Address proposedAddress) {
    this.proposedAddress = proposedAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ProposedAddress")
  public Address getProposedAddress() {
    return proposedAddress;
  }
  public void setProposedAddress(Address proposedAddress) {
    this.proposedAddress = proposedAddress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.isValid, result.isValid) &&
        Objects.equals(this.reason, result.reason) &&
        Objects.equals(this.score, result.score) &&
        Objects.equals(this.proposedAddress, result.proposedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, reason, score, proposedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    proposedAddress: ").append(toIndentedString(proposedAddress)).append("\n");
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


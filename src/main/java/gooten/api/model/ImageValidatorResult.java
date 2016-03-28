package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ValidationFailure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class ImageValidatorResult   {
  
  private Boolean hadError = null;
  private List<ValidationFailure> issues = new ArrayList<ValidationFailure>();

  
  /**
   **/
  public ImageValidatorResult hadError(Boolean hadError) {
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

  
  /**
   **/
  public ImageValidatorResult issues(List<ValidationFailure> issues) {
    this.issues = issues;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Issues")
  public List<ValidationFailure> getIssues() {
    return issues;
  }
  public void setIssues(List<ValidationFailure> issues) {
    this.issues = issues;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageValidatorResult imageValidatorResult = (ImageValidatorResult) o;
    return Objects.equals(this.hadError, imageValidatorResult.hadError) &&
        Objects.equals(this.issues, imageValidatorResult.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hadError, issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageValidatorResult {\n");
    
    sb.append("    hadError: ").append(toIndentedString(hadError)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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




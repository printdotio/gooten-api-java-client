package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class Preconfiguration   {
  
  private String spaceId = null;
  private String url = null;

  
  /**
   * Required only for multi-image items. The ID of the space where an image is to be placed. One can attain the SpaceId via inspecting the template data.
   **/
  public Preconfiguration spaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Required only for multi-image items. The ID of the space where an image is to be placed. One can attain the SpaceId via inspecting the template data.")
  @JsonProperty("SpaceId")
  public String getSpaceId() {
    return spaceId;
  }
  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  
  /**
   * The url of the image to be placed in the referenced layer.
   **/
  public Preconfiguration url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The url of the image to be placed in the referenced layer.")
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preconfiguration preconfiguration = (Preconfiguration) o;
    return Objects.equals(this.spaceId, preconfiguration.spaceId) &&
        Objects.equals(this.url, preconfiguration.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preconfiguration {\n");
    
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class Image   {
  
  private String url = null;
  private Long index = null;
  private String thumbnailUrl = null;
  private String manipCommand = null;
  private String spaceId = null;

  
  /**
   **/
  public Image url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public Image index(Long index) {
    this.index = index;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Index")
  public Long getIndex() {
    return index;
  }
  public void setIndex(Long index) {
    this.index = index;
  }

  
  /**
   **/
  public Image thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ThumbnailUrl")
  public String getThumbnailUrl() {
    return thumbnailUrl;
  }
  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  
  /**
   **/
  public Image manipCommand(String manipCommand) {
    this.manipCommand = manipCommand;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ManipCommand")
  public String getManipCommand() {
    return manipCommand;
  }
  public void setManipCommand(String manipCommand) {
    this.manipCommand = manipCommand;
  }

  
  /**
   **/
  public Image spaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("SpaceId")
  public String getSpaceId() {
    return spaceId;
  }
  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.url, image.url) &&
        Objects.equals(this.index, image.index) &&
        Objects.equals(this.thumbnailUrl, image.thumbnailUrl) &&
        Objects.equals(this.manipCommand, image.manipCommand) &&
        Objects.equals(this.spaceId, image.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, index, thumbnailUrl, manipCommand, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    manipCommand: ").append(toIndentedString(manipCommand)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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


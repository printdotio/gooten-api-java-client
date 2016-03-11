package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-11T15:39:31.676Z")
public class ImageSizeVm   {
  
  private String spaceId = null;
  private Long width = null;
  private Long height = null;

  
  /**
   **/
  public ImageSizeVm spaceId(String spaceId) {
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

  
  /**
   **/
  public ImageSizeVm width(Long width) {
    this.width = width;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Width")
  public Long getWidth() {
    return width;
  }
  public void setWidth(Long width) {
    this.width = width;
  }

  
  /**
   **/
  public ImageSizeVm height(Long height) {
    this.height = height;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Height")
  public Long getHeight() {
    return height;
  }
  public void setHeight(Long height) {
    this.height = height;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSizeVm imageSizeVm = (ImageSizeVm) o;
    return Objects.equals(this.spaceId, imageSizeVm.spaceId) &&
        Objects.equals(this.width, imageSizeVm.width) &&
        Objects.equals(this.height, imageSizeVm.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spaceId, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSizeVm {\n");
    
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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


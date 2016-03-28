package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import gooten.api.model.ImageSizeVm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T15:29:28.016Z")
public class ImageValidationVm   {
  
  private String sku = null;
  private List<ImageSizeVm> images = new ArrayList<ImageSizeVm>();

  
  /**
   **/
  public ImageValidationVm sku(String sku) {
    this.sku = sku;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   **/
  public ImageValidationVm images(List<ImageSizeVm> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Images")
  public List<ImageSizeVm> getImages() {
    return images;
  }
  public void setImages(List<ImageSizeVm> images) {
    this.images = images;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageValidationVm imageValidationVm = (ImageValidationVm) o;
    return Objects.equals(this.sku, imageValidationVm.sku) &&
        Objects.equals(this.images, imageValidationVm.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageValidationVm {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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


package gooten.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;







@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-28T14:18:01.102+03:00")
public class ProductBuildInfo   {
  
  private String id = null;
  private String description = null;
  private String type = null;
  private Long zIndex = null;
  private Long x1 = null;
  private Long x2 = null;
  private Long y1 = null;
  private Long y2 = null;
  private String color = null;
  private String backgroundImageUrl = null;
  private String overlayImageUrl = null;
  private String fontName = null;
  private String fontSize = null;
  private String fontHAlignment = null;
  private String fontVAlighment = null;
  private String defaultText = null;

  
  /**
   **/
  public ProductBuildInfo id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ProductBuildInfo description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public ProductBuildInfo type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public ProductBuildInfo zIndex(Long zIndex) {
    this.zIndex = zIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ZIndex")
  public Long getZIndex() {
    return zIndex;
  }
  public void setZIndex(Long zIndex) {
    this.zIndex = zIndex;
  }

  
  /**
   **/
  public ProductBuildInfo x1(Long x1) {
    this.x1 = x1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("X1")
  public Long getX1() {
    return x1;
  }
  public void setX1(Long x1) {
    this.x1 = x1;
  }

  
  /**
   **/
  public ProductBuildInfo x2(Long x2) {
    this.x2 = x2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("X2")
  public Long getX2() {
    return x2;
  }
  public void setX2(Long x2) {
    this.x2 = x2;
  }

  
  /**
   **/
  public ProductBuildInfo y1(Long y1) {
    this.y1 = y1;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Y1")
  public Long getY1() {
    return y1;
  }
  public void setY1(Long y1) {
    this.y1 = y1;
  }

  
  /**
   **/
  public ProductBuildInfo y2(Long y2) {
    this.y2 = y2;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Y2")
  public Long getY2() {
    return y2;
  }
  public void setY2(Long y2) {
    this.y2 = y2;
  }

  
  /**
   **/
  public ProductBuildInfo color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("Color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   **/
  public ProductBuildInfo backgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("BackgroundImageUrl")
  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }
  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }

  
  /**
   **/
  public ProductBuildInfo overlayImageUrl(String overlayImageUrl) {
    this.overlayImageUrl = overlayImageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("OverlayImageUrl")
  public String getOverlayImageUrl() {
    return overlayImageUrl;
  }
  public void setOverlayImageUrl(String overlayImageUrl) {
    this.overlayImageUrl = overlayImageUrl;
  }

  
  /**
   **/
  public ProductBuildInfo fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("FontName")
  public String getFontName() {
    return fontName;
  }
  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  
  /**
   **/
  public ProductBuildInfo fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("FontSize")
  public String getFontSize() {
    return fontSize;
  }
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  
  /**
   **/
  public ProductBuildInfo fontHAlignment(String fontHAlignment) {
    this.fontHAlignment = fontHAlignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("FontHAlignment")
  public String getFontHAlignment() {
    return fontHAlignment;
  }
  public void setFontHAlignment(String fontHAlignment) {
    this.fontHAlignment = fontHAlignment;
  }

  
  /**
   **/
  public ProductBuildInfo fontVAlighment(String fontVAlighment) {
    this.fontVAlighment = fontVAlighment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("FontVAlighment")
  public String getFontVAlighment() {
    return fontVAlighment;
  }
  public void setFontVAlighment(String fontVAlighment) {
    this.fontVAlighment = fontVAlighment;
  }

  
  /**
   **/
  public ProductBuildInfo defaultText(String defaultText) {
    this.defaultText = defaultText;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("DefaultText")
  public String getDefaultText() {
    return defaultText;
  }
  public void setDefaultText(String defaultText) {
    this.defaultText = defaultText;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductBuildInfo productBuildInfo = (ProductBuildInfo) o;
    return Objects.equals(this.id, productBuildInfo.id) &&
        Objects.equals(this.description, productBuildInfo.description) &&
        Objects.equals(this.type, productBuildInfo.type) &&
        Objects.equals(this.zIndex, productBuildInfo.zIndex) &&
        Objects.equals(this.x1, productBuildInfo.x1) &&
        Objects.equals(this.x2, productBuildInfo.x2) &&
        Objects.equals(this.y1, productBuildInfo.y1) &&
        Objects.equals(this.y2, productBuildInfo.y2) &&
        Objects.equals(this.color, productBuildInfo.color) &&
        Objects.equals(this.backgroundImageUrl, productBuildInfo.backgroundImageUrl) &&
        Objects.equals(this.overlayImageUrl, productBuildInfo.overlayImageUrl) &&
        Objects.equals(this.fontName, productBuildInfo.fontName) &&
        Objects.equals(this.fontSize, productBuildInfo.fontSize) &&
        Objects.equals(this.fontHAlignment, productBuildInfo.fontHAlignment) &&
        Objects.equals(this.fontVAlighment, productBuildInfo.fontVAlighment) &&
        Objects.equals(this.defaultText, productBuildInfo.defaultText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, type, zIndex, x1, x2, y1, y2, color, backgroundImageUrl, overlayImageUrl, fontName, fontSize, fontHAlignment, fontVAlighment, defaultText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductBuildInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    zIndex: ").append(toIndentedString(zIndex)).append("\n");
    sb.append("    x1: ").append(toIndentedString(x1)).append("\n");
    sb.append("    x2: ").append(toIndentedString(x2)).append("\n");
    sb.append("    y1: ").append(toIndentedString(y1)).append("\n");
    sb.append("    y2: ").append(toIndentedString(y2)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    backgroundImageUrl: ").append(toIndentedString(backgroundImageUrl)).append("\n");
    sb.append("    overlayImageUrl: ").append(toIndentedString(overlayImageUrl)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontHAlignment: ").append(toIndentedString(fontHAlignment)).append("\n");
    sb.append("    fontVAlighment: ").append(toIndentedString(fontVAlighment)).append("\n");
    sb.append("    defaultText: ").append(toIndentedString(defaultText)).append("\n");
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




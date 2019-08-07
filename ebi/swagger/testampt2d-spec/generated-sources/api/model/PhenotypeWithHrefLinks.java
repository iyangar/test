package org.ebi.metadata.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhenotypeWithHrefLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-07T15:04:26.811+01:00[Europe/London]")

public class PhenotypeWithHrefLinks   {
  @JsonProperty("href")
  private String href;

  @JsonProperty("rel")
  private String rel;

  @JsonProperty("templated")
  private Boolean templated;

  public PhenotypeWithHrefLinks href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  */
  @ApiModelProperty(value = "")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PhenotypeWithHrefLinks rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Get rel
   * @return rel
  */
  @ApiModelProperty(value = "")


  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public PhenotypeWithHrefLinks templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

  /**
   * Get templated
   * @return templated
  */
  @ApiModelProperty(value = "")


  public Boolean getTemplated() {
    return templated;
  }

  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhenotypeWithHrefLinks phenotypeWithHrefLinks = (PhenotypeWithHrefLinks) o;
    return Objects.equals(this.href, phenotypeWithHrefLinks.href) &&
        Objects.equals(this.rel, phenotypeWithHrefLinks.rel) &&
        Objects.equals(this.templated, phenotypeWithHrefLinks.templated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel, templated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhenotypeWithHrefLinks {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
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


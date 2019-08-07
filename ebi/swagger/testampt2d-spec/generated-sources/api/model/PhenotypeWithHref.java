package org.ebi.metadata.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.ebi.metadata.api.model.PhenotypeWithHrefLinks;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhenotypeWithHref
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-07T15:04:26.811+01:00[Europe/London]")

public class PhenotypeWithHref   {
  @JsonProperty("links")
  @Valid
  private List<PhenotypeWithHrefLinks> links = null;

  @JsonProperty("id")
  private String id;

  /**
   * Gets or Sets phenotypeGroup
   */
  public enum PhenotypeGroupEnum {
    ANTHROPOMETRIC("ANTHROPOMETRIC"),
    
    CARDIOVASCULAR("CARDIOVASCULAR"),
    
    GLYCEMIC("GLYCEMIC");

    private String value;

    PhenotypeGroupEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PhenotypeGroupEnum fromValue(String text) {
      for (PhenotypeGroupEnum b : PhenotypeGroupEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("phenotypeGroup")
  private PhenotypeGroupEnum phenotypeGroup;

  @JsonProperty("description")
  private String description;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DICHOTOMOUS("DICHOTOMOUS"),
    
    MULTICHOTOMOUS("MULTICHOTOMOUS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("allowedValues")
  private String allowedValues;

  public PhenotypeWithHref links(List<PhenotypeWithHrefLinks> links) {
    this.links = links;
    return this;
  }

  public PhenotypeWithHref addLinksItem(PhenotypeWithHrefLinks linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<PhenotypeWithHrefLinks>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<PhenotypeWithHrefLinks> getLinks() {
    return links;
  }

  public void setLinks(List<PhenotypeWithHrefLinks> links) {
    this.links = links;
  }

  public PhenotypeWithHref id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PhenotypeWithHref phenotypeGroup(PhenotypeGroupEnum phenotypeGroup) {
    this.phenotypeGroup = phenotypeGroup;
    return this;
  }

  /**
   * Get phenotypeGroup
   * @return phenotypeGroup
  */
  @ApiModelProperty(value = "")


  public PhenotypeGroupEnum getPhenotypeGroup() {
    return phenotypeGroup;
  }

  public void setPhenotypeGroup(PhenotypeGroupEnum phenotypeGroup) {
    this.phenotypeGroup = phenotypeGroup;
  }

  public PhenotypeWithHref description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PhenotypeWithHref type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PhenotypeWithHref allowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * Get allowedValues
   * @return allowedValues
  */
  @ApiModelProperty(value = "")


  public String getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhenotypeWithHref phenotypeWithHref = (PhenotypeWithHref) o;
    return Objects.equals(this.links, phenotypeWithHref.links) &&
        Objects.equals(this.id, phenotypeWithHref.id) &&
        Objects.equals(this.phenotypeGroup, phenotypeWithHref.phenotypeGroup) &&
        Objects.equals(this.description, phenotypeWithHref.description) &&
        Objects.equals(this.type, phenotypeWithHref.type) &&
        Objects.equals(this.allowedValues, phenotypeWithHref.allowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, phenotypeGroup, description, type, allowedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhenotypeWithHref {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phenotypeGroup: ").append(toIndentedString(phenotypeGroup)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
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


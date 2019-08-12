package org.ebi.metadata.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

import java.util.Objects;

/**
 * Phenotype
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-11T18:02:07.294+01:00[Europe/London]")

public class Phenotype extends ResourceSupport {
  @JsonProperty("phid")
  private String phid;

  /**
   * phenotype group
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
   * description of phenotype
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

  public Phenotype phid(String phid) {
    this.phid = phid;
    return this;
  }

  /**
   * generated phid of phenotype
   * @return phid
  */
  @ApiModelProperty(value = "generated phid of phenotype")


  public String getPhid() {
    return phid;
  }

  public void setPhid(String phid) {
    this.phid = phid;
  }

  public Phenotype phenotypeGroup(PhenotypeGroupEnum phenotypeGroup) {
    this.phenotypeGroup = phenotypeGroup;
    return this;
  }

  /**
   * phenotype group
   * @return phenotypeGroup
  */
  @ApiModelProperty(value = "phenotype group")


  public PhenotypeGroupEnum getPhenotypeGroup() {
    return phenotypeGroup;
  }

  public void setPhenotypeGroup(PhenotypeGroupEnum phenotypeGroup) {
    this.phenotypeGroup = phenotypeGroup;
  }

  public Phenotype description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of phenotype
   * @return description
  */
  @ApiModelProperty(value = "description of phenotype")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Phenotype type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * description of phenotype
   * @return type
  */
  @ApiModelProperty(value = "description of phenotype")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Phenotype allowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  /**
   * allowed values of phenotype
   * @return allowedValues
  */
  @ApiModelProperty(value = "allowed values of phenotype")


  public String getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phenotype phenotype = (Phenotype) o;
    return Objects.equals(this.phid, phenotype.phid) &&
        Objects.equals(this.phenotypeGroup, phenotype.phenotypeGroup) &&
        Objects.equals(this.description, phenotype.description) &&
        Objects.equals(this.type, phenotype.type) &&
        Objects.equals(this.allowedValues, phenotype.allowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phid, phenotypeGroup, description, type, allowedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phenotype {\n");

    sb.append("    phid: ").append(toIndentedString(phid)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


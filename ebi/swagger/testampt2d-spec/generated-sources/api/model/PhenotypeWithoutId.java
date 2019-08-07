package org.ebi.metadata.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhenotypeWithoutId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-07T15:04:26.811+01:00[Europe/London]")

public class PhenotypeWithoutId   {
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

  public PhenotypeWithoutId phenotypeGroup(PhenotypeGroupEnum phenotypeGroup) {
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

  public PhenotypeWithoutId description(String description) {
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

  public PhenotypeWithoutId type(TypeEnum type) {
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

  public PhenotypeWithoutId allowedValues(String allowedValues) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhenotypeWithoutId phenotypeWithoutId = (PhenotypeWithoutId) o;
    return Objects.equals(this.phenotypeGroup, phenotypeWithoutId.phenotypeGroup) &&
        Objects.equals(this.description, phenotypeWithoutId.description) &&
        Objects.equals(this.type, phenotypeWithoutId.type) &&
        Objects.equals(this.allowedValues, phenotypeWithoutId.allowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phenotypeGroup, description, type, allowedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhenotypeWithoutId {\n");
    
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


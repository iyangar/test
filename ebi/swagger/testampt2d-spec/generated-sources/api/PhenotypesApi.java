/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.ebi.metadata.api;

import org.ebi.metadata.api.model.Phenotype;
import org.ebi.metadata.api.model.PhenotypeWithoutId;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-11T23:43:46.465+01:00[Europe/London]")

@Validated
@Api(value = "phenotypes", description = "the phenotypes API")
public interface PhenotypesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "find all phenotypes.", nickname = "getPhenotypeEntity", notes = "Get all phenotypes of Type2Diabetes.", response = Phenotype.class, tags={ "Phenotype Entity", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, Successful response", response = Phenotype.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/phenotypes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Phenotype> getPhenotypeEntity(@ApiParam(value = "Number of pages.") @Valid @RequestParam(value = "page", required = false) String page,@ApiParam(value = "size of page.") @Valid @RequestParam(value = "size", required = false) String size,@ApiParam(value = "Ascending or descending.") @Valid @RequestParam(value = "sort", required = false) String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"phenotypeGroup\" : \"ANTHROPOMETRIC\",  \"allowedValues\" : \"allowedValues\",  \"phid\" : \"phid\",  \"description\" : \"description\",  \"type\" : \"DICHOTOMOUS\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "save phenotype.", nickname = "postPhenotypeEntity", notes = "Store a phenotype of Type2Diabetes.", response = Phenotype.class, tags={ "Phenotype Entity", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK, Successful response", response = Phenotype.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/phenotypes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Phenotype> postPhenotypeEntity(@ApiParam(value = ""  )  @Valid @RequestBody PhenotypeWithoutId phenotypeWithoutId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"phenotypeGroup\" : \"ANTHROPOMETRIC\",  \"allowedValues\" : \"allowedValues\",  \"phid\" : \"phid\",  \"description\" : \"description\",  \"type\" : \"DICHOTOMOUS\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

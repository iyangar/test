package org.ebi.metadata.rest;

import org.ebi.metadata.api.PhenotypesApi;
import org.ebi.metadata.api.model.Phenotype;
import org.ebi.metadata.api.model.PhenotypeWithoutId;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhenotypesRestController implements PhenotypesApi {

    public ResponseEntity<Phenotype> getPhenotypeEntity(String page, String size, String sort) {
        Phenotype phenotype = new Phenotype();
        phenotype.setType(Phenotype.TypeEnum.DICHOTOMOUS);
        phenotype.setPhid("1");
        phenotype.setPhenotypeGroup(Phenotype.PhenotypeGroupEnum.ANTHROPOMETRIC);
        phenotype.setDescription("Evaluation phenotype");
        phenotype.setAllowedValues("All allowed values");

        Link link = ControllerLinkBuilder
                .linkTo(PhenotypesRestController.class)
                .slash(phenotype.getPhid())
                .withSelfRel();
        phenotype.add(link);
        return ResponseEntity.ok(phenotype);
    }

    public ResponseEntity<Phenotype> postPhenotypeEntity(PhenotypeWithoutId phenotypeWithoutId) {
        Phenotype phenotype = new Phenotype();
        phenotype.setType(Phenotype.TypeEnum.values()[phenotypeWithoutId.getType().ordinal()]);
        phenotype.setPhid("3");
        phenotype.setPhenotypeGroup(Phenotype.PhenotypeGroupEnum.values()[phenotypeWithoutId.getPhenotypeGroup().ordinal()]);
        phenotype.setDescription(phenotypeWithoutId.getDescription());
        phenotype.setAllowedValues(phenotypeWithoutId.getAllowedValues());

        Link link = ControllerLinkBuilder
                .linkTo(PhenotypesRestController.class)
                .slash(phenotype.getPhid())
                .withSelfRel();
        phenotype.add(link);
        return ResponseEntity.ok(phenotype);
    }
}

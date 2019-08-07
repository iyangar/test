package org.ebi.metadata.rest;

import org.ebi.metadata.api.PhenotypesApi;
import org.ebi.metadata.api.model.Phenotype;
import org.ebi.metadata.api.model.PhenotypeWithHref;
import org.ebi.metadata.api.model.PhenotypeWithHrefLinks;
import org.ebi.metadata.api.model.PhenotypeWithoutId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PhenotypesRestController implements PhenotypesApi {

    public ResponseEntity<Phenotype> getPhenotypeEntity(String page, String size, String sort) {
        Phenotype phenotype = new Phenotype();
        phenotype.setType(Phenotype.TypeEnum.DICHOTOMOUS);
        phenotype.setId("1");
        phenotype.setPhenotypeGroup(Phenotype.PhenotypeGroupEnum.ANTHROPOMETRIC);
        phenotype.setDescription("Evaluation phenotype");
        phenotype.setAllowedValues("All allowed values");
        return ResponseEntity.ok(phenotype);
    }

    public ResponseEntity<PhenotypeWithHref> postPhenotypeEntity(PhenotypeWithoutId phenotypeWithoutId) {
        PhenotypeWithHref phenotypeWithHref = new PhenotypeWithHref();
        phenotypeWithHref.setType(PhenotypeWithHref.TypeEnum.values()[phenotypeWithoutId.getType().ordinal()]);
        phenotypeWithHref.setId("2");
        phenotypeWithHref.setPhenotypeGroup(PhenotypeWithHref.PhenotypeGroupEnum.values()[phenotypeWithoutId.getPhenotypeGroup().ordinal()]);
        phenotypeWithHref.setDescription(phenotypeWithoutId.getDescription());
        phenotypeWithHref.setAllowedValues(phenotypeWithoutId.getAllowedValues());

        ArrayList<PhenotypeWithHrefLinks> phenotypeWithHrefLinksList = new ArrayList<>();
        PhenotypeWithHrefLinks phenotypeWithHrefLinks = new PhenotypeWithHrefLinks();
        phenotypeWithHrefLinks.setHref("http://localhost:8080/phenotypes/1");
        phenotypeWithHrefLinks.setTemplated(true);
        phenotypeWithHrefLinks.setRel("Release");
        phenotypeWithHrefLinksList.add(phenotypeWithHrefLinks);
        phenotypeWithHref.setLinks(phenotypeWithHrefLinksList);
        return ResponseEntity.ok(phenotypeWithHref);
    }
}

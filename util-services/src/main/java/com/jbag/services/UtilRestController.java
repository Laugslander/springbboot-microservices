package com.jbag.services;

import com.jbag.services.dao.DocumentRepository;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jbag.services.dao.DossierRepository;
import com.jbag.services.model.Dossier;

@RestController
@Log
public class UtilRestController {

    private DocumentRepository documentRepository;

    private DossierRepository dossierRepository;

    public UtilRestController(DossierRepository dossierRepository, DocumentRepository documentRepository) {
        this.dossierRepository = dossierRepository;
        this.documentRepository = documentRepository;
    }

    @PostMapping(value = "/storeInDatabase", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dossier> generateNewDossierId(@RequestBody Dossier _dossier) {
        log.info("POST request to store dossier" + _dossier);
        Dossier dossier = Dossier.builder()
                .id(_dossier.getId())
                .color(_dossier.getColor())
                .name(_dossier.getId() + " " + _dossier.getColor())
                .build();
        dossierRepository.save(dossier);
        log.info("DossierId with " + dossier.toString());
        return new ResponseEntity<>(dossier, HttpStatus.CREATED);
    }
}

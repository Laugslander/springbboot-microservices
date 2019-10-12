package com.jbag.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Log4j2
@RestController
public class DossierRestController {

    private final ColorFactory colorFactory;

    public DossierRestController(ColorFactory colorFactory) {
        this.colorFactory = colorFactory;
    }

    @GetMapping(value = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dossier> generateNewDossierId() {
        log.info("Get request to generate new dossierId");
        Random random = new Random();
        Dossier dossier = Dossier.builder()
                .dossierId(Integer.toString(random.nextInt()))
                .color(colorFactory.getColor())
                .build();
        log.info("DossierId with {}", dossier);
        return new ResponseEntity<>(dossier, HttpStatus.CREATED);
    }
}

package com.jbag.services.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@Builder
public class Dossier {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String color;

    @OneToMany
    private List<Document> documents;

}

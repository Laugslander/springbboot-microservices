package com.jbag.services.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Document {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Lob
    private byte[] content;
}

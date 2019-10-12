package com.jbag.services;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Dossier {
    private String dossierId;
    private String color;
}

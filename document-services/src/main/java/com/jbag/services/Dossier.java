package com.jbag.services;

import java.util.StringJoiner;

public class Dossier {
    private String dossierId;

    public Dossier() {
    }

    public String getDossierId() {
        return dossierId;
    }

    public void setDossierId(String dossierId) {
        this.dossierId = dossierId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Dossier.class.getSimpleName() + "[", "]")
                .add("dossierId='" + dossierId + "'")
                .toString();
    }
}

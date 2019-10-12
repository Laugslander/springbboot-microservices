package com.jbag.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jbag.services.model.Dossier;

public interface DossierRepository extends JpaRepository<Dossier, Long> {
}

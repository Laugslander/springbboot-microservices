package com.jbag.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jbag.services.model.Document;

public interface DocumentRepository extends JpaRepository<Document,Long> {
}

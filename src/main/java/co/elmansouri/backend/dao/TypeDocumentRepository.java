package co.elmansouri.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.elmansouri.backend.entities.TypeDocument;

public interface TypeDocumentRepository extends JpaRepository<TypeDocument, Long> {

}

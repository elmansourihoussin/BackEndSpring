package co.elmansouri.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.elmansouri.backend.entities.Document;

public interface DocumentRepository extends JpaRepository<Document,Long>{

}

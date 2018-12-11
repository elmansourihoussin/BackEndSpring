package co.elmansouri.backend.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import co.elmansouri.backend.entities.Document;

public interface DocumentMetier {
	public Document add(Document d);
	public Document edit(Document d);
	public void delete(Document d);
	public List<Document> getAll();
	public Optional<Document> find(Long id);
	public Page<Document> listDoc(String description,String fichier);
}

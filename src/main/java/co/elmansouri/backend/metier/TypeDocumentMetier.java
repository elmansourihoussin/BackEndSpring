package co.elmansouri.backend.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import co.elmansouri.backend.entities.TypeDocument;

public interface TypeDocumentMetier {
	
	public TypeDocument add(TypeDocument t);
	public TypeDocument edit(TypeDocument t);
	public void delete(TypeDocument t);
	public List<TypeDocument> getAll();
	public TypeDocument find(Long id);
	public Page<TypeDocument> listeTypeDocument(String codeCpte, int page, int size);

}

package co.elmansouri.backend.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class TypeDocument extends TypeObjet {

	private static final long serialVersionUID = 1L;
	
	@OneToMany()
	private List<Document> documents= new ArrayList<>();
	
	//Constructor
	public TypeDocument() {
		super();
	}

	// getters and setters
	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	
	
}

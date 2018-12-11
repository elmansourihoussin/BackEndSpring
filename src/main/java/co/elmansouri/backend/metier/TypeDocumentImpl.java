package co.elmansouri.backend.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import co.elmansouri.backend.dao.TypeDocumentRepository;
import co.elmansouri.backend.entities.TypeDocument;


public class TypeDocumentImpl implements TypeDocumentMetier {
	
	@Autowired
	private TypeDocumentRepository typeDocumentpository;

	@Override
	public TypeDocument add(TypeDocument t) {
		try {
			this.typeDocumentpository.save(t);
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public TypeDocument edit(TypeDocument t) {
		try {
		 this.typeDocumentpository.save(t);
		 return t;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void delete(TypeDocument t) {
		try {
		 this.typeDocumentpository.delete(t);
		} catch (Exception e) {
		}
	}

	@Override
	public List<TypeDocument> getAll() {
		try {
		 return this.typeDocumentpository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public TypeDocument find(Long id) {
		try { 
		 return this.typeDocumentpository.getOne(id);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Page<TypeDocument> listeTypeDocument(String codeCpte, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

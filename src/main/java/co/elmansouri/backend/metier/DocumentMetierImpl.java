package co.elmansouri.backend.metier;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.elmansouri.backend.dao.DocumentRepository;
import co.elmansouri.backend.entities.Document;

@Service
@Transactional
public class DocumentMetierImpl implements DocumentMetier {

	@Autowired
	private DocumentRepository documentRepository; 
	
	Logger logger = LoggerFactory.getLogger(DocumentMetierImpl.class);

	
	@Override
	public Document add(Document d) {
		try {
			return documentRepository.save(d);
		}catch(Exception ex) {
			logger.error("Error : " + ex.getMessage());
			return null;
		}
	}

	@Override
	public Document edit(Document d) {
		try {
			return documentRepository.save(d);
		}catch(Exception ex) {
			logger.error("Error : " + ex.getMessage());
			return null;
		}
	}

	@Override
	public void delete(Document d) {
		try {
			 documentRepository.delete(d);
		}catch(Exception ex) {
			logger.error("Error : " + ex.getMessage());
		}
		
	}

	@Override
	public List<Document> getAll() {
		try {
			return documentRepository.findAll();
		}catch(Exception ex) {
			logger.error("Error : " + ex.getMessage());
			return null;
		}
	}

	@Override
	public Optional<Document> find(Long id) {
		try {
			return documentRepository.findById(id);
		}catch(Exception ex) {
			logger.error("Error : " + ex.getMessage());
			return null;
		}
	}

	@Override
	public Page<Document> listDoc(String description, String fichier) {
		return null;
	}

}

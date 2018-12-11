package co.elmansouri.backend.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.elmansouri.backend.entities.Document;
import co.elmansouri.backend.metier.DocumentMetier;

@RestController
// * pour Les Test !!
@CrossOrigin(origins = "*")
public class DocumentService {

	@Autowired
	private DocumentMetier documentM;

	public DocumentService() {
		super();
	}
	
	/**
	 * Get All Documents
	 * @return list Documents
	 */
	@GetMapping("/documents")
	public List<Document> getAll(){
		return documentM.getAll();
	}
	
	/**
	 * Add Document
	 * @param d
	 * @return Document
	 */
	@PostMapping("/documents")
	public Document add(@Valid @RequestBody Document d) {
		return documentM.add(d);
	}
	
	/**
	 * Get Document By Id
	 * @param id
	 * @return
	 */
	@GetMapping("/documents/{id}")
	public Optional<Document> getById(@PathVariable(value="id") Long id) {
		return documentM.find(id);
	}
	
	/**
	 * Edit Document
	 * @param d
	 * @return Document
	 */
	@PutMapping("/documents")
	public Document edit(@Valid @RequestBody Document d) {
		return documentM.edit(d);
	}
	
	/**
	 * Delete Document
	 * @param d
	 */
	@DeleteMapping("/documents")
	public void delete(@Valid @RequestBody Document d) {
		documentM.delete(d);
	}
}

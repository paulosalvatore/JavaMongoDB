package br.com.fiap.notepad.repository;

import br.com.fiap.notepad.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotaRepository extends MongoRepository<Nota, String> {
	List<Nota> findByTitulo(String titulo);
}

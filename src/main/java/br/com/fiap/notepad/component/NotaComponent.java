package br.com.fiap.notepad.component;

import br.com.fiap.notepad.model.Nota;
import br.com.fiap.notepad.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotaComponent {
	@Autowired
	NotaRepository notaRepository;

	public void salvar(Nota nota) {
		List<Nota> notas = notaRepository.findByTitulo(nota.getTitulo());

		if (notas.size() > 0) {
			nota.setId(notas.get(0).getId());
		}

		notaRepository.save(nota);
	}

	public List<Nota> buscarPor(String titulo) {
		return notaRepository.findByTitulo(titulo);
	}

	public List<Nota> buscarTodos() {
		return notaRepository.findAll();
	}
}

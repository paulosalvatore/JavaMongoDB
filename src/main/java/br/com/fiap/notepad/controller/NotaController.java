package br.com.fiap.notepad.controller;

import br.com.fiap.notepad.component.NotaComponent;
import br.com.fiap.notepad.model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/nota")
public class NotaController {
	@Autowired
	NotaComponent notaComponent;

	@GetMapping
	public List<Nota> buscarTodos() {
		return notaComponent.buscarTodos();
	}

	@GetMapping(value = "/{titulo}")
	public List<Nota> buscarPorTitulo(@PathVariable(value = "titulo") String titulo) {
		return notaComponent.buscarPor(titulo);
	}

	@PostMapping
	public void salvar(@RequestBody Nota nota) {
		notaComponent.salvar(nota);
	}
}

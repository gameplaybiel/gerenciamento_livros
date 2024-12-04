package com.gerenciar_livros.controller;

import com.gerenciar_livros.models.Livro;
import com.gerenciar_livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listaLivros() {
        return livroService.listaLivros();
    }

    @PostMapping
    public Livro adicionaLivro(@RequestBody Livro livro) {
        return livroService.adicionaLivro(livro);
    }

    @GetMapping("/{id}")
    public Optional<Livro> buscaLivro(@PathVariable Long id) {
        return livroService.buscaLivro(id);
    }

    @DeleteMapping("/{id}")
    public void deletaLivro(@PathVariable Long id) {
        livroService.deletaLivro(id);
    }
}

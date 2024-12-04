package com.gerenciar_livros.service;

import com.gerenciar_livros.models.Livro;
import com.gerenciar_livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listaLivros() {
        return livroRepository.findAll();
    }

    public Livro adicionaLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Optional<Livro> buscaLivro(Long id) {
        return livroRepository.findById(id);
    }

    public void deletaLivro(Long id) {
        livroRepository.deleteById(id);
    }
}

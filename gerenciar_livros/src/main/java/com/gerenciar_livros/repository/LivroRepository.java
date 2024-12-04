package com.gerenciar_livros.repository;

import com.gerenciar_livros.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}

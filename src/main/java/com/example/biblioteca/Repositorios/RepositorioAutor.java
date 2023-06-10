package com.example.biblioteca.Repositorios;

import com.example.biblioteca.Entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutor extends JpaRepository<Autor,Integer> {
}

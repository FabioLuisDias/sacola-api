package me.dio.sacola.repository;

import me.dio.sacola.model.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Conecta ao Banco de Dados
public interface SacolaRepository extends JpaRepository<Sacola, Long> { // JpaRepository traz as funcionalidades do CRUD
}

package com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estoque.models.Bebidas;

@Repository
public interface EstoqueRepository extends JpaRepository<Bebidas, String> {

}

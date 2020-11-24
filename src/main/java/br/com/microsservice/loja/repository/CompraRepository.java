package br.com.microsservice.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.microsservice.loja.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>{

}

package com.GeneUnion.LeriGo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GeneUnion.LeriGo.Model.*;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

	public List<ProdutoModel>findAllByNomeContainingIgnoreCase(String nome);

}

package com.GeneUnion.LeriGo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GeneUnion.LeriGo.Model.*;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>  {

	public List<CategoriaModel>findAllByTipoContainingIgnoreCase(String tipo);
	
}

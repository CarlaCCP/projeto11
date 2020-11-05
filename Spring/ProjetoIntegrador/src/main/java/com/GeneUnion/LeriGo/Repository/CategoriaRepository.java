package com.GeneUnion.LeriGo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GeneUnion.LeriGo.Model.CategoriaModel;


public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long>  {
	
}

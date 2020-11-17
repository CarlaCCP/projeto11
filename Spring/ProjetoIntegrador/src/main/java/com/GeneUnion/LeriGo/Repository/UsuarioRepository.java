package com.GeneUnion.LeriGo.Repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.GeneUnion.LeriGo.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{


	public List<UsuarioModel> findAllByNomeContainingIgnoreCase(String Nome);

	public  Optional<UsuarioModel> findByNome(String nome);


}

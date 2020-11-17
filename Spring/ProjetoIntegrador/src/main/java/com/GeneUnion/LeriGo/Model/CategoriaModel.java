package com.GeneUnion.LeriGo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {
	
	@Column
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@Column
	@NotNull
	private String tipo;
	
	@Column
	@NotNull
	private String destino; //doação ou 
	
	@Column
	@NotNull
	private String classificacao; //Masculino e Feminino
	
	@OneToMany(mappedBy = "categoriaModel", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoriaModel")
	private List<ProdutoModel> produtoModel;
	
	

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public List<ProdutoModel> getProdutoModel() {
		return produtoModel;
	}

	public void setProdutoModel(List<ProdutoModel> produtoModel) {
		this.produtoModel = produtoModel;
	}

	
}

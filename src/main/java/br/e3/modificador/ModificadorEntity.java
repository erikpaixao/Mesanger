package br.e3.modificador;

import javax.persistence.Entity;

import br.e3.util.BaseEntity;

@Entity
public class ModificadorEntity extends BaseEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6548085943822865072L;
	private String nome;
	private String descricao;
	private Float porcentagemModificacao;
	public ModificadorEntity() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getPorcentagemModificacao() {
		return porcentagemModificacao;
	}
	public void setPorcentagemModificacao(Float porcentagemModificacao) {
		this.porcentagemModificacao = porcentagemModificacao;
	}
	
	

}

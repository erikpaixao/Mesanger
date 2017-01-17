package br.e3.beans;

import br.e3.util.BaseEntity;

public abstract class AbstractPessoa extends BaseEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8749628083234593150L;
	private String nome;
	private String sobreNome;
	private Long id;
	
	public AbstractPessoa() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}

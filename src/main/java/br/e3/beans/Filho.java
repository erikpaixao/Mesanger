package br.e3.beans;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import br.e3.beans.util.Permissao;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Filho extends AbstractPessoa{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6323655942759291909L;
	@ManyToOne
	private Pai pai;
	@OneToOne
	private Mesada mesada;
	@Enumerated
	private Permissao permissao;
	
	public Filho() {
		super();
	}
	public Pai getPai() {
		return pai;
	}
	public void setPai(Pai pai) {
		this.pai = pai;
	}
	public Mesada getMesada() {
		return mesada;
	}
	public void setMesada(Mesada mesada) {
		this.mesada = mesada;
	}
	public Permissao getPermissao() {
		return permissao;
	}
	public void setPermissoes(Permissao permissao) {
		this.permissao = permissao;
	}
	
}

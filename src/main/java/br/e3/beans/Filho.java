package br.e3.beans;

import java.util.Collection;

import br.e3.beans.util.Permissao;

public class Filho extends AbstractPessoa{
	
	private Pai pai;
	private Mesada mesada;
	private Collection<Permissao> permissoes;
	
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
	public Collection<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(Collection<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	
}

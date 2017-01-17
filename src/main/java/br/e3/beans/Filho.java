package br.e3.beans;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import br.e3.beans.util.Permissao;
import br.e3.util.BaseEntity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Filho extends BaseEntity<Long>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6323655942759291909L;
	private String nome;
	private String sobrenome;
	private String password;
	@Email @NotNull
	private String email;
	@ManyToOne
	private Pai pai;
	@OneToOne
	private Mesada mesada;
	@Enumerated
	private Permissao permissao;
	
	public Filho() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
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

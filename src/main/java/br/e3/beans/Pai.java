package br.e3.beans;

import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import br.e3.beans.util.Permissao;
import br.e3.util.BaseEntity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Pai extends BaseEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4928804748609940544L;
	private String nome;
	private String sobrenome;
	private String password;
	@Email @NotNull
	private String email;
	@Enumerated
	private Permissao permissao;
	@OneToMany
	private Collection<Filho> filhos;

	public Pai() {
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

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	public Collection<Filho> getFilhos() {
		return filhos;
	}

	public void setFilhos(Collection<Filho> filhos) {
		this.filhos = filhos;
	}

}

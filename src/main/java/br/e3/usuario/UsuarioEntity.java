package br.e3.usuario;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.persistence.JoinColumn;

import org.hibernate.validator.constraints.Email;

import br.e3.permissao.PermissaoEntity;
import br.e3.util.BaseEntity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class UsuarioEntity extends BaseEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4928804748609940544L;
	private String nome;
	private String sobrenome;
	@Email @NotNull
	private String email;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_user_permission", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "permission_id") )
	private List<PermissaoEntity> permissoes;
	public UsuarioEntity() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<PermissaoEntity> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<PermissaoEntity> permissoes) {
		this.permissoes = permissoes;
	}
	
	
	
	
	
}
	
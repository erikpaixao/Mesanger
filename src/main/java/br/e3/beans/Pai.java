package br.e3.beans;

import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import br.e3.beans.util.Permissao;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Pai extends AbstractPessoa {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4928804748609940544L;
	@Enumerated
	private Permissao permissao;
	@OneToMany
	private Collection<Filho> filhos;
	
	public Pai() {
		super();
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

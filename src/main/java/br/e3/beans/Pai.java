package br.e3.beans;

import java.util.Collection;

import br.e3.beans.util.Permissao;

public class Pai extends AbstractPessoa {
	private Collection<Permissao> permissoes;
	private Collection<Filho> filhos;
	
	public Pai() {
		super();
	}

	public Collection<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Collection<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public Collection<Filho> getFilhos() {
		return filhos;
	}

	public void setFilhos(Collection<Filho> filhos) {
		this.filhos = filhos;
	}
	
}

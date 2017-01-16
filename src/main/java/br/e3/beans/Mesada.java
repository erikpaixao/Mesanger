package br.e3.beans;

import java.util.Collection;

import br.e3.beans.util.Modificador;

public class Mesada {
	private Long id;
	private Float valorMesada;
	private Float valorAReceber;
	private Collection<Modificador> modificadores;
	private Pai pagador;
	private Filho recebedor;
	
	public Mesada() {
		super();
	}

	public Float getValorMesada() {
		return valorMesada;
	}

	public void setValorMesada(Float valorMesada) {
		this.valorMesada = valorMesada;
	}

	public Float getValorAReceber() {
		return valorAReceber;
	}

	public void setValorAReceber(Float valorAReceber) {
		this.valorAReceber = valorAReceber;
	}

	public Collection<Modificador> getModificadores() {
		return modificadores;
	}

	public void setModificadores(Collection<Modificador> modificadores) {
		this.modificadores = modificadores;
	}

	public Pai getPagador() {
		return pagador;
	}

	public void setPagador(Pai pagador) {
		this.pagador = pagador;
	}

	public Filho getRecebedor() {
		return recebedor;
	}

	public void setRecebedor(Filho recebedor) {
		this.recebedor = recebedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	
	
}

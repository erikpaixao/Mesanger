package br.e3.beans.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.e3.beans.Mesada;

@Entity
public class Modificador {
	@Id
	@GeneratedValue
	private Long id;
	private String nomeModificador;
	private Float soma;
	private Boolean isDesconto;
	@ManyToOne
	private Mesada mesadaDoDesconto;
	
	public Modificador() {
		super();
	}
	
	public String getNomeModificador() {
		return nomeModificador;
	}
	public void setNomeModificador(String nomeModificador) {
		this.nomeModificador = nomeModificador;
	}
	public Float getSoma() {
		return soma;
	}
	public void setSoma(Float soma) {
		this.soma = soma;
	}
	public Boolean getIsDesconto() {
		return isDesconto;
	}
	public void setIsDesconto(Boolean isDesconto) {
		this.isDesconto = isDesconto;
	}
	public Mesada getMesadaDoDesconto() {
		return mesadaDoDesconto;
	}
	public void setMesadaDoDesconto(Mesada mesadaDoDesconto) {
		this.mesadaDoDesconto = mesadaDoDesconto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}

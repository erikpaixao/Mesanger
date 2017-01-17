package br.e3.beans;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.e3.beans.util.Modificador;
import br.e3.util.BaseEntity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class Mesada extends BaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1938779624453812029L;
	
	private Float valorMesada;
	private Float valorAReceber;
	@OneToMany
	private List<Modificador> modificadores;
	@OneToOne
	@JsonIgnore
	private Pai pagador;
	@OneToOne
	@JsonIgnore
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

	public List<Modificador> getModificadores() {
		return modificadores;
	}

	public void setModificadores(List<Modificador> modificadores) {
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
	
}

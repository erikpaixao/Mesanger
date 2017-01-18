package br.e3.mesada;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.e3.modificador.ModificadorEntity;
import br.e3.usuario.UsuarioEntity;
import br.e3.util.BaseEntity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "pk_id"))
public class MesadaEntity extends BaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1938779624453812029L;
	
	private Float valorInicialMesada;
	private Float valorAReceber;
	@OneToOne
	private UsuarioEntity pagador;
	@OneToOne
	private UsuarioEntity recebedor;
	@OneToMany
	private List<ModificadorEntity> modificador;
	private Date mesPagamento;
	private Date dataPagamento;
	
	public Float getValorInicialMesada() {
		return valorInicialMesada;
	}

	public void setValorInicialMesada(Float valorInicialMesada) {
		this.valorInicialMesada = valorInicialMesada;
	}

	public Float getValorAReceber() {
		return valorAReceber;
	}

	public void setValorAReceber(Float valorAReceber) {
		
		for (int i = 0; i <= modificador.size(); i++){
			if(modificador.get(i).getPorcentagemModificacao() < 0){
				this.valorAReceber = valorAReceber -= (modificador.get(i).getPorcentagemModificacao()/100);
			} else {
				this.valorAReceber = valorAReceber += (modificador.get(i).getPorcentagemModificacao()/100);
			}
			
		}
		
	}

	public UsuarioEntity getPagador() {
		return pagador;
	}

	public void setPagador(UsuarioEntity pagador) {
		this.pagador = pagador;
	}

	public UsuarioEntity getRecebedor() {
		return recebedor;
	}

	public void setRecebedor(UsuarioEntity recebedor) {
		this.recebedor = recebedor;
	}

	public List<ModificadorEntity> getModificador() {
		return modificador;
	}

	public void setModificador(List<ModificadorEntity> modificador) {
		this.modificador = modificador;
	}

	public Date getMesPagamento() {
		return mesPagamento;
	}

	public void setMesPagamento(Date mesPagamento) {
		this.mesPagamento = mesPagamento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public MesadaEntity() {
		super();
	}
		
}
	
	
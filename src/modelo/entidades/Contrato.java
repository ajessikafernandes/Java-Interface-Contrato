package modelo.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numeroContrato;
	private Date dataContrato;
	private Double valorTotalContrato;

	List<Parcelas> listParcelas = new ArrayList<>();

	public Contrato() {
	}

	public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotalContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}

	public void setListParcelas(List<Parcelas> listParcelas) {
		this.listParcelas = listParcelas;
	}

	public void addParcelas(Parcelas parcelas) {
		listParcelas.add(parcelas);
	}

	public void removeParcelas(Parcelas parcelas) {
		listParcelas.remove(parcelas);
	}
}

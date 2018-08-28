package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Double valorParcelas;
	private Date dataPgtoParcelas;
	
	public Parcelas(Double valorParcelas, Date dataPgtoParcelas) {
		this.valorParcelas = valorParcelas;
		this.dataPgtoParcelas = dataPgtoParcelas;
	}

	public Double getValorParcelas() {
		return valorParcelas;
	}

	public void setValorParcelas(Double valorParcelas) {
		this.valorParcelas = valorParcelas;
	}

	public Date getDataPgtoParcelas() {
		return dataPgtoParcelas;
	}

	public void setDataPgtoParcelas(Date dataPgtoParcelas) {
		this.dataPgtoParcelas = dataPgtoParcelas;
	}
	
	@Override
	public String toString () {
		return sdf.format(dataPgtoParcelas) + " - " + String.format("%.2f", valorParcelas);
	}
	
}

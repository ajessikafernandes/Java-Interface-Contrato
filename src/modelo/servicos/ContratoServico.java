package modelo.servicos;

import java.util.Calendar;
import java.util.Date;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class ContratoServico {

	private ServicoPgtoOnline spo;

	public ContratoServico(ServicoPgtoOnline spo) {
		this.spo = spo;
	}

	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

	public void processoContrato(Contrato contrato, Integer meses) {
		double valorBase = contrato.getValorTotalContrato() / meses;
		for (int cont = 1; cont <= meses; cont++) {
			// Aqui é implementado o metódo addMeses & a Regra do negócio
			Date data = addMeses(contrato.getDataContrato(), cont);
			double valorAtualizado = valorBase + spo.taxaPagamento(valorBase, cont);
			double valorTotal = valorAtualizado + spo.jurosMensal(valorBase);
			contrato.addParcelas(new Parcelas(valorTotal, data));
		}
	}
}

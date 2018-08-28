package modelo.servicos;

public class Paypal implements ServicoPgtoOnline {

	@Override
	public double jurosMensal(Double valor) {
		return valor * 0.01;
	}

	@Override
	public double taxaPagamento(Double valor) {
		return valor * 0.02;
	}

}

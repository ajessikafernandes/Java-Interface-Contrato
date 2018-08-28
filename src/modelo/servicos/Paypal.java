package modelo.servicos;

public class Paypal implements ServicoPgtoOnline {

	private static final double jurosSimples = 0.02;
	private static final double taxa = 0.01;

	@Override
	public double jurosMensal(double valor) {
		return valor * jurosSimples;
	}

	@Override
	public double taxaPagamento(double valor, int meses) {
		return valor * taxa * meses;
	}

}

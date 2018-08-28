package modelo.servicos;

public interface ServicoPgtoOnline {

	public double jurosMensal(double valor); // 1%

	public double taxaPagamento(double valor, int meses); // 2%

}

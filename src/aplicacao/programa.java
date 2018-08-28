package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;
import modelo.servicos.ContratoServico;
import modelo.servicos.Paypal;

public class programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do Contrato: ");
		System.out.print("Numero: ");
		int numeroContrato = ler.nextInt();
		System.out.print("Data (dd/mm/yyyy): ");
		Date dataContrato = sdf.parse(ler.next());
		System.out.print("Valor total do Contrato: ");
		Double valorTotalContrato = ler.nextDouble();

		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorTotalContrato);

		System.out.print("Informe o número de parcelas: ");
		int n = ler.nextInt();

		ContratoServico contratoServico = new ContratoServico(new Paypal());

		contratoServico.processoContrato(contrato, n);

		System.out.println("Parcelas: ");
		for (Parcelas lista : contrato.getListParcelas()) {
			System.out.println(lista);
		}

		ler.close();

	}

}

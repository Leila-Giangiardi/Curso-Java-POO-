package model.services;

import java.time.Duration;

import model.entities.AlugelCarro;
import model.entities.Fatura;

public class ServicoAluguel {

	private Double precoPorDia;
	private Double precoPorHora;
	
	private ServicoImpostoBrasil ServicoImposto;

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, ServicoImpostoBrasil ServicoImposto ) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.ServicoImposto = ServicoImposto;
	}
	
	public void processInvoice(AlugelCarro alugelCarro) {
		
		double minutos = Duration.between(alugelCarro.getStart(), alugelCarro.getFinish()).toMinutes();		
		double horas = minutos / 60.0;
		
		double basicPayment;
		if (horas <= 12.0) {
			basicPayment = precoPorHora * Math.ceil(horas);
		}
		else {
			basicPayment = precoPorDia * Math.ceil(horas / 24);
		}

		double tax = ImpostoServico.tax(basicPayment);

		alugelCarro.setInvoice(new Fatura(basicPayment, tax));
	}
}
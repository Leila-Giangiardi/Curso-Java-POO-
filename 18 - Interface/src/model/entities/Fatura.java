package model.entities;

public class Fatura {

	private Double pagamentoBasico;
	private Double imposto;
	
	public Fatura() {
	}

	public Fatura(Double basicPayment, Double imposto) {
		this.pagamentoBasico = basicPayment;
		this.imposto = imposto;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getimposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double getTotalPagamento() {
		return getPagamentoBasico() + getimposto();
	}
}
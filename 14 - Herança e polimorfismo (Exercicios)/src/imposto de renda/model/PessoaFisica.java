package model;

public class PessoaFisica extends Contribuinte {
	private double gastosSaude;	

	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {
		double impostoBasico;
		if (getRendaAnual() < 20000.00) {
			impostoBasico = getRendaAnual()*0.15;		
			}
		else {
			impostoBasico = getRendaAnual()*0.25;
		}
		impostoBasico = impostoBasico - getRendaAnual()* 0.5;
		
		//para não dar imposto negativo
		if (impostoBasico < 0.0) {
			return 0.0;
		}
		return impostoBasico;
	}

}

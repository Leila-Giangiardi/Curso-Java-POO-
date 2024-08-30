package model;

public class PessoaJuridica extends Contribuinte {
	private int numFuncionarios;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double calcularImposto() {
		double impostoBasico;
		if (numFuncionarios > 10) {
			impostoBasico = getRendaAnual()*0.14;
		}
		else {
			impostoBasico = getRendaAnual()*0.16;
		}
		return impostoBasico;
	}
}

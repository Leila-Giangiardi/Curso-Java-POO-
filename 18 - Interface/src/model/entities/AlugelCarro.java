package model.entities;

import java.time.LocalDateTime;

public class AlugelCarro {

	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AlugelCarro() {
	}

	public AlugelCarro(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
		this.start = start;
		this.finish = finish;
		this.veiculo = veiculo;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Veiculo getVehicle() {
		return veiculo;
	}

	public void setVehicle(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getInvoice() {
		return fatura;
	}

	public void setInvoice(Fatura fatura) {
		this.fatura = fatura;
	}
}
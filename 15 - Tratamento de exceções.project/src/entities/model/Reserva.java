package entities.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.model.DomainException;

public class Reserva {

	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("A data de check-out deve ser posterior à data de check-in.");
		}
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuartor() {
		return numeroQuarto;
	}

	public void setNumeroQuartor(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duracao() {
		long diff = checkOut.getTime() - checkIn.getTime(); //direfença em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //converte para dias
	}

	public String atualizarData(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new  DomainException("Erro na reserva: As datas de reserva para atualização devem ser datas futuras");
		}
		if (!checkOut.after(checkIn)) {
			throw new  DomainException("Erro na reserva: A data de check-out deve ser posterior à data de check-in");
		}
		//se não entrar nos erros, vai atualizar as data
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null; //se não deu erro, vai retornar nulo
	}

	@Override
	public String toString() {
		return "Quarto " 
	+ numeroQuarto 
	+ ", check-in: " 
	+ sdf.format(checkIn) 
	+ ", check-out: " 
	+ sdf.format(checkOut)
				+ ", " + duracao() + " noites";
	}
}
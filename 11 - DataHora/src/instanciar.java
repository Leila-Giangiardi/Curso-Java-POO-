import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanciar {
	
	public static void main(String[] args) {
		
	/*
	 documentação classe de formatdata
	 * https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/time/format/DateTimeFormatter.html
	*/
		//instanciar uma data com formato personalizado
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		LocalDate d4 = LocalDate.parse("2024-08-28");
		LocalDateTime d5 = LocalDateTime.parse("2024-08-28T01:30:26");
		Instant d6 = Instant.parse("2024-08-28T01:30:26Z");		
		Instant d7 = Instant.parse("2024-08-28T01:30:26-03:00");
		
		LocalDate d8 = LocalDate.parse("27/08/2024", f1);
		LocalDateTime d9 = LocalDateTime.parse("27/08/2024 01:30", f2);
	
		LocalDate d10 = LocalDate.of(2024, 8, 29);
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 29, 1, 30);
		
		System.out.println("d1 = "+d1);
		System.out.println("d2= "+d2);	
		System.out.println("d3= "+d3);
		System.out.println("d4= "+d4);
		System.out.println("d5= "+d5);
		System.out.println("d6= "+d6);
		System.out.println("d7= "+d7);
		System.out.println("d8= "+d8);
		System.out.println("d9= "+d9);
		System.out.println("d10= "+d10);
		System.out.println("d11= "+d11);
		
	}

}

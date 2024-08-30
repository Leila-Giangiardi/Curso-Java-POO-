package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangule;

public class Program {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Triangule x, y;
	x = new Triangule();
	y = new Triangule();
	
	System.out.println("Enter the measures of triangle X: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	
	System.out.println("Enter the measures of triangle Y: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	double areaX = x.area();
	double areaY = y.area();
	
	System.out.printf("Triangle X area: %.4f%n", areaX);
	System.out.printf("Triangle Y area: %.4f%n", areaY);
	
	sc.close();
	}
}
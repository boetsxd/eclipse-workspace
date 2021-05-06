package exercise1;

import java.util.Scanner;
import java.util.Locale;
public class one_dot_four {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int funcionario = sc.nextInt();
		double horas = sc.nextDouble();
		double vrhora = sc.nextDouble();
		
		double salario = vrhora * horas;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$%.2f\n", salario);
		
		sc.close();
	}

}

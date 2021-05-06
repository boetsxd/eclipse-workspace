package exercise1;

import java.util.Scanner;
import java.util.Locale;

public class one_dot_two {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pi = 3.14159;
		
		double area = pi * (raio*raio);
		
		System.out.printf("A= %.4f\n", area);
		sc.close();
	}
		
}

package exercise1;

import java.util.Locale;
import java.util.Scanner;
public class one_dot_five {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double vr1, vr2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		vr1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		vr2 = sc.nextDouble();
		
		total= qtd1 * vr1 + qtd2 * vr2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}

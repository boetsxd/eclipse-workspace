package exercise1;

import java.util.Scanner;

public class one_dot_one {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
				
		System.out.printf("SOMA = %d\n", soma);

		sc.close();
	}

}

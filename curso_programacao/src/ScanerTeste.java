import java.util.Scanner;

public class ScanerTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		//para ler diversos itens na quebra de linha sc.nextLine()
		x = sc.next();
		//sc.nextInt para números inteiros
		//sc.nextDouble para numeros com ponto flutuante
		//sc.next().charAt(0) para numeros com um caracter(só vai pegar o primeiro elemento, ignorando os seguintes)
		System.out.println("Voce digitou: " + x);
		
		sc.close();

	}

}

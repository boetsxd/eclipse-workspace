import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int idade = 32;
		double renda = 4500.00;
		String nome = "Maria";
		
		Locale.setDefault(Locale.US);
		System.out.println("Olá mundo!");
		System.out.println(idade);
		System.out.println(renda);
		System.out.printf("%.2f%n", renda);
		System.out.printf("%.4f%n", renda);
		System.out.println("Resultado = " + renda + " Metros");
		System.out.printf("Resultado = %.2f metros%n", renda);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}

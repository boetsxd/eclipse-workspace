
public class TesteProcessamento {

	public static void main(String[] args) {
		
		int a, b;
		double resultado;
		
		a = 5;//quando os numeros 		 
		b = 2;//forem inteiros,
		
		resultado = (double) a / b; //adicionar a palavra double ente parenteses para que o resultado seja de ponto flutuante
		
		System.out.println(resultado);
		
		
		// ou ent�o quando temos um n�mero em ponto flutuante, mas que ser� convertido para int 
		//(casting: convers�o explicita do tipo de dados)		
		
		double x;
		int y;
		
		x = 5.0;
		y = (int)x; //adicionar o int entre parenteses 
		
		System.out.println(y);
	}

}

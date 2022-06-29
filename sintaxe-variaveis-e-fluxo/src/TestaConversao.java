
public class TestaConversao {

	public static void main (String[] args) {
		
		/*
		double salario = 1270.50;
		int valor = salario;
		*/
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		/* 
		Tipos de variáveis numéricas:
		
		para guardar números de mais de 64 bits usar tipo long
		
		para guardar números de 16 bit pode-se usar tipo short
		 */
		
		long numeroGrande = 153789413155478984l;
		System.out.println(numeroGrande);
		
		byte b = 127;
		System.out.println(b);
		
		// Resultado curioso
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		// Usando o tipo float 
		
		float pontoFlutuante = 3.14f;
		
		System.out.println("Verificar ponto flutuante: " + pontoFlutuante);
		
	}
}

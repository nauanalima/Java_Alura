
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		System.out.println("Testando escopo\n");
		
		int idade = 18;
		int quantidadePessoas = 2;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			
			acompanhado = true;
			
		}
		else {
			
			acompanhado = false;
			
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			
			System.out.println("Você pode entrar.");
			
		}
			
		else {
			
			System.out.println("Você não pode entrar.");
			
			
		}
	}

}
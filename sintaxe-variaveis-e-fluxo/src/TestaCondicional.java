
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais\n");
		int idade = 20;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			
			System.out.println("Você é maior de idade e pode entrar.");
			
		}
		
		else {
			
			if (quantidadePessoas >= 2) {
				
				System.out.println("Você é menor de idade mas pode entrar acompanhado.");
				
			}
			
			else {
			
				System.out.println("Você é menor de idade e está sozinho, logo não pode entrar.");
			
			}
		}
	}

}

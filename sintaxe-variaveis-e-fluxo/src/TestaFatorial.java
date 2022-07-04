
public class TestaFatorial {

	public static void main(String[] args) {
		
		for ( int numero = 1 ; numero <= 10 ; numero++ ) {
			
			System.out.println(numero);
			
			int fatorial = 1;
			int numeroAuxiliar = numero;
			
			while (numeroAuxiliar >= 1) {
				
				fatorial *= numeroAuxiliar;
				numeroAuxiliar--;
			}
			System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
			
		}
		
	}
	
}

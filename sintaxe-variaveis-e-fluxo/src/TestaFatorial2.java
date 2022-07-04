
public class TestaFatorial2 {

	public static void main(String[] args) {
		
		for ( int numero = 1 ; numero <= 10 ; numero++ ) {
			
			/*
			 * Fatorial = n! = (n-1)*(n-2)*(n-3)*...*1
			 *
			 */
			
			int fatorial = 1;
			int numeroAuxiliar = numero;
			
			while (numeroAuxiliar >=1) {
				
				fatorial *= numeroAuxiliar;
				numeroAuxiliar--;
			}
	
			System.out.println(numero+"! = "+fatorial);
		}
		
	}
	
}

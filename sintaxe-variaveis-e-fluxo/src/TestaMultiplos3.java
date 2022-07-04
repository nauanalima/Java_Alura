
public class TestaMultiplos3 {

	public static void main(String[] args) {
		
		System.out.println("Percorrendo com um contador: ");
		for ( int numero = 1 ; numero <= 100 ; numero++ ) {
			
			if (numero*3 > 100)
				break;
			
			System.out.print(numero*3+" ");
						
		}
		System.out.println("\n\nVerificando com % qual é divisível por 3:");
		for ( int numero = 1 ; numero <= 100 ; numero++ ) {
			
			if (numero%3 == 0)
				System.out.print(numero+" ");
						
		}
		
	}
	
}

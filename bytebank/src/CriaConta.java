
public class CriaConta {

	public static void main(String[] args) {
		
		// O comando new neste caso está criando um objeto do tipo conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.51;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = primeiraConta.saldo + 100;
		System.out.println(segundaConta.saldo);
	}
	
}


public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira: R$" + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: R$" + segundaConta.saldo);

		segundaConta.saldo = 200;
		System.out.println("Novo saldo da segunda: R$" + segundaConta.saldo);

		if (primeiraConta.saldo == segundaConta.saldo) {

			System.out.println("\nValor primeira: " + primeiraConta.saldo + "\nValor segunda: " + segundaConta.saldo + "\nMesma conta.");
		} else {
			System.out.println("Contas diferentes.");
		}

	}

}

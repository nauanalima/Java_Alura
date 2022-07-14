/*
tipo Conta:
	saldo
	agencia
	numero
	titular
*/

// As classes são públicas por default
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	// Definição de comportamentos
	public void deposita (double valor) {
		// Neste caso o this se refere a esta conta
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			//destino.saldo += valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
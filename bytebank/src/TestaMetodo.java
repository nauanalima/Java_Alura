
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDaNauana = new Conta();
		Conta contaDoBruno = new Conta();
		contaDaNauana.saldo = 100;
		contaDoBruno.saldo = 1000;
		
		
		System.out.println("Saldo Nauana: R$"+contaDaNauana.saldo);
		System.out.println("Saldo Bruno: R$"+contaDoBruno.saldo);
		
		contaDaNauana.deposita(50);
		contaDoBruno.deposita(100);
		
		System.out.println("\nNovo saldo Nauana: R$"+contaDaNauana.saldo);
		System.out.println("Novo saldo Bruno: R$"+contaDoBruno.saldo);
		
		boolean conseguiuRetirar = contaDaNauana.saca(20);
		System.out.println(contaDaNauana.saldo);
		System.out.println(conseguiuRetirar);
		
		contaDoBruno.transfere(485, contaDaNauana);
		
		System.out.println("\nNovo saldo Nauana: R$"+contaDaNauana.saldo);
		System.out.println("Novo saldo Bruno: R$"+contaDoBruno.saldo);
		
	}

}

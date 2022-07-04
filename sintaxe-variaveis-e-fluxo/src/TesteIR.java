
public class TesteIR {

	public static void main(String[] args) {

		double salario = 6000.0;

		if (salario < 1900) {

			System.out.println("Você não declara imposto de renda");

		} else {

			if (salario >= 1900.0 && salario <= 2800.0) {

				System.out.println("O IR é de 7,5% e pode-se deduzir até R$142,00.");

			} else {

				if (salario > 2800.0 && salario <= 3751.0) {

					System.out.println("O IR é de 15% e pode-se deduzir até R$350,00.");

				}

				else {

					if (salario > 3751.0 && salario <= 4664.00) {

						System.out.println("O IR é de 22,5% e pode-se deduzir até R$636,00.");

					}

					else {

						System.out.println("Tá podendo hein, parça?");

					}

				}

			}

		}

	}

}

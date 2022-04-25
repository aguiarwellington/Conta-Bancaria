
import java.util.Scanner;

public class Testeconta {

		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
				ContaBanco contaBancaria = new ContaBanco();
				
				
			
			System.out.println("Informe o nome do titular da conta: ");
			
			
			contaBancaria.alterarNome(contaBancaria.nomeConta = s.nextLine());
			System.out.println("Nome do tituar: " + contaBancaria.nomeConta);
			
			
			 
			int opcao = 0;
			float valor;
			boolean sai = false;
		
		
			do {

				System.out.print("1 = Sacar; 2 = Depositar; 3 = Consultar Saldo; 4 = Sair;");
				opcao = s.nextInt();

				switch (opcao) {
				case 1: {

					System.out.println("Informe o valor do saque: ");
					valor = s.nextFloat();
					contaBancaria.sacar(valor);
					break;
				}

				case 2: {

					System.out.println("Informe o valor do depósito: ");
					valor = s.nextFloat();
					contaBancaria.depositar(valor);
					break;
				}

				case 3: {

					System.out.println("Saldo da conta: " +contaBancaria.consultarSaldo());
					break;

				}
				
				case 4: {

					System.out.println("TCHAU!!!");
					sai = true;
					s.close();
					break;

				}
				default:
					throw new IllegalArgumentException("Valor inesperado: " + opcao);
				}

			} while ( !sai);
			
			s.close();
		
	}

}

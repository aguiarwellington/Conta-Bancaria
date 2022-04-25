
public class ContaBanco {
	
	//atributos da conta
		String nomeConta;
		int numeroConta;
		float saldo = 100;
		
		//method
		
		public void sacar(float vlrsaque ) {
			this.saldo =  this.saldo-vlrsaque;
			
			
		}
		
		public void depositar(float vlrdepositar) {
			
			this.saldo = this.saldo + vlrdepositar;
		}
			
		
		public float consultarSaldo() {
			
			return this.saldo;	
			
			
		}
		
		public String consultarNome() {
			
			return this.nomeConta;
			
		}
		
		public void alterarNome(String novoNome) {
			
			this.nomeConta = novoNome;
			
		}

}

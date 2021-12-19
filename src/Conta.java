
public class Conta {

	int numero;
	double limite;
	double saldo;
	
	void depositar (Double valor) {
		this.saldo += valor;	
	}
	
	Boolean sacar (Double valor) {
		if (saldo < valor) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	
	Boolean transferir(Conta contaReceber, Double valor) {
		if (this.saldo < valor) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			contaReceber.saldo = contaReceber.saldo + valor;
			return true;
		}
		
	}
}
	

	

public class Inicial {

	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		contaA.saldo = 500.00;
		
		
		Conta contaB = new Conta();
		contaB.saldo = 10.00;
		
		contaA.transferir(contaB, 200.00);
		
		System.out.println(String.format("Saldo ContaB: %s, Saldo ContaA: %s", contaA.saldo , contaB.saldo));

	}
	
	static Boolean transferir(Conta contaEnviar, Conta contaReceber, Double valor){
		if (contaEnviar.saldo < valor) {
			return false;
		}else {
			contaEnviar.saldo = contaEnviar.saldo - valor;
			contaReceber.saldo = contaReceber.saldo - valor;
			return true;
		}
	}

}

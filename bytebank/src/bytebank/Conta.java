package bytebank;

public class Conta {

	int agencia;
	int numero;
	double saldo;
	String titular;
	
	public void deposita(double valor){
		this.saldo = saldo + valor;
	}
}

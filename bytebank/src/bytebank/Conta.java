package bytebank;

public class Conta {

	int agencia;
	int numero;
	double saldo;
	String titular;

	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
}

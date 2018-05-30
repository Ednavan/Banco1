
public class Conta {
	//Atributos
	private int numero;
	private Pessoa correntista;
	private float saldo;
	
	//Construtor
	public Conta() {} //construtor padrao
	public Conta(int numero, Pessoa correntista, float saldo) {
		this.setNumero(numero);
		this.setCorrentista(correntista);
		this.setSaldo(saldo);
		
	}
//Métodos
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;

	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;

	}

	public Pessoa getCorrentista() {
		return this.correntista;

	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;

	}

	public float getSaldo() {
		return this.saldo;

	}
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo()+valor);//metodo depositar que vai inserir no saldo mais uma valor de deposito		
	}
	public boolean sacar(float valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo((this.getSaldo()- valor));
			return true;
			
		}
		return false;//se o valor for menor retornara false
		
	}

}

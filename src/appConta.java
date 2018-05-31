
public class appConta {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa("fulano", "fulanogmail.com");
		Pessoa p2 = new Pessoa("cicrano", "cicranogmail.com");
		Conta c1 = new Conta();
		Conta c2 = new Conta(22088451,p1, 750.00f);
		
		p2.setNome("Cicrano");
		p2.setEmail("circranogmail.com");
		c1.setCorrentista(p2);
		c1.setNumero(182823);
	//c1.setSaldo(180.0f);
	
		c2.getNumero();
		c2.getCorrentista();
		c2.getSaldo();
		
		
		
		System.out.println("O nome do correntista: " + c1.getCorrentista().getNome());
		System.out.println("O número da conta: " + c1.getNumero());
		System.out.println("O valor incial da conta: " + c1.getSaldo());
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("O nome do correntista: " + c2.getCorrentista().getNome());
		System.out.println("O número da conta: " + c2.getNumero());

		
		
		System.out.println("O valor incial da conta: " + c2.getSaldo());
		
		if (c2.sacar(100.0f)) {
			System.out.println("Saque efetuado com sucesso");
			
				
		}else {
			System.out.println("Saque não realizado com sucesso");
			
			c2.depositar(100.00f);
			
			System.out.println("Saque efetuado com sucesso");
			
		}
		System.out.println("Saldo atual "+ c2.getSaldo());
		
		
	}

}

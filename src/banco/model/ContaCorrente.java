package banco.model;

public class ContaCorrente  extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupaça ===");
		super.imprimirInfosComuns();
		
	}

	
	
}

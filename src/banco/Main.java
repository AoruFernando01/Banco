package banco;

import banco.model.Conta;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}

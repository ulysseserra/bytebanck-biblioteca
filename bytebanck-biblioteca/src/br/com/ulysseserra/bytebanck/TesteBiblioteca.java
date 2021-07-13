package br.com.ulysseserra.bytebanck;

import br.com.bytebanck.banco.conta.Conta;
import br.com.bytebanck.banco.conta.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(6653, 665323);
		
		c.deposita(200.3);
		
		System.out.println(c.getSaldo());

	}

}

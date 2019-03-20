package br.com.hiox.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.hiox.bean.Comida;

public class otoOtoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Comida> comida = new ArrayList();
		Comida c = new Comida("FILET", 45.99);
		Comida cx = new Comida("STEAK TARTARE", 63.99);
		Comida cp = new Comida("BEEF WELLINGTON", 145.20);
		
		comida.add(c);
		comida.add(cx);
		comida.add(cp);
		
		for(Comida comidaO : comida) {
			System.out.println(comidaO.getDescricao());
			System.out.println(comidaO.getPreco());
		}
		comida.add(new Comida("DOGUINHO",5.50));
		
		for (Comida comidaA : comida) {
			System.out.println(comidaA.getDescricao());
			System.out.println(comidaA.getPreco());
		}
	}

}

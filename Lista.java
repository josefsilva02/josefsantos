package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Lista {

	public static void main(String[] args) {
		
	
		ArrayList<Usuario>  lista = new ArrayList();
		
		Usuario u1 = new Usuario("lia");
		
		lista.add(new Usuario("carlos"));
		lista.add(new Usuario("jefferson"));
		lista.add(new Usuario("luiza"));
		lista.add(new Usuario("mario"));
		
		for(Usuario u : lista ) {
			
			System.out.println(u.toString());
			
		}
		

	}

}

package br.com.hiox.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.hiox.bean.Usuario;
import br.com.hiox.dao.UsuarioDAO;

public class PesqUsuario {

	public static void main(String[] args) {
		
		try {
			UsuarioDAO dao = new UsuarioDAO();
			Usuario u = new Usuario();
			List<Usuario> listaDoCapeta = new ArrayList<Usuario>();
			
			listaDoCapeta = dao.consultar();
			
			for(int i=0;i<listaDoCapeta.size();i++) {
				System.out.println(listaDoCapeta.get(i).getLogin());
			}
			
			for(Usuario us : listaDoCapeta) {
				System.out.println(us.getCodigo());
			}
			
			listaDoCapeta.forEach(capeta -> System.out.println(capeta.getAll()));
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}

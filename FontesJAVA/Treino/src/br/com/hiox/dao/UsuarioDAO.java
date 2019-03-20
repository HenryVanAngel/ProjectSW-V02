package br.com.hiox.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.hiox.bean.Usuario;
import br.com.hiox.conexao.Conexao;

public class UsuarioDAO {
	
	private Connection con;
	private PreparedStatement ps ;
	private ResultSet rs;
	
	public UsuarioDAO()throws Exception {
		this.con= new Conexao().conectar();
	}
	public Usuario consultar(int codigo) throws Exception{
		
		ps = con.prepareStatement
				("select CD_USUARIO,NM_USUARIO,"
				+ "DS_EMAIL,DT_NASCIMENTO,DS_LOGIN,DS_SENHA,NR_NIVEL_PERMISSAO,"
				+ "DS_FOTO,DS_GENERO \r\n" + 
				"from T_SCP_USUARIO where CD_USUARIO=?");
		ps.setInt(1, codigo);
		
		rs = ps.executeQuery();
		
		if (rs.next()) {
			return new Usuario(rs.getInt("CD_USUARIO"),
					rs.getString("NM_USUARIO"), 
					rs.getString("DS_EMAIL"), 
					rs.getString("DT_NASCIMENTO"), 
					rs.getString("DS_LOGIN"), 
					rs.getString("DS_SENHA"), 
					rs.getInt("NR_NIVEL_PERMISSAO"), 
					null, 
					rs.getString("DS_GENERO"));
		}else {
			return new Usuario();
		}
		
	}
	public List<Usuario> consultar()throws Exception{
		ps = con.prepareStatement("select CD_USUARIO,NM_USUARIO,"
				+ "DS_EMAIL,DT_NASCIMENTO,DS_LOGIN,DS_SENHA,NR_NIVEL_PERMISSAO,"
				+ "DS_FOTO,DS_GENERO \r\n" + 
				"from T_SCP_USUARIO");
		
		rs = ps.executeQuery();
		
		List<Usuario> listaDoCapeta = new ArrayList<Usuario>();
		while (rs.next()){
			listaDoCapeta.add(new Usuario(rs.getInt("CD_USUARIO"),
					rs.getString("NM_USUARIO"), 
					rs.getString("DS_EMAIL"), 
					rs.getString("DT_NASCIMENTO"), 
					rs.getString("DS_LOGIN"), 
					rs.getString("DS_SENHA"), 
					rs.getInt("NR_NIVEL_PERMISSAO"), 
					null, 
					rs.getString("DS_GENERO")));
		}
		
		return listaDoCapeta;
	}
}

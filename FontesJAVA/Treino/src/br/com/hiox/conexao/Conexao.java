package br.com.hiox.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public  Connection conectar() throws Exception{
		return DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","fiap19");
	}

}

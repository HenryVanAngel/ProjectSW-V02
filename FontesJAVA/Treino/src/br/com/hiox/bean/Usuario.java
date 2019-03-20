package br.com.hiox.bean;

import java.io.Serializable;

public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2285121685063274103L;
	
	private int codigo;
	
	private String nomeUsuario;
	
	private String email;
	
	private String dtNascimento;
	
	private String login;
	
	private String senha;
	
	private int nivelPermissao;
	
	private String urlFoto;
	
	private String genero; 

	public void setAll(int codigo, String nomeUsuario, String email, String dtNascimento, String login, String senha,
			int nivelPermissao, String urlFoto, String genero) {
		this.codigo = codigo;
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.login = login;
		this.senha = senha;
		this.nivelPermissao = nivelPermissao;
		this.urlFoto = urlFoto;
		this.genero = genero;
	}

	public String getAll() {
		return codigo + "\t" +  nomeUsuario 
				+ "\t" +  email + "\t" +  dtNascimento + "\t" +  login + "\t" +  senha + "\t" + 
				nivelPermissao + "\t" +  urlFoto + "\t" +  genero;
		
	}
	
	public Usuario(int codigo, String nomeUsuario, String email, String dtNascimento, String login, String senha,
			int nivelPermissao, String urlFoto, String genero) {
		super();
		this.codigo = codigo;
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.dtNascimento = dtNascimento;
		this.login = login;
		this.senha = senha;
		this.nivelPermissao = nivelPermissao;
		this.urlFoto = urlFoto;
		this.genero = genero;
	}

	public Usuario() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNivelPermissao() {
		return nivelPermissao;
	}

	public void setNivelPermissao(int nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

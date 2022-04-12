package com.estudo.polimorfismo.model;

public class Gerente extends Funcionario{

	private String nome;
	private String cpf;
	private double salario;
	private String senha;
	
	public double calculaBonificacao() {
		return this.salario;
	}
	
	public Boolean autenticacao(String senha) {
		if (senha.equals(this.senha) ) {
			return Boolean.TRUE;
		} 
		return Boolean.FALSE;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

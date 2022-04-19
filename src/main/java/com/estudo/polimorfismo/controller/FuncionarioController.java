package com.estudo.polimorfismo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.polimorfismo.model.Funcionario;
import com.estudo.polimorfismo.model.Gerente;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@GetMapping
	public double buscaBonificacaoFuncionario() {
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(10);
		return funcionario.calculaBonificacao();
	}
	
	@GetMapping("/referencia")
	public String testandoReferencia() {
		Funcionario gerente = new Gerente();
		gerente.setNome("Marcos");
		
		return gerente.getNome();
	}
}

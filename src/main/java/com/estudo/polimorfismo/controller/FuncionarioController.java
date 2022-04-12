package com.estudo.polimorfismo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.polimorfismo.model.Funcionario;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@GetMapping
	public double buscaBonificacaoFuncionario() {
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(10);
		return funcionario.calculaBonificacao();
	}
}

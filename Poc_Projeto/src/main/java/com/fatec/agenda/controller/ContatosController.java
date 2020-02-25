package com.fatec.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contatos")
public class ContatosController {

	@RequestMapping("/novo")
	public String novo() {
		return "/contato/CadastroContato";
	}
	
	@RequestMapping
	public String pesquisa() {
		return "/contato/PesquisaContatos";
	}
	
}

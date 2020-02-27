package com.fatec.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.agenda.repository.Contatos;

import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/contatos")
public class ContatosController {

	@Autowired
	private Contatos contatos;

	@RequestMapping("/novo")
	public String novo() {
		return "/contato/CadastroContato";
	}
	
	@RequestMapping
	public ModelAndView pesquisa() 
	{	
		ModelAndView mv = new ModelAndView("/contato/ListagemContatos");
		mv.addObject("Contatos",contatos.findAll());
		return mv;
		
	}
	
}

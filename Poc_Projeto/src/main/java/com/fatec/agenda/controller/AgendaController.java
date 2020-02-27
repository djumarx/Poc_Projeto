package com.fatec.agenda.controller;

import com.fatec.agenda.model.Contato;
import com.fatec.agenda.storage.FotoStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contato")
public class AgendaController {

    @Autowired
	private FotoStorage fotoStorage;

    @RequestMapping(value = "/{id}")
    public ModelAndView detalhe(@PathVariable("id") Contato contato) {
        ModelAndView mv = new ModelAndView("/contato/DetalheContato");
        mv.addObject("contato", contato);
		if(contato.temFoto()){
			contato.setUrl(fotoStorage.getUrl(contato.getFoto()));
		}
		return mv;
    }
}
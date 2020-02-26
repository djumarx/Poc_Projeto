package com.fatec.agenda.controller;

import java.util.Date;

import com.fatec.agenda.model.Contato;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/agenda")
public class AgendaController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ModelAndView detalhe(Integer id) {
        ModelAndView mv = new ModelAndView("/contato/DetalheContato");
        Contato contato = new Contato();
        contato.setId(1);
        contato.setNome("João da Silva");
        contato.setApelido("Jãozim");
        contato.setWhats("+55123450987");
        contato.setTel("(11) 9876-3645");
        contato.setDtNasc(new Date(2001-1900, 1, 1));
        mv.addObject("contato", contato);
        return mv;
    }
}
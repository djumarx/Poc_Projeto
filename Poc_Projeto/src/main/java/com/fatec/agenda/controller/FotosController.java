package com.fatec.agenda.controller;

import com.fatec.agenda.dto.Foto;
import com.fatec.agenda.service.AgendaService;
import com.fatec.agenda.storage.FotoReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fotos/")
public class FotosController {

    @Autowired
    private AgendaService agendaService;

    @Autowired(required = false)
    private FotoReader fotoReader;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Foto upload(@PathVariable Long id
            ,@RequestParam("files[]") MultipartFile[] files){
        String url = agendaService.salvarFoto(id, files[0]);
        return new Foto(url);
    }

    @RequestMapping("/{nome:.*}")
    public byte[] recuperar(@PathVariable String nome){
        return fotoReader.recuperar(nome);

    }
    
}
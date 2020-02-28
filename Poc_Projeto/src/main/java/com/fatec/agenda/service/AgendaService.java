package com.fatec.agenda.service;

import com.fatec.agenda.model.Contato;
import com.fatec.agenda.repository.Contatos;
import com.fatec.agenda.storage.FotoStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AgendaService {
      
    @Autowired
    private Contatos contatos;

    @Autowired
    private FotoStorage fotoStorage;

    public void salvar(Contato contato) {
        this.contatos.save(contato);
    }

    public String salvarFoto(Long id, MultipartFile foto) {
        Contato contato = contatos.findById(id).get();
        String nomeFoto = fotoStorage.salvar(foto);
        contato.setFoto(nomeFoto);
        contatos.save(contato);
        return fotoStorage.getUrl(nomeFoto);
    }
        
    
}
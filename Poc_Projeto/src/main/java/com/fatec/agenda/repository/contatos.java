package com.fatec.agenda.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.agenda.model.Contato;

public interface Contatos extends JpaRepository <Contato, Long>
{
    
}
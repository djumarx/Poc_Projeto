package com.fatec.agenda.dto;

import java.util.Date;

public class ContatoDTO {
    public String nome;
    public String apelido;
    public String whats;
    public String tel;
    public Date dtNasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getWhats() {
        return whats;
    }

    public void setWhats(String whats) {
        this.whats = whats;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }
}
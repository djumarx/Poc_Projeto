CREATE TABLE  contatoS (
    codigo BIGSERIAL,
    nome VARCHAR(50) NOT NULL,
    apelido VARCHAR(50) NOT NULL,
    whats VARCHAR(15) NOT NULL,
    tel VARCHAR(15) NOT NULL,
    dt_nasc DATE NOT NULL
)
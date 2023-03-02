CREATE DATABASE Padaria;

use Padaria;

CREATE TABLE produtos(
	id int NOT NULL AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    preco double NOT NULL,
    codigo int NOT NULL,
    qnt int NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE funcionarios(
	id int NOT NULL AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    senha varchar(255) NOT NULL,
    cargo int NOT NULL,
    PRIMARY KEY (id)
);
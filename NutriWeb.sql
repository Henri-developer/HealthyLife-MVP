create database NutriWeb;
use NutriWeb;

create table Autenticacao(
idUser int not null auto_increment primary key, 
nomeUsuario varchar(35) not null,
senhaUsuario varchar(40) not null,
loginUsuario varchar(15) not null unique,
email varchar(30) not null,
telefone varchar(20) not null
);

select * from Autenticacao;

create table Profissional(
idProfissional int not null auto_increment primary key,
nome varchar(35) not null,
especialidade varchar(30) not null
);

select * from Profissional;

create table Cliente(
idCliente int not null auto_increment primary key,
nome varchar(35) not null,
email varchar(35) not null,
cpf char(15) not null,
telefone varchar(30) not null,
dataNascimento date not null
);

select * from Cliente;

create table Consulta(
idConsulta int not null auto_increment primary key,
consultaData date not null,
consultaHorario varchar(30) not null,
consultaTipo varchar(40) not null,
pacientePrimeiraVez varchar(3) not null,
profissional_id int not null,
client_id int not null,
status char(1),
foreign key (id_profissional) references profissional (idProfissional),
foreign key (id_cliente) references cliente (idCliente)
);

select * from consulta;

create table consulta_profissional(
idconsulta_profissional int not null auto_increment primary key,
id_consulta int,
id_profissional int,
foreign key (id_consulta) references consulta (idConsulta),
foreign key (id_profissional) references profissional (idProfissional)
);

select * from consulta_profissional;

/*
	Senha Criptografada
*/
DELIMITER //
CREATE TRIGGER inserirSenhas
BEFORE INSERT ON Autenticacao
FOR EACH ROW	
BEGIN
	SET NEW.senhaUsuario = MD5 (NEW.senhaUsuario);
END 
//
DELIMITER ;
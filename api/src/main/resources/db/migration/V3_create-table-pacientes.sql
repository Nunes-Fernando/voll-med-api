create table pacientes(
	
    id bigint auto_increment not null ,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    cpf varchar(11) not null unique,
    logradouro varchar (100) not null,
    bairro varchar (100) not null,
    cep varchar (9) not null,
    complemento varchar(100) not null,
    numero varchar(10) not null,
    uf char(2) not null,
    cidade varchar(100) not null,
    
    primary key(id)
    
)
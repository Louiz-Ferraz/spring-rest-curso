CREATE TABLE comentario (
	id bigint not null auto_increment,
    ordem_servico_id bigint not null,
    descricao text not null,
    data_envio datetime not null,
    
    primary key (id)
);

ALTER TABLE comentario ADD CONSTRAINT fk_comentario_ordem_servico
FOREIGN KEY (ordem_servico_id) REFERENCES ordem_servico(id);
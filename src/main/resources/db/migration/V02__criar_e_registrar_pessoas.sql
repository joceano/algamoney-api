CREATE TABLE pessoa (
  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  logradouro VARCHAR(50),
  numero VARCHAR(50),
  complemento VARCHAR(50),
  bairro VARCHAR(50),
  cep VARCHAR(50),
  cidade VARCHAR(50),
  estado VARCHAR(50),
  ativo BOOLEAN
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Joceano', 'Rua Tamoio', '845', 'Ap. 201', 'Centro', '85.501-054', 'Pato Branco', 'PR', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Claudineia', 'Miguel Parzianello', '72', 'casa', 'Jardim Floresta', '85.506-600', 'Pato Branco', 'PR', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('José Borba', 'Basilio Flyssak', '196', null, 'Jardim Floresta', null, 'Pato Branco', 'PR', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Mariane Alves de Borba', null, '196', null, null, null, 'Pato Branco', 'PR', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Naiane Borba', null, null, null, null, null, 'Pato Branco', 'PR', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Rudinei Balan', null, null, null, null, null, 'Itapejara', 'PR', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Gilvane Perazolli', null, null, null, 'São Francisco', null, 'Clevelândia', 'PR', true);

INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo)
VALUES ('Cuca Beludo', null, null, null, null, null, 'Mariópolis', 'PR', true);
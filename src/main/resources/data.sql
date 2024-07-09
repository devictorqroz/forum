INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$WTVZ.dS87FhvLVq0CQ7.VOdU/r3D.DXqu53SPhZt0dO3YOL.808we');
INSERT INTO USUARIO(nome, email, senha) VALUES('Moderador', 'moderador@email.com', '$2a$10$WTVZ.dS87FhvLVq0CQ7.VOdU/r3D.DXqu53SPhZt0dO3YOL.808we');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_MODERADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2, 2);

INSERT INTO CURSO(nome, subcategoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, subcategoria) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data, status, curso_id, dono_id) VALUES('Dúvida', 'Erro ao criar projeto', '2019-05-05 18:00:00', 'NAO_RESPONDIDO', '1', '1');
INSERT INTO TOPICO(titulo, mensagem, data, status, curso_id, dono_id) VALUES('Dúvida 2', 'Projeto não compila', '2019-05-05 19:00:00', 'NAO_RESPONDIDO', '1', '1');
INSERT INTO TOPICO(titulo, mensagem, data, status, curso_id, dono_id) VALUES('Dúvida 3', 'Tag HTML', '2019-05-05 22:00:00', 'NAO_RESPONDIDO', '2', '1');
INSERT INTO TOPICO(titulo, mensagem, data, status, curso_id, dono_id) VALUES('Dúvida 4', 'Beans', '2019-05-05 20:00:00', 'NAO_RESPONDIDO', '1', '1');



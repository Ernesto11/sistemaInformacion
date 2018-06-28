USE db_erp;

DELETE FROM empleado;
ALTER TABLE empleado AUTO_INCREMENT = 1;
DELETE FROM administrador;
ALTER TABLE administrador AUTO_INCREMENT = 1;
DELETE FROM usuario;
ALTER TABLE usuario AUTO_INCREMENT = 1;
DELETE FROM categoria;
ALTER TABLE categoria AUTO_INCREMENT = 1;


INSERT INTO usuario(`nombre`,`contrasenna`,`tipo`)VALUES
("usr1","12345","admin"),("usr2","12345","usuario"),("usr3","12345","admin"),("usr4","12345","usuario");

INSERT INTO empleado(`fk_usuario`,`nombre`)VALUES
(2,"nombre 1"),(4,"nombre 2");

INSERT INTO administrador(`fk_usuario`,`nombre`)VALUES
(1,"nombre 1"),(3,"nombre 2");

INSERT INTO empresa(`fk_usuario`,`nombre`)VALUES
(1,"nombre 1"),(3,"nombre 2");

INSERT INTO categoria (`nombre`) VALUES
("categoria 1"),("categoria 2"),("categoria 3"),("categoria 4");

INSERT INTO unidad_medida(`nombre`,`simbolo`)VALUES
("nombre 1","n1"),("nombre 2","n2"),("nombre 3","n3"),("nombre 4","n4");

INSERT INTO regla_abestecimiento(`cantidad_minima`,`cantidad_maxima`)VALUES
(1,10),(1,10);

INSERT INTO producto(`fk_empresa`,`fk_categoria`,`fk_unidad_medida`,`fk_regla_abestecimiento`,
`nombre`,`precio`,`costo`,`impuesto`,`cantidad_disponible`)
VALUES
(1,1,1,1,"nombre 1",1000,500,0,10),(1,2,2,2,"nombre 2",1100,600,0,5);

INSERT INTO combo(`nombre`)
VALUES
("combo 1"),("combo 2");


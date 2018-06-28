create database sistema;

CREATE TABLE sistema.Producto (
    Id_Producto int not null AUTO_INCREMENT,
    Nombre Varchar(50) NOT NULL,
    Categoria VARCHAR(50) NOT NULL,
    UnidadMedida VARCHAR(30),
    valorMedida double,
	Precio double,
    Costo double,
    Impuesto double,
    PRIMARY KEY (Id_Producto)
);

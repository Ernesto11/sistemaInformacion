DROP PROCEDURE IF EXISTS sistema.insertarProducto;

DELIMITER $$
CREATE PROCEDURE sistema.insertarProducto(
	IN Nombre_P Varchar(50),
    IN Categoria_P VARCHAR(50), 
    IN UnidadMedida_P VARCHAR(30),
    IN ValorMedida_P double,
    IN Precio_P double,
    IN Costo_P double,
    IN Impuesto_P double)
    
BEGIN

	DECLARE EXIT HANDLER FOR SQLEXCEPTION, SQLWARNING
	BEGIN
		ROLLBACK;
        SELECT 'Error, los datos no se insertaron correctamente';
	END;
    
    START TRANSACTION;


    INSERT INTO sistema.Producto (Nombre,Categoria,UnidadMedida,valorMedida,Precio,Costo,Impuesto)
    values (Nombre_P,Categoria_P,UnidadMedida_P,ValorMedida_P, Precio_P,Costo_P,Impuesto_P);
    
    COMMIT;
END $$;
    
DELIMITER $$;


use scvme;

/* Tabla tipo_usuario */
INSERT INTO tipo_usuario(Tipo, Descripcion)
VALUES ('Administrador', 'Cuenta con todos los privilegios para la gestión de la aplicación'),
		('Usuario', 'Puede realizar publicaciones de componentes electronicos, ver perfiles de otros usuarios,
        calificar usuarios, enviar comentarios, asi como modificaciones a su propio perfil');
        
/* Tabla Estatus */
INSERT INTO Estatus(Estatus)
VALUES ('Activo(a)'),
		('Inactivo(a)'),
        ('Bloqueado(a)'),
        ('Eliminado(a)');
        
/* Tabla unidad_aprendizaje */
INSERT INTO unidad_aprendizaje(Nombre)
VALUES ('Análisis Fundamental de Circuitos'),
		('Electrónica Analógica'),
        ('Arquitectura de computadoras'),
        ('Fundamentos de Diseño Digital'),
        ('Sistemas Digitales'),
        ('Microcontroladores'),
        ('Instrumentación'),
        ('Teoría de Señales y Comunicaciones');

/* Tabla unidad_academica */
INSERT INTO unidad_academica(Nombre)
VALUES ('ESCOM'),
		('ESIME ZACATENCO'),
        ('ESIME CULHUACAN'),
        ('ESIME TICOMAN'),
        ('UPIICSA'),
        ('UPIITA');
        
/* Tabla Usuario */
INSERT INTO usuario(email, nombreUsuario, clave, nombre, primerApellido, segundoApellido, Foto, Calificacion, Unidad_Academica_idUnidad_Academica,
				Tipo_Usuario_idTipo_Usuario, Estatus_idEstatus)
                VALUES ('isc.robertomendoza@gmail.com', 'robert', 'rob1234', 'Roberto', 'Mendoza', 'Saavedra', null, null, 1, 1, 1),
						('jamie.upiita@gmail.com', 'jamie', 'jam1234', 'Jamie', 'Botello', 'Flores', null, null, 6, 2, 1),
                        ('jose_12@hotmail.com', 'jose12', 'jos1234', 'Jose', 'Vargas', 'Gonzalez', null, null, 2, 2, 1);

/* Tabla usuario_has_unidad_aprendizaje */
INSERT INTO usuario_has_unidad_aprendizaje(Usuario_idUsuario, Unidad_Aprendizaje_idUnidad_Aprendizaje)
VALUES (2,6),
		(2,5),
        (2,1),
        (3,1),
        (3,2);

/* Tabla publicacion */
ALTER TABLE publicacion MODIFY COLUMN Descripcion TEXT NOT NULL;
INSERT INTO publicacion(nombrecomponente, cantidad, descripcion, datasheet, linkFacebook, imagen, Usuario_idUsuario, Estatus_idEstatus)
VALUES ('LM35', 4, 'Sensor de temperatura capaz de medir temperaturas negativas, es compatible con Arduino. Consumo de 10 mV.', null, null, null, 2, 1);


/* Tabla comentario */
ALTER TABLE comentario MODIFY fechaAlta DATE NOT NULL;
ALTER TABLE comentario MODIFY fechaEdicion DATE;
ALTER TABLE comentario MODIFY fechaEliminacion DATE;
INSERT INTO comentario(fechaAlta, fechaEdicion, fechaEliminacion, Comentario, publicacion_idPublicacion)
VALUES ('2017/11/17', null, null, 'Estoy interesado en este sensor, necesito dos de esos.', 1);
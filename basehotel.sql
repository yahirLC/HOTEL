CREATE DATABASE hotel;

/* crear la tabla cuarto*/
USE hotel;

CREATE TABLE Cuarto (
   idCuarto INT AUTO_INCREMENT PRIMARY KEY,
   numero VARCHAR(4) NOT NULL,
   piso VARCHAR(2) NOT NULL,
   descripcion VARCHAR(255) NULL,
   caracteristicas VARCHAR(512) NULL,
   precio_diario DECIMAL(7,2) NOT NULL,
   estado VARCHAR(15) NOT NULL,
   tipocuarto VARCHAR(20) NOT NULL
);

/* crear la tabla Persona*/

CREATE TABLE Persona (
   idPersona INT AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(45) NOT NULL,
   a_paterno VARCHAR(45) NOT NULL,
   a_materno VARCHAR(45) NOT NULL,
   fecha_nacimiento DATE NOT NULL,
   telefono VARCHAR(45) NULL,
   correo VARCHAR(45) NULL,
   UNIQUE (telefono),
   UNIQUE (correo)
);

/*cliente*/

CREATE TABLE Cliente (
   idPersona INT PRIMARY KEY,
   CodigoCliente VARCHAR(45) NOT NULL UNIQUE,
   FOREIGN KEY (idPersona) REFERENCES Persona(idPersona) ON DELETE NO ACTION ON UPDATE NO ACTION
);

/*trabajador*/

CREATE TABLE Trabajador (
   idPersona INT PRIMARY KEY,
   login VARCHAR(45) NOT NULL UNIQUE,
   contraseña VARCHAR(45) NOT NULL,
   acceso VARCHAR(45) NOT NULL,
   FOREIGN KEY (idPersona) REFERENCES Persona(idPersona) ON DELETE NO ACTION ON UPDATE NO ACTION
);

/*reservacion*/


CREATE TABLE Reservacion (
   idReservacion INT AUTO_INCREMENT PRIMARY KEY,
   fecha_reservacion DATE NOT NULL,
   fecha_ingreso DATE NOT NULL,
   fecha_salida DATE NOT NULL,
   costo_total DECIMAL(7,2) NOT NULL,
   idCliente INT NOT NULL,
   idCuarto INT NOT NULL,
   FOREIGN KEY (idCliente) REFERENCES Cliente(idPersona) ON DELETE NO ACTION ON UPDATE NO ACTION,
   FOREIGN KEY (idCuarto) REFERENCES Cuarto(idCuarto) ON DELETE NO ACTION ON UPDATE NO ACTION
);

/*pago*/

CREATE TABLE Pago (
   idPago INT AUTO_INCREMENT PRIMARY KEY,
   tipo VARCHAR(45) NOT NULL,
   monto DECIMAL(7,2) NOT NULL,
   idReservacion INT NOT NULL,
   FOREIGN KEY (idReservacion) REFERENCES Reservacion(idReservacion) ON DELETE NO ACTION ON UPDATE NO ACTION
);
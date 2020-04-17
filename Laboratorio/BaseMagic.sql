create database MBD1;
use MBD1;

create table MantenimientoCliente
(
ID int(15) auto_increment primary key,
Nombre varchar(60) not null,
Dirección varchar(60) not null,
Correo varchar (60) not null,
Telefono varchar(50) not null,
Edad varchar(5) not null

)engine=InnoDB;

use MBD1;
select * from MantenimientoCliente;




create table MantenimientoPelicula
(
ID int(15) auto_increment primary key,
AutorPelicula varchar (60) not null,
Pelicula varchar (60) not null,
Categoria varchar (60) not null,
Clasificación varchar (5)not null
)engine=InnoDB;

use MBD1;
select * from MantenimientoPelicula;



create table MantenimientoVideoJuego
(
ID int (15) auto_increment primary key,
AutorVideoJuego varchar (60) not null,
NombreVideoJuego varchar (60) not null,
Categorias varchar (60) not null,
Clasificacion varchar (5)not null
)engine=InnoDB;

use MBD1;
select * from MantenimientoVideoJuego;

use MBD1;


create table Fechasss
(
ID int(20) auto_increment primary key,
Nombre varchar(60) not null,
DiaAlquiler varchar(50) not null,
MesAlquiler varchar(50)not null,
AñoAlquiler varchar(50) not null,
DiaLimite varchar (50) not null,
MesLimite varchar (50) not null,
AñoLimite varchar(50) not null
)engine=InnoDB;

use MBD1;
select * from Fechasss;



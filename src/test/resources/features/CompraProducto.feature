# language:es

Característica: realizar compra de producto 
  yo como usuario quiero iniciar sesion, ingresar al menu de productos y realizar una compra

  Antecedentes: login exitoso
    Dado que ingreso a la pagina serenity demo

  Esquema del escenario: compra producto exitoso
    Cuando realizo el login con los datos requeridos
      | usuario   | contrasena  |
      | <usuario> | <contrasena>|
    Y doy click en iniciar sesion
    Y realizo la compra del producto
      |nombreCliente  |fechaOrden  |empleado  |producto  |cantidad  |
      |<nombreCliente>|<fechaOrden>|<empleado>|<producto>|<cantidad>|
    Entonces valido que aparezca la aprobacion de la compra
      |fechaOrden  |
      |<fechaOrden>|

    Ejemplos:
      | usuario | contrasena  |nombreCliente  |fechaOrden|empleado     |producto |cantidad|
      | admin   | serenity    |Around the Horn|03/17/2023|Andrew Fuller|Chocolade|2       |
      

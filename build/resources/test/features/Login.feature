#language:es

Característica: Inicio de Sesion
  yo como usuario inicio sesion en la pagina serenity demo

  Esquema del escenario: login exitoso
    Dado que ingreso a la pagina serenity demo
    Cuando realizo el login con los datos requeridos
      | usuario   | contrasena  |
      | <usuario> | <contrasena>|
      
    Y doy click en iniciar sesion
    Entonces valido que aparezca mi nombre de usuario
      | usuario   |
      | <usuario> |
      
    Ejemplos: 
      | usuario | contrasena  |
      | admin   | serenity    |

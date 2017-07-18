# language: es

   Característica: Login a la aplicacion bancaria con exito

     Antecedentes:
     Dado que me conecte a la aplicacion

     Esquema del escenario: entramos a la aplicacion con usuario y contraseña correctas

     Cuando introduzco el Usuario <login> y la Contrasena <pass>

     Entonces entraremos en la aplicacion

       Ejemplos:
         |login|pass|
         |"iber4"|"iber4"|
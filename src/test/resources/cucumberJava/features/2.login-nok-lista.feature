# language: es

  Característica: Login a la aplicacion bancaria fallido
  

    Esquema del escenario:Login fallido rellenando usuario y contraseñas incorrectas

     	Dado que me conecte a la aplicacion

    	Cuando introduzco el Usuario <login> y la Contrasena <pass>

    	Entonces sale mensaje de error y no podemos entrar

     Ejemplos:
		|login  |pass   |
		|"tryte"|"tryte"|
		|"tryte"|""     |
		|""     |"tryte"|
		|""     |""     |



    


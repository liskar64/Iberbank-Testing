# language: es

  Característica: Login a la aplicacion bancaria fallido
  

    Esquema del escenario:Login fallido rellenando usuario y contraseñas incorrectas

     	Dado que me conecto a la aplicacion

    	Cuando introduzco el Usuario <login> y la Contraseña <pass>

    	Entonces sale mensaje de error y no podemos entrar

     Ejemplos:

		|login  |pass   |
		|"tryte"|"tryte"|
		|"tryte"|""     |
		|""     |"tryte"|
		|""     |""     |



    


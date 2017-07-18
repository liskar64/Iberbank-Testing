# language: es

  Característica: Login a la aplicacion bancaria fallido
  
    Antecedentes:
    dado que me conecte a la aplicacion

    Esquema del escenario:Login fallido rellenando usuario y contraseñas incorrectas

    	Cuando introduzco el Usuario <login> y la Contrasena <pass>

    	Entonces saldra mensaje de error y no podremos entrar

     Ejemplos:
		|login|pass|
		|"tryte"|"tryte"|
		|"tryte"|""|
		|""|"tryte"|
		|""|""|



    


# language: es

  Característica: Login a la aplicacion fallido
  

    Escenario:Login fallido rellenando usuario y contraseñas incorrectas

     	Dado que me conecto a la aplicacion

    	Cuando introduzco el Usuario "trytryte" y la Contraseña "trytryte"

    	Entonces sale mensaje de error y no podemos entrar



     Escenario:Login fallido dejando vacios ambos campos

   		 Dado que me conecto a la aplicacion

   		 Cuando introduzco el Usuario "" y la Contraseña ""

    	 Entonces sale mensaje de error y no podemos entrar


     Escenario:Login fallido rellenando el usuario y dejando vacia la contraseña

   		 Dado que me conecto a la aplicacion

   		 Cuando introduzco el Usuario "iber4" y la Contraseña ""

    	 Entonces sale mensaje de error y no podemos entrar


	 Escenario:Login fallido dejando en blanco el usuario y rellenando la contraseña

   		 Dado que me conecto a la aplicacion

   		 Cuando introduzco el Usuario "" y la Contraseña "iber4"

    	 Entonces sale mensaje de error y no podemos entrar
    
    


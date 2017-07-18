# language: es

Característica: Autentificacion en la aplicacion para simular transferencia

	Antecedentes:
	Dado que me conecte a la aplicacion

     Esquema del escenario: entro en la aplicacion y navego hasta la pantalla de autentificacion de transferencia

		 Cuando introduzco el Usuario <login> y la Contrasena <pass>

	     Cuando navego hasta la pantalla de simulacion de transferencia

		 Cuando pulso el botón de simulacion de transferencia

		 Entonces se abre la pantalla de simulación de transferencia

		 Ejemplos:
			 |login|pass|
			 |"iber4"|"iber4"|

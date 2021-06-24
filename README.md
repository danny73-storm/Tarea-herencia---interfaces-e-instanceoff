# Tarea-herencia---interfaces-e-instanceoff
Ejercicios relacionado a la herencia con interfaces

#Especificaciones

Se le solicita desarrollar un programa en java con los requerimientos:

-Debe de implementar una clase abstracta
-Debe implementar interfaces
-Debe implementar herencia

Debe de generar un Array (puede utilizar ArrayList) de 20 vehiculos.  

Los vehículos en general tienen:
-Combustible: diesel o gasolina
-Cantidad de galones de combustible
-Cantidad de pasajeros
-velocidad máxima
-Aceleración base: double que define la aceleración.

Los vehículos en general pueden girar a la derecha y a la izquierda ( interfaz)

Hay tres tipos de vehículos: (los comportamientos tratarlos como interfaces)
-De carga: estos tienen la capacidad de transportar material.
-De carrera: estos tienen turbo y pueden triplicar la aceleración establecida
-Camionetas: permiten transportar personas.

Una vez generado el array de los vehículos debe generar un método que tenga como parámetro un objeto de la clase
vehículo, el objetivo de este método es que pueda definir utilizando instanceof que tipo de vehículo es, si puede hacer
una carrera o es de carga o es una camioneta

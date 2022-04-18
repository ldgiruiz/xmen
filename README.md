# xmen
Prueba Tecnica Mercado Libre

# lenguajes o tecnologias
- Lenguaje Java 8 
- Framework SpringBoot
- Base de Datos Mysql 5
- Servidor web Tomcat
- Servidor EC2 de AWS

# Instrucciones de ejecución
Se debe contar con una base de datos en Mysql llamada "Mutantes", al ejecutar el framework este generará la estructura necesaria para el almacenamiento de los datos, alli mediante el IDE "Spring tool suite 4" se encuentra todos los elementos de manera integrada como lo es el tomcat y J Unit para las pruebas unitarias.

# Consumo de APIS

Para el consumo de APIS se entrega el collection mutantes.postman_collection.json el cual debe cargarse en un cliente POSTMAN para que nos permita consumir los siguientes metodos:

- Metodo para validar si un xmen es mutante 

  44.201.193.66:8080/xmen/mutantes/mutant
     
  {
  "dna": ["AAAA","TTTT","GTCA","GTGG"]
  }
  
  ![image](https://user-images.githubusercontent.com/103919740/163768759-86577278-1402-4380-83a2-cd594c9d5b6c.png)

  
- Metodo que entrega estadisticas de los humanos y mutantes

  44.201.193.66:8080/xmen/mutantes/stats/

![image](https://user-images.githubusercontent.com/103919740/163768704-5bac6433-8b31-41cb-9863-61a12a694371.png)


- Metodo (opcional) que lista todo el historico de validacion de mutantes

  44.201.193.66:8080/xmen/mutantes/list/

![image](https://user-images.githubusercontent.com/103919740/163768809-80100795-87e3-4096-b695-b037d991a29e.png)


# Pruebas automatizadas

Se hizo uso de JUnit ya que el mismo Framework proporciona este modulo para las pruebas unitarias, contando con los siguientes resultados

![image](https://user-images.githubusercontent.com/103919740/163768616-dcb9cf07-2742-4ac9-8496-fb4fb2b286d1.png)

# Pruebas de Carga o de Estres

Para las pruebas de carga o de estres se utilizo la herramienta Jmeter el cual las conexiones basadas en hilos permite realizar la cantidad de peticiones necesarias, en esta prueba fueron hilos de 100 por segundo

![image](https://user-images.githubusercontent.com/103919740/163770217-dd15c2e9-d9dd-4802-8e70-3bc26c4c4dd7.png)

![image](https://user-images.githubusercontent.com/103919740/163770273-63586e39-cbdb-49d0-b584-7d28a21f5f6f.png)

Asi es como finaliza la prueba tecnica dando cumplimiento a lo requerido.

# Desarrollado por Luis David Gil Ruiz - Cualquier duda no dude en contactarme al 3116112180


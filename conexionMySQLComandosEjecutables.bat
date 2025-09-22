
@echo off
echo  Compilando el archivo Java...
javac -cp "Connector_MySQL\mysql-connector-j-9.4.0.jar" ConexionMySQL.java

echo  Ejecutando el programa...
java -cp ".;Connector_MySQL\mysql-connector-j-9.4.0.jar" ConexionMySQL

echo  Programa finalizado.
pause
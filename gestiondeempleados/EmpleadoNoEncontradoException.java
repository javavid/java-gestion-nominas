package gestiondeempleados;

public class EmpleadoNoEncontradoException extends Exception {
    
    private String noEncontrado;

    public EmpleadoNoEncontradoException(String noencontrado) {
        this.noEncontrado = noencontrado;
    }

    @Override
    public String toString() {
        return " Empleado Con  Cedula " + noEncontrado + " No Existe ";
    }

    
}

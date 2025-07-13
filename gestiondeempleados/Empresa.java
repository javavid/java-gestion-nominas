package gestiondeempleados;

import java.util.ArrayList;



public class Empresa {
    
    private ArrayList<Empleado> empleado;
    

    public Empresa() {
        
        this.empleado = (empleado != null) ? new ArrayList<>(empleado) : new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    

    public void agregarEmpleado(Empleado empleado)
    {

        if (empleado != null) { 

            this.empleado.add(empleado); 
    
        }
}

    public void eliminirEmpleado(String busquedaCc) throws EmpleadoNoEncontradoException
    {
        for(int i = 0; i < empleado.size(); i++) {
            Empleado emple = empleado.get(i);
            if (emple.getCedula().equals(busquedaCc)) {
                this.empleado.remove(i);
                return ;
                
            }
            
        }
        
        throw new EmpleadoNoEncontradoException(busquedaCc);

    }

    

}

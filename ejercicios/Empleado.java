package ejercicios;
public class Empleado {
    
        private String nombre;
        private int antiguedad;
        private double sueldo;
        private double aumento;
        


        



        public Empleado() {
            
            
        }
        


        public String getNombre() {
            return nombre;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        public int getAntiguedad() {
            return antiguedad;
        }


        public void setAntiguedad(int antiguedad) {
            this.antiguedad = antiguedad;
        }


        public double getSueldo() {
            return sueldo;
        }


        public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
        }

        public double getAumento() {
            return aumento;
        }


        public void setAumento(double aumento) {
            this.aumento = aumento;
        }


        public void nivelAntiguedad()
        {
            if (antiguedad < 0) this.antiguedad = 0;

            if (antiguedad <= 3)
            {
                System.out.println("Antiguedad:  Principiante");
            }
            else if (antiguedad > 3 && antiguedad < 18)
        {
            System.out.println("Antiguedad: Intermedio");
        }
        else if (antiguedad > 18)
        {
            System.out.println("Antiguedad: Senior");
        }
        }

        public String toString()
        {
            return 
            "NOMBRE: " + nombre + 
            "\n ANTIGUEDAD: " + antiguedad + 
            "\n SUELDO: " + sueldo;
        }
        
        public double aumentoAntiguedad(double aumento)
        {
            double resultado = 0;
            if (sueldo < 0)this.sueldo = 0;
            if (sueldo <= 1000)
            {
                resultado = (aumento*sueldo)+sueldo;
                
            }
            else if (sueldo > 1000 && sueldo < 1800)
        {
            resultado = (aumento*sueldo)+sueldo;
                
        }
        else if (sueldo > 18)
        {
            resultado = (aumento*sueldo)+sueldo;
                
        }
        return resultado;
        }

        

        
    }


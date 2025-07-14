package gestiondeempleados;

public class PruebaGestionEmplados {
    public static void main(String[] args) {
        
        Empresa em = new Empresa();

        em.agregarEmpleado(new EmpleadoFijo("Ricardo", "montaño", "1234", 1450000));
        em.agregarEmpleado(new EmpleadoFijo("Marcela", "garces", "4321", 1444000));
        em.agregarEmpleado(new EmpleadoFijo("Pablo", "palmar", "5678", 1555000));

        for (Empleado emp : em.getEmpleado()) {
            System.out.println(" ");
            System.out.println(emp);
        }

        try {
            em.eliminirEmpleado("1122");
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("\n Error " + e);
        }
        
    }
}

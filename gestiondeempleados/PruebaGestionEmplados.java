package gestiondeempleados;

public class PruebaGestionEmplados {
    public static void main(String[] args) {
        
        Empresa em = new Empresa();

        em.agregarEmpleado(new EmpleadoFijo("Ricardo", "montaño", "1234", 1450000, 1450000));
        em.agregarEmpleado(new EmpleadoFijo("Marcela", "garces", "4321", 1444000, 1444000));
        em.agregarEmpleado(new EmpleadoFijo("Pablo", "palmar", "5678", 1555000, 1555000));

        try {
            em.eliminirEmpleado("1234");
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println("Error " + e);
        }
        for (Empleado emp : em.getEmpleado()) {
            System.out.println(" ");
            System.out.println(emp);
        }
    }
}

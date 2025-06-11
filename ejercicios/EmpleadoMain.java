package ejercicios;
public class EmpleadoMain {
    public static void main(String[] args) {
        
        Empleado ep1 = new Empleado();

        System.out.println("Empleado 1");
        ep1.setNombre("Andres");
        ep1.setAntiguedad(4);
        ep1.setSueldo(3000);
        System.out.println( ep1.toString());
        ep1.nivelAntiguedad();
        System.out.println("Aumento: " + ep1.aumentoAntiguedad(0.15));
        System.out.println(" ");



        Empleado ep2 = new Empleado();
        
        System.out.println("Empleado 2");
        ep2.setNombre("Andrea");
        ep2.setAntiguedad(12);
        ep2.setSueldo(900);
        System.out.println( ep2.toString());
        ep1.nivelAntiguedad();
        System.out.println("Aumento: " + ep2.aumentoAntiguedad(0.15));
    }
}

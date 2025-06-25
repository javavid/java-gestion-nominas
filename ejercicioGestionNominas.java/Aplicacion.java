
public class Aplicacion {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(315636942, "safato");
        
        empresa.agregarTrabajador(new Analista("fernando", 1039545302, 1000000, "Analista"));
        empresa.agregarTrabajador(new Analista("sharyt", 1039545203, 5355000, "Analista"));

        empresa.agregarTrabajador(new Programador("luisa", 2047642595, 4000000, "ingeniera"));
        empresa.agregarTrabajador(new Programador("tany", 23485678, 40000000, "ingeniera"));

        empresa.agregarTrabajador(new Administrativo("lau", 18376452, 4000000, 7));
        empresa.agregarTrabajador(new Administrativo("pedro", 98765345, 4555000, 3));

        empresa.agregarTrabajador(new Auxiliar("tato", 1286534, 4444000, 4));
        empresa.agregarTrabajador(new Auxiliar("cami", 283949584, 3976000, 7));

        for (Trabajador trabajador : empresa.getJob()) {
            System.out.println(trabajador);
        }
    }
}

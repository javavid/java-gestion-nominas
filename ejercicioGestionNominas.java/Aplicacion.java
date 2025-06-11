
public class Aplicacion {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(315636942, "safato");
        empresa.agregarTrabajador(new Analista("fernando", 1039545302, 1000000, 2000000));
    }
}

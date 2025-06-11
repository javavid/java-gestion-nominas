import java.util.ArrayList;

public class Empresa {

    private int nit;
    private String nameEmpresa;
    private ArrayList<Trabajador>job;
    public Empresa(int nit, String nameEmpresa, ArrayList<Trabajador> job) {
        this.nit = nit;
        this.nameEmpresa = nameEmpresa;
        // Inicializa la lista de trabajadores, evitando errores por valores nulos
        this.job = (job != null) ? new ArrayList<>(job) : new ArrayList<>();

    }
    public int getNit() {
        return nit;
    }
    public void setNit(int nit) {
        this.nit = nit;
    }
    public String getNameEmpresa() {
        return nameEmpresa;
    }
    public void setNameEmpresa(String nameEmpresa) {
        this.nameEmpresa = nameEmpresa;
    }
    public ArrayList<Trabajador> getJob() {
        return job;
    }
    public void setJob(ArrayList<Trabajador> job) {
        this.job = job;
    }

    // De esta manera no devolvera una lista ya que solo la utilizaremos para agregar. 
    public void agregarTrabajador(Trabajador job)
    {
        if (job != null) { // Verifica que el trabajador no sea null para evitar errores

            this.job.add(job); // Agrega el trabajador a la lista
    
        }

        // Ejemplo para devolver una lista completa.
       /*  public ArrayList<Trabajador> agregarTrabajador(Trabajador job) {
    if (job != null) {
        this.job.add(job);
    }
    return this.job;  // Devuelve la lista con los trabajadores actualizados.
}*/

    }
}
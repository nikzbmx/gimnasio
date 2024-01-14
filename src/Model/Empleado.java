package Model;

public class Empleado extends Persona {
    private Empleado empleados [] = new Empleado[4];
    private int id;
    private long salario, totalPagar;
    private long totalNomina=0;
    private long totalPagos=0;

    public Empleado() {
    }

    public Empleado(int id, long salario, long totalPagar) {
        this.id = id;
        this.salario = salario;
        this.totalPagar = totalPagar;
    }

    public Empleado(int id, long salario, long totalPagar, String nombre, int edad) {
        super(nombre, edad);
        this.id = id;
        this.salario = salario;
        this.totalPagar = totalPagar;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public long getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(long totalPagar) {
        this.totalPagar = totalPagar;
    }

    public long getTotalNomina() {
        return totalNomina;
    }

    public void setTotalNomina(long totalNomina) {
        this.totalNomina = totalNomina;
    }

    public long getTotalPagos() {
        return totalPagos;
    }

    public void setTotalPagos(long totalPagos) {
        this.totalPagos = totalPagos;
    }

  
    @Override
    public String toString() {
        return "Empleado{" + "empleados=" + empleados + ", id=" + id + ", salario=" + salario + ", totalPagar=" + totalPagar + ", totalNomina=" + totalNomina + ", totalPagos=" + totalPagos + '}';
    }

   
}

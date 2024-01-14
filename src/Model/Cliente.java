package Model;

import java.util.ArrayList;

public class Cliente extends Persona {
    private int idUsuario;
    private int precioM;
    private ArrayList<Administracion> programacion = new ArrayList<Administracion>();
    private ArrayList<Cliente> cantidad = new ArrayList<Cliente>();
    private long totalPagos=0;

    public Cliente() {
    }

    public Cliente(int idUsuario, int precioM) {
        this.idUsuario = idUsuario;
        this.precioM = precioM;
    }

    public Cliente(int idUsuario, int precioM, String nombre, int edad) {
        super(nombre, edad);
        this.idUsuario = idUsuario;
        this.precioM = precioM;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getPrecioM() {
        return precioM;
    }

    public void setPrecioM(int precioM) {
        this.precioM = precioM;
    }

    public ArrayList<Administracion> getProgramacion() {
        return programacion;
    }

    public void setProgramacion(ArrayList<Administracion> programacion) {
        this.programacion = programacion;
    }

    public ArrayList<Cliente> getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList<Cliente> cantidad) {
        this.cantidad = cantidad;
    }

    public long getTotalPagos() {
        return totalPagos;
    }

    public void setTotalPagos(long totalPagos) {
        this.totalPagos = totalPagos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idUsuario=" + idUsuario + ", precioM=" + precioM + ", programacion=" + programacion + ", cantidad=" + cantidad + ", totalPagos=" + totalPagos + '}';
    }
    
    
}

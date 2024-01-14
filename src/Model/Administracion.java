package Model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Administracion {
     public String dia;
     public int hora;
     public String nombreE;
     public String nombreC;

    public Administracion() {
    }

    public Administracion(String dia, int hora, String nombreE, String nombreC) {
        this.dia = dia;
        this.hora = hora;
        this.nombreE = nombreE;
        this.nombreC = nombreC;
    }

    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public String toString() {
        return "Administracion{" + "dia=" + dia + ", hora=" + hora + ", nombreE=" + nombreE + ", nombreC=" + nombreC + '}';
    }

     
    
}
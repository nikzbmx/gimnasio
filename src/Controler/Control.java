package Controler;

import Model.Administracion;
import Model.Cliente;
import Model.Empleado;
import View.Ventana;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Control {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

   public void mostrarOpcion() {
        ArrayList<Administracion> programacion = new ArrayList<Administracion>();
        byte opc = 1;
        do{ 
            
            opc = mostrarMenu();
            switch (opc) {
            case 1:
                 consultaProgramacion();
                break;
            case 2:
                 registrarNuevoUsuario();
                break;
            case 3:
                 consultarTiposPlanes();
                break;
            case 4:
                 consultarBaseDatosClientes();
                break;
            case 5:
                 consultarBaseDatosEmpleados();
                break;
            case 6:
                mostrarBalance();
                break;
            case 7:
JOptionPane.showMessageDialog(null, "Ha salido del programa");
                break;
        }
}while(opc!=7);
        }

    
    public byte mostrarMenu() {
        
        byte opc= Byte.parseByte(JOptionPane.showInputDialog( "Lea cada una de las opciones y seleccione la opcion que desea realizar"
                + "\n 1. Consultar Programacion clases dirigidas"
                + "\n 2. Registrar nuevo usuario "
                + "\n 3. Consultar tipos de planes"
                + "\n 4. Consultar base de datos clientes "
                + "\n 5. Consultar base de datos empleados "
                + "\n 6. Balance de dinero ingresado al gimnasio"
                + "\n 7. Salir"));
 return opc;
    
    }

//  crea arraylist de programacion de sesiones
    
   private void consultaProgramacion() {
        ArrayList<Administracion> programacion = new ArrayList<Administracion>();
         programacion.add(new Administracion("lunes", 7,"Juan","Lumbar"));
         programacion.add(new Administracion("martes", 8,"Andres","Pierna"));
         programacion.add(new Administracion("miercoles", 6,"Valentina","Crossfit"));
         programacion.add(new Administracion("jueves", 7,"Marcos","Brazo Killer"));
         programacion.add(new Administracion("viernes", 8,"Valentina","Crossfit"));
         programacion.add(new Administracion("sabado", 5,"Andres","Rumba"));
         String diaElegido = JOptionPane.showInputDialog("Ingrese el nombre de un dia de la semana a consultar clase");
        
            for (Administracion dia : programacion) {
            if (dia.getDia().equalsIgnoreCase(diaElegido)) {
                JOptionPane.showMessageDialog(null,"La clase del dia " + diaElegido + " es de " + dia.getNombreC() + " con "+dia.getNombreE()+" a las "+dia.getHora()+"pm");
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"DÃ­a no vÃ¡lido. Por favor, ingrese un dÃ­a de la semana vÃ¡lido");
   }


    private void registrarNuevoUsuario() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del nuevo usuario:"));
        int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del nuevo usuario:"));
        int precioM = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio mensual del nuevo usuario:"));

Cliente nuevoCliente = new Cliente(idUsuario, precioM, nombre, edad);
        listaClientes.add(nuevoCliente);

        JOptionPane.showMessageDialog(null, "Nuevo usuario registrado:\n" + nuevoCliente.toString());
    }

    private void consultarTiposPlanes() {
        
    }

    private void consultarBaseDatosClientes() {
        if (listaClientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La base de datos de clientes está vacía.");
        } else {
            StringBuilder mensaje = new StringBuilder("Base de datos de clientes:\n");
            for (Cliente cliente : listaClientes) {
                mensaje.append(cliente.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null,mensaje.toString());
        }
 }

    private void consultarBaseDatosEmpleados() {
        if (listaEmpleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La base de datos de empleados está vacía.");
        } else {
            StringBuilder mensaje = new StringBuilder("Base de datos de empleados:\n");
            for (Empleado empleado : listaEmpleados) {
                mensaje.append(empleado.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }
    }
private void mostrarBalance() {
        long totalIngresos = calcularTotalIngresos();
        long totalGastos = calcularTotalGastos();
        long balance = totalIngresos - totalGastos;
        JOptionPane.showMessageDialog(null, "Balance del gimnasio: $" + balance);
    }

    private long calcularTotalIngresos() {
        long totalIngresos = 0;
        for (Cliente cliente : listaClientes) {
            totalIngresos += cliente.getTotalPagos();
        }
        return totalIngresos;
    }

    private long calcularTotalGastos() {
        long totalGastos = 0;
        for (Empleado empleado : listaEmpleados) {
            totalGastos += empleado.getTotalPagos();

 }
        return totalGastos;
}
}


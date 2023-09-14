package grupo.electronicos;
import javax.swing.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private ArrayList<Equipo> equipos;

    public Main() {
        equipos = new ArrayList<>();
    }

    public void registrarEquipo() {
        int tipoEquipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de equipo \n" +
                "1.Desktop \n" +
                "2.Laptop \n" +
                "3.Tablet \n"));

        if (tipoEquipo==1) {
            String fabricante = JOptionPane.showInputDialog("Fabricante:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
            String memoria = JOptionPane.showInputDialog("Memoria:");
            String tarjetaGrafica = JOptionPane.showInputDialog("Tarjeta gráfica:");
            String tamanoTorre = JOptionPane.showInputDialog("Tamaño de torre:");
            String capacidadDiscoDuro = JOptionPane.showInputDialog("Capacidad de disco duro:");

            Desktop desktop = new Desktop(fabricante, modelo, microprocesador, memoria, tarjetaGrafica,
                    tamanoTorre, capacidadDiscoDuro);
            equipos.add(desktop);
            JOptionPane.showMessageDialog(null, "Equipo registrado correctamente.");
        } else if (tipoEquipo==2) {
            String fabricante = JOptionPane.showInputDialog("Fabricante:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
            String memoria = JOptionPane.showInputDialog("Memoria:");
            String Tamanio_pantalla=JOptionPane.showInputDialog("Tamaño de pantalla:");
            String capacidadDiscoDuro = JOptionPane.showInputDialog("Capacidad de disco duro:");
            Laptop laptop= new Laptop(fabricante,modelo,microprocesador,memoria,Tamanio_pantalla,capacidadDiscoDuro);
            equipos.add(laptop);
            JOptionPane.showMessageDialog(null, "Equipo registrado correctamente.");
        } else if (tipoEquipo==3) {
            String fabricante = JOptionPane.showInputDialog("Fabricante:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            String microprocesador = JOptionPane.showInputDialog("Microprocesador:");
            String TamanioDiagonal= JOptionPane.showInputDialog("Tamaño diagonal");
            String Capacitiva_resistiva= JOptionPane.showInputDialog("Capacitiva o resistiva?");
            String NAND= JOptionPane.showInputDialog("Tamaño de NAND ");
            String SO= JOptionPane.showInputDialog("Sistema Operativo: ");
            Tablet tablet= new Tablet(fabricante,modelo,microprocesador,TamanioDiagonal,Capacitiva_resistiva,NAND,SO);
            equipos.add(tablet);
            JOptionPane.showMessageDialog(null, "Equipo registrado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de equipo inválido.");
        }
    }

    public void mostrarEquiposRegistrados() {
        StringBuilder sb = new StringBuilder();

        for (Equipo aparatos : equipos) {
            sb.append(aparatos.toString());
            sb.append("\n\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }


    public static void main(String[] args) {
        Main registro = new Main ();

        int opcion = 0;
        while (opcion != 3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Registrar equipo\n" +
                    "2. Mostrar equipos registrados\n" +
                    "3. Salir"));

            switch (opcion) {
                case 1:
                    registro.registrarEquipo();
                    break;
                case 2:
                    int opcionMostrar = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" +
                            "1. Mostrar todos los equipos\n"));
                    if (opcionMostrar == 1) {
                        registro.mostrarEquiposRegistrados();
                    } else {
                        JOptionPane.showMessageDialog(null, "Opción inválida.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Hasta luego.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    break;
            }
        }
    }
}
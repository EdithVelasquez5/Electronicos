package grupo.electronicos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

// Clase base Equipo
class Equipo {
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;

    public Equipo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMicroprocesador() {
        return microprocesador;
    }

    public String toString() {
        return "Fabricante: " + fabricante + "\nModelo: " + modelo + "\nMicroprocesador: " + microprocesador;
    }
}
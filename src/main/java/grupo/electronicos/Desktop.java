package grupo.electronicos;

class Desktop extends Equipo {
    private String memoria;
    private String tarjetaGrafica;
    private String tamanoTorre;
    private String capacidadDiscoDuro;

    public Desktop(String fabricante, String modelo, String microprocesador, String memoria, String tarjetaGrafica,
                   String tamanoTorre, String capacidadDiscoDuro) {
        super(fabricante, modelo, microprocesador);
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanoTorre = tamanoTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public String getTamanoTorre() {
        return tamanoTorre;
    }

    public String getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public String toString() {
        return super.toString() + "\nMemoria: " + memoria + "\nTarjeta gráfica: " + tarjetaGrafica +
                "\nTamaño de torre: " + tamanoTorre + "\nCapacidad de disco duro: " + capacidadDiscoDuro;
    }
}
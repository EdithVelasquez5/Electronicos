package grupo.electronicos;

class Tablet extends Equipo {
    private String tamañoPantalla;
    private String tipoPantalla;
    private String tamañoMemoriaNAND;
    private String sistemaOperativo;

    public Tablet(String fabricante, String modelo, String microprocesador, String tamañoPantalla, String tipoPantalla,
                  String tamañoMemoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador);
        this.tamañoPantalla = tamañoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.tamañoMemoriaNAND = tamañoMemoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public String getTamañoMemoriaNAND() {
        return tamañoMemoriaNAND;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String toString() {
        return super.toString() + "\nTamaño de pantalla: " + tamañoPantalla + "\nTipo de pantalla: " + tipoPantalla +
                "\nTamaño de memoria NAND: " + tamañoMemoriaNAND + "\nSistema operativo: " + sistemaOperativo;
    }
}
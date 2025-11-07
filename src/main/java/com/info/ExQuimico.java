package com.info;

public class ExQuimico extends Experimentos {
    private  String tipoReactivo;





//constructor
    public ExQuimico(
                     String NOmbreExperimento,
                     double minutos,
                     boolean resultado,
                     String tipoReactivo) {
        super( NOmbreExperimento, minutos, resultado);
        this.tipoReactivo = tipoReactivo;
    }
//metodos  get and set
    public String getTipoReactivo() {
        return tipoReactivo;
    }

    public void setTipoReactivo(String tipoReactivo) {
        this.tipoReactivo = tipoReactivo;
    }
}

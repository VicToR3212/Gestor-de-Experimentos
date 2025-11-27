package com.info.experimentos;

public class ExQuimico extends Experimentos {
    private  String tipoReactivo;


    /**
     * constructor de la clase
     *
     * @param NOmbreExperimento String representa el nombre del experimento
     * @param minutos           Double parametro para duracion del experimento
     * @param resultado         bulean el resultado del experimento
     * @param tipoReactivo      String tipo de ractivo quimico utilizado
     */


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

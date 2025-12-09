package com.info.dominio.experimentos;

public class ExperimentosQuimico extends Experimentos {
    private  String tipoReactivo;


    /**
     * constructor de la clase
     *
     * @param nombreExperimento String representa el nombre del experimento
     * @param minutos           Double parametro para duracion del experimento
     * @param resultado         bulean el resultado del experimento
     * @param tipoReactivo      String tipo de ractivo quimico utilizado
     */


//constructor
    public ExperimentosQuimico(
                     String nombreExperimento,
                     double minutos,
                     boolean resultado,
                     String tipoReactivo) {
        super( nombreExperimento, minutos, resultado);
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

package com.info.dominio.experimentos;

public class Experimentos  {
    private String nombreExperimento;
    private double minutos;
    private boolean resultado;

    /**
     * constructor de la clase
     *
     * @param nombreExperimento String representa el nombre del experimento
     * @param minutos           Double parametro para duracion del experimento
     * @param resultado         bulean el resultado del experimento
     */

    public Experimentos( String nombreExperimento, double minutos, boolean resultado) {

        this.nombreExperimento = nombreExperimento;
        this.minutos = minutos;
        this.resultado = resultado;
    }
// metods get and set
    public String getNombreExperimento() {
        return nombreExperimento;
    }


    public double getMinutos() {
        return minutos;
    }


    public boolean getisResultado() {
        return resultado;
    }

}

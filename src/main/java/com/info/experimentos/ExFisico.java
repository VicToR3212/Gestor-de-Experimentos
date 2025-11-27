package com.info.experimentos;

public class ExFisico extends Experimentos {

    /**
     * constructor de la clase
     *
     * @param nombreExperimento String representa el nombre del experimento
     * @param minutos           Double parametro para duracion del experimento
     * @param resultado         bulean el resultado del experimento
     * @param medior            String tipo de instrumento de medicion
     */

    public ExFisico(
                    String nombreExperimento,
                    double minutos,
                    boolean resultado,
                    String medior) {
        super(nombreExperimento, minutos, resultado);

    }

}

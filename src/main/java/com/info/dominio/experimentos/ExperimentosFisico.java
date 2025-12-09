package com.info.dominio.experimentos;

public class ExperimentosFisico extends Experimentos {




    /**
     * constructor de la clase
     *
     * @param nombreExperimento String representa el nombre del experimento
     * @param minutos           Double parametro para duracion del experimento
     * @param resultado         bulean el resultado del experimento
     * @param medidor            String tipo de instrumento de medicion
     */

    public ExperimentosFisico(
                    String nombreExperimento,
                    double minutos,
                    boolean resultado,
                    String medidor) {
        super(nombreExperimento, minutos, resultado);

    }

}

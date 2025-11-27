package com.info.service.busqueda;

import com.info.service.experimentos.implement.ExperimentosServiceImpl;

public interface IBusqueda {


    void mostrarListadoFisico(ExperimentosServiceImpl investigador);
    void resultadosExperimento(ExperimentosServiceImpl experimentosService);
    void mostrarExperimentoMayorTiempo(ExperimentosServiceImpl experimentosService);
}

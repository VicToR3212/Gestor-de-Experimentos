package com.info.service.busqueda;

import com.info.service.experimentos.implement.ExperimentosServiceImpl;
import com.info.service.investigador.implement.InvestigadorServiceImpl;

public interface IBusqueda {


    void mostrarListadoFisico(ExperimentosServiceImpl investigador);
    void resultadosExperimento(ExperimentosServiceImpl experimentosService);
    void mostrarExperimentoMayorTiempo(ExperimentosServiceImpl experimentosService);
    void  promedioProsentage(ExperimentosServiceImpl experimentosService);
    void investigadorMayorExperimentoReali(InvestigadorServiceImpl servisExperimentos);
}

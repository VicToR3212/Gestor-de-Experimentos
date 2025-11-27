package com.info.service.busqueda;

import com.info.service.experimentos.implement.ExperimentosService;

public interface Busqueda {


    void mostrarListadoFisico(ExperimentosService investi);
    void resultadosEx(ExperimentosService experimentosService);
    void mostrarexMayortiempo(ExperimentosService experimentosService);
}

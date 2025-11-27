package com.info.service.experimentos;

import com.info.dominio.experimentos.ExperimentosQuimico;
import com.info.service.investigador.implement.InvestigadorServiceImpl;

import java.util.ArrayList;

public interface ICreaValidaGuarda {

    /**
     * @param investigador recibe  es un objeto investigador
     *
     */

   void agregar(InvestigadorServiceImpl investigador);
    void crearExperimento(int var , InvestigadorServiceImpl investigador);
    void insertarInvestigador(InvestigadorServiceImpl c);





}

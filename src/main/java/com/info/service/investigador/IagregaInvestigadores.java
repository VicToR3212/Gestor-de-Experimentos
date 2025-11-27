package com.info.service.investigador;

import com.info.dominio.investigacion.Investigadores;
import com.info.service.investigador.implement.InvestigadorServiceImpl;

import java.util.ArrayList;

public interface IagregaInvestigadores {
    void agregar(InvestigadorServiceImpl servis);
    boolean sumaraInvestigador(int doc, InvestigadorServiceImpl investigadorServiceImpl);
    void colaboradores();


}

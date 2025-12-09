package com.info.service.investigador;

import com.info.service.investigador.implement.InvestigadorServiceImpl;

public interface IagregaInvestigadores {
    void agregar(InvestigadorServiceImpl servis);
    boolean sumaraInvestigador(int doc, InvestigadorServiceImpl investigadorServiceImpl);
    void colaboradores();


}

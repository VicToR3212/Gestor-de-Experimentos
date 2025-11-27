package com.info.service.almacenarCvs;

import com.info.service.investigador.implement.InvestigadorServiceImpl;

import java.io.IOException;

public interface ICrudCvsService {
    void guardarListaInvestigadores(InvestigadorServiceImpl investigador) throws IOException;
}


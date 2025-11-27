package com.info.service.almacenarCvs;

import com.info.service.experimentos.implement.InvestigadorService;

import java.io.IOException;

public interface AlmacenadoCvs {
    void guardarListaInves(InvestigadorService investi) throws IOException;
}


package com.evidencia.evidencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosIMC implements ImcService {
      @Autowired
    private RepositorioIMC repositorioIMC;

    @Override
    public void guardarRegistroIMC(RegistroIMC registroIMC) {
        repositorioIMC.saveAll(registroIMC);
    }

    @Override
    public List<RegistroIMC> obtenerHistorialIMC() {
        return repositorioIMC.findAll();
    }
}

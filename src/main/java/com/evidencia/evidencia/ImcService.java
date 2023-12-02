package com.evidencia.evidencia;

import java.util.List;

public interface ImcService {
    void guardarRegistroIMC(RegistroIMC registroIMC);
    List<RegistroIMC> obtenerHistorialIMC();
}

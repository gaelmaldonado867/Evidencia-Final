package com.evidencia.evidencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IMCControlador {
    @Autowired
    private ImcService imcService;
    @GetMapping("/calcularimc")
    public String mostrarFormulario(Model model){
        model.addAttribute("registro", new RegistroIMC());
        return "calcularimc";
    }
    @PostMapping("/calcularimc")
    public String procesarFormularioCalculoIMC(@ModelAttribute RegistroIMC registroIMC, Model model) {
        double imc = calcularIMC(registroIMC.getPeso(), registroIMC.getEstatura());
        registroIMC.setImc(imc);
        imcService.guardarRegistroIMC(registroIMC);
        return "redirect:/historial";
    }

   @GetMapping("/historial")
    public String mostrarHistorialIMC(Model model) {
        List<RegistroIMC> historialIMC = imcService.obtenerHistorialIMC();
        model.addAttribute("historialIMC", historialIMC);
        return "historial-imc";
    }

    private double calcularIMC(double peso, double estatura) {
        if (estatura > 0) {
            return peso / (estatura * estatura);
        } else {
            return 0.0;
        }
    }
}
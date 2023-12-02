package com.evidencia.evidencia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioControlador {
    @GetMapping("/registro")
    public String mostrarRegistro(Model model){
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }
}

package co.edu.unbosque.controller;

import co.edu.unbosque.model.AgenciaDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class BancariaController {
    @Autowired
    private AgenciaDAO agencia;
    @GetMapping("/")
    public String downloadAgencies(Model model) {
        log.info("Iniciando REST");
        var agencias = agencia.findAll();
        model.addAttribute("agencias", agencias);
        return "index";
    }
}

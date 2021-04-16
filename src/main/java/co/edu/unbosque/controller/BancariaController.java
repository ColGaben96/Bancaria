package co.edu.unbosque.controller;

import co.edu.unbosque.model.AgenciaDAO;
import co.edu.unbosque.model.persistence.AgenciaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
@Slf4j
public class BancariaController {
    @Autowired
    private AgenciaDAO agencia;
    @GetMapping("/")
    public String bancaria(Model model) {
        log.info("Iniciando REST");
        var agencias = (ArrayList<AgenciaDTO>) agencia.findAll();
        log.info("Agencias: "+agencias.size());
        model.addAttribute("agencias", agencias);
        return "index";
    }
}

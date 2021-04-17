package co.edu.unbosque.controller;

import co.edu.unbosque.service.AgenciaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class BancariaController {
    @Autowired
    private AgenciaService agencia;
    @GetMapping("/")
    public String downloadAgencies(Model model) {
        var agencias = agencia.listAgencias();
        log.info("Agencias: "+agencias.size());
        model.addAttribute("agencias", agencias);
        return "index";
    }

    @GetMapping("/agenciesManager")
    public String getAgenciesList(Model model) {
        var agencias = agencia.listAgencias();
        model.addAttribute("agencias", agencias);
        return "agenciesManager";
    }
}

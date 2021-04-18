package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.AgenciaDTO;
import lombok.extern.slf4j.Slf4j;
import co.edu.unbosque.model.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class BancariaController {
    @Autowired
    private AgenciaService agencia;
    @GetMapping ("/")
    public String downloadAgencies(Model model) {
        var agencias = agencia.listAgencias();
        log.info("Agencias: "+agencias.size());
        model.addAttribute("agencias", agencias);
        return "index";
    }

    @GetMapping("/newAgency")
    public String addAgency(AgenciaDTO agencia) {
        return "newAgency";
    }

    @PostMapping("/saveAgency")
    public String saveAgency(AgenciaDTO agencia) {
        this.agencia.save(agencia);
        return "redirect:/";
    }

    @GetMapping("/agenciesManager")
    public String getAllAgencies(Model model) {
        var agencias = agencia.listAgencias();
        model.addAttribute("agencias", agencias);
        return "agenciesManager";
    }
}

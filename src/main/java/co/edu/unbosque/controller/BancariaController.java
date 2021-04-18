package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.AgenciaDTO;
import lombok.extern.slf4j.Slf4j;
import co.edu.unbosque.model.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Controller Class where Bancaria takes control from responses. Doesn't matter the type of method (if it is a get or post). Just will work
 */
@Controller
@Slf4j
public class BancariaController {
    @Autowired
    private AgenciaService agencia;

    /**
     * @author Gabriel Blanco
     * Method to download the employees data according to the agencies. This will show on the main page.
     * @param model
     * @return
     */
    @GetMapping ("/")
    public String downloadWholeData(Model model) {
        var agencias = agencia.listAgencias();
        log.info("Agencias: "+agencias.size());
        model.addAttribute("agencias", agencias);
        return "index";
    }

    /**
     * @author Gabriel Blanco
     * Method to add a new agency
     * @param agencia
     * @return
     */
    @GetMapping("/newAgency")
    public String addAgency(AgenciaDTO agencia) {
        return "newAgency";
    }

    /**
     * @author Gabriel Blanco
     * Method to save an agency
     * @param agencia
     * @return
     */
    @PostMapping("/saveAgency")
    public String saveAgency(AgenciaDTO agencia) {
        this.agencia.save(agencia);
        return "redirect:/";
    }

    /**
     * @author Gabriel Blanco
     * Method to download the agencies
     * @param model
     * @return
     */
    @GetMapping("/agenciesManager")
    public String getAllAgencies(Model model) {
        var agencias = agencia.listAgencias();
        model.addAttribute("agencias", agencias);
        return "agenciesManager";
    }
}

package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.AgenciaDTO;
import co.edu.unbosque.model.persistence.ContratoDTO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import co.edu.unbosque.model.service.*;
import lombok.extern.slf4j.Slf4j;
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
    @Autowired
    private EmpleadoService empleado;
    @Autowired
    private PrestamoService prestamo;
    @Autowired
    private TituloAcademicoService titulo;
    @Autowired
    private ContratoService contrato;
    @Autowired
    private SindicatoService sindicato;
    @Autowired
    private TipoContratoService tipo_contrato;

    /**
     * @author Gabriel Blanco
     * Method to download the employees data according to the agencies. This will show on the main page.
     * @param model
     * @return
     */
    @GetMapping ("/")
    public String downloadWholeData(Model model) {
        var agencias = agencia.listAgencias();
        var empleados = empleado.listEmpleados();
        log.info("Agencias: "+agencias.size());
        model.addAttribute("agencias", agencias);
        model.addAttribute("empleados", empleados);
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

    /**
     * @author Gabriel Blanco
     * Method to download agencies and create a new employee
     * @param empleado
     * @param model
     * @return
     */
    @GetMapping("/newEmployee")
    public String addEmployee(EmpleadoDTO empleado, Model model) {
        var agencias = agencia.listAgencias();
        var vacantes = contrato.listContratos();
        model.addAttribute("vacantes", vacantes);
        model.addAttribute("agencias", agencias);
        return "newEmployee";
    }

    /**
     * @author Gabriel Blanco
     * Method to save an employee in db
     * @param empleado
     * @return
     */
    @PostMapping("/saveEmployee")
    public String saveEmployee(EmpleadoDTO empleado) {
        this.empleado.save(empleado);
        return "redirect:/";
    }

    @GetMapping("/newVacant")
    public String newVacant(ContratoDTO contrato, Model model) {
        var tipos_contrato = tipo_contrato.listTipoContrato();
        model.addAttribute("tipos_contrato", tipos_contrato);
        return "newVacant";
    }

    @PostMapping("/saveContract")
    public String saveVacant(ContratoDTO contrato) {
        this.contrato.save(contrato);
        return "redirect:/";
    }
}

package co.edu.unbosque.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class BancariaExceptionHandler implements ErrorController {

    @ExceptionHandler({Exception.class})
    @GetMapping("500")
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public String error500(Model model) {
        model.addAttribute("errorCode", 500);
        model.addAttribute("errorStack", new Exception().getMessage() + new Exception().getCause().toString());
        return "errorPage";
    }
    @GetMapping("404")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public String error404(Model model) {
        model.addAttribute("errorCode", 404);
        model.addAttribute("errorStack", "Verifica la url e intenta nuevamente");
        return "errorPage";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}

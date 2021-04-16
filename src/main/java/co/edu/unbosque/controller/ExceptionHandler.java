package co.edu.unbosque.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class ExceptionHandler implements ErrorController {
    @GetMapping("/error")
    public String serverError() {
        return "500";
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}

package br.com.jadson.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CountryRepository repository;

    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {
        var serverName = request.getServerName();
        model.addAttribute("countries", repository.findAll());
        return "home";
    }
}

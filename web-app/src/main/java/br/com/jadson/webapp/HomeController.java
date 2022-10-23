package br.com.jadson.webapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {
        var serverName = request.getServerName();
        model.addAttribute("serverName", serverName);
        return "home";
    }
}

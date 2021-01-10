package pl.sda.SpringSecuritySda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String mainPage(){
        return "Welcome Main";
    }

    @GetMapping("/admin")
    public String adminPanel(){
        return "Admin Panel";
    }

    @GetMapping("/user")
    public String userPanel(){
        return "User Panel";
    }

}

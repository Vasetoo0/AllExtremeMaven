package softuni.javaweb.springproject.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, HttpSession httpSession) {

        if (httpSession.getAttribute("selectedSport") != null) {
            httpSession.removeAttribute("selectedSport");
        }

        return "home";
    }
}

package MLH.Hackathon.REST;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE}, method = {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class RESTController implements WebMvcConfigurer {

    @GetMapping( "/")
    public String showHomePage(Model model) {

        return "Main";
    }
//
//    @GetMapping( "/Landing")
//    public String showLandingPage() {
//        return "Landing";
//    }


}
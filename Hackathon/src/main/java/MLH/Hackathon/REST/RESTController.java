package MLH.Hackathon.REST;


import MLH.Hackathon.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.sql.Connection;
import java.sql.DriverManager;

@Controller
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE}, method = {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class RESTController implements WebMvcConfigurer {

    @GetMapping( "/")
    public String showHomePage(Model model) {
//        Connection conn = null;
//        try
//        {
//
//            String url = "jdbc:mysql://172.105.101.99:3306/MLH";
//            Class.forName ("com.mysql.cj.jdbc.Driver");
//
//            conn = DriverManager.getConnection (url,"root","Hackathon1234");
//            model.addAttribute("open",true);
//            System.out.println ("Database connection established");
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//
//        }
//        finally
//        {
//            if (conn != null)
//            {
//                try
//                {
//                    conn.close ();
//                    model.addAttribute("closed",true);
//                    System.out.println ("Database connection terminated");
//                }
//                catch (Exception e) { /* ignore close errors */ }
//            }
//        }
        return "Main";
    }

    @GetMapping( "/Signup")
    public String showSignupPage(Model model) {
        model.addAttribute("user", new User());
        return "Signup";
    }


}
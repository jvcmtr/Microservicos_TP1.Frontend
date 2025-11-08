package edu.infnet.Joao_Ramos_TP1_Frontend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class FrontendController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${OlaService.url}")
    private String OlaServiceUrl;

    @GetMapping("/erro")
    public String error(Model model) {
        return "error";
    }

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(required = false) String lang) {
        String url = OlaServiceUrl + "/" + lang;
        model.addAttribute("hello", 
            restTemplate.getForObject(url, String.class)
        );

        return "hello";
    }
}
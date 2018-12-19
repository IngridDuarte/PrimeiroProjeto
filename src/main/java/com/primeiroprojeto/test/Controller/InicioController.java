package com.primeiroprojeto.test.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class InicioController {

    @RequestMapping("/")
    public String inicio(){
        return "Olá Mundo";
    }

}

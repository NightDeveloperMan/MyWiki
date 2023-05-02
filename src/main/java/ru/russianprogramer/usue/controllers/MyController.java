package ru.russianprogramer.usue.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MyController {

    @GetMapping("index")
    public String index(){
        return "mywiki/index";
    }

    @GetMapping("/reg")
    public String registration()
    {
        return "mywiki/registration";
    }


    @GetMapping("/author")
    public String autorisation()
    {
        return "mywiki/authorisation";
    }


    @GetMapping("/postCreate")
    public String createPost()
    {
        return "mywiki/postCreate";
    }





}

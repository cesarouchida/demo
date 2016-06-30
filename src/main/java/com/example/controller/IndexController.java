package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Transactional
public class IndexController {

    @Autowired
    private ContatoDAO dao;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/index")
    public ModelAndView home(){
        Contato c = new Contato();
        c.setNome("Joao");

        dao.save(c);

        return new ModelAndView("index").addObject("contatos", dao.findAll());
    }
}

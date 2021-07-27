package com.shopping.controller;


import com.shopping.entity.Drugs;
import com.shopping.entity.Url;
import com.shopping.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class indexcontroller {

    @GetMapping("/")
    public String home(){
        return "index";
    }


    @Autowired
    DrugsService drugsService;


    @GetMapping("/{id}")
    public String image(Model model,@PathVariable int id){

        List<Drugs> urllist = drugsService.Allitems();

        model.addAttribute("druglist", urllist);
        return "test";
    }
}

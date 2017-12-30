package com.iqmsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iqmsoft.Post;
import com.iqmsoft.PostService;

@Controller
public class HelloController {

    @Autowired
    PostService postService;


    @RequestMapping("/")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("text", "");
        return "hello";
    }
}

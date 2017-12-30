package com.iqmsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iqmsoft.PostService;

@Controller
public class CallAjax {

    @Autowired
    PostService postService;

    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    public @ResponseBody
    String hello() {
        String  post_text = postService.getTextById(1);
        String result = "<p  class=\"anim\" style=\"font-size:40px;opacity:0;color:white\">" + post_text + "</p>";
        return result;
    }
}

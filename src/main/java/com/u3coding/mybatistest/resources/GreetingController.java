package com.u3coding.mybatistest.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class GreetingController {
    @ModelAttribute
    public void addAt(@RequestParam String name,Model model){
        name = "model";
        model.addAttribute("name",name);
    }
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name",defaultValue = "world",required = false)String name, Model model) throws IOException {
        model.addAttribute("name",name);
        return "greeting";
    }
        @RequestMapping("/gree")
    public String greet(@RequestParam(value="name",defaultValue = "world",required = false)String name,@ModelAttribute("name") String name1
                        ,Model model) throws IOException {
        model.addAttribute("name",name1);
        return "greeting";
    }
    @RequestMapping(value = "/uploadfile",headers = "content-type=multipart/*")
    public String upload(@RequestParam("file")MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        return "uploadfile";
    }
}

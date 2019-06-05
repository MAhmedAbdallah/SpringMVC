/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.controllers;

import com.vodafone.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("/")
public class MainController {
    
    
  
    @RequestMapping(value="hello" , method = RequestMethod.GET)
   //   @ResponseBody
    public String getText (Model model){
        
        model.addAttribute("userObject",new User());
        return "index";
    }
    
    @RequestMapping("user")
   //   @ResponseBody
    public String updateUser (Model model , User user){
        model.addAttribute("userObject",user);
        return "hello";
    }
}

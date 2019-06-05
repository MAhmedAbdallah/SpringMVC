/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("/")
public class MainController {
    
    
  
    @RequestMapping("hello")
   //   @ResponseBody
    public String getText (){
        return "index";
    }
}

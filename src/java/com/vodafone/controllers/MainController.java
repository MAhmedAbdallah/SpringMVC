/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.controllers;

import com.vodafone.models.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    //   @ResponseBody
    public String getText(Model model) {

        model.addAttribute("userObject", new User());
        return "index";
    }

    @RequestMapping(value = "user")
    //   @ResponseBody
    public String updateUser(
           @Valid  @ModelAttribute("userObject") User user, BindingResult result
    ) {
        //model.addAttribute("userObject",user);
        String path = "";

            if (result.hasErrors()) {
            path = "hello";
        }
        return "hello";
    }
}

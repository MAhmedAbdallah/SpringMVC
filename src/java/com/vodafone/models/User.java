/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




/**
 *
 * @author V19MFoda
 */
public class User {

    @NotNull(message = "Enter something!")
    private String id;

    public User() {
        // this.id = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

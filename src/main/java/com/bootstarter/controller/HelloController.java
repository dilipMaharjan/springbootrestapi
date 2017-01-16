/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dmaharjan
 */
@RestController
public class HelloController {

    @RequestMapping(method =RequestMethod.GET ,value = "/")
    public String index() {
        return "Hello Boot from Netbeans";
    }

}

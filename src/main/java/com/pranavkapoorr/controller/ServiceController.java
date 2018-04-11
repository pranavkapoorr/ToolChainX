
package com.pranavkapoorr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ServiceController {

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = "text/html")
    public String getHome() {   
    	return  "home";
    }
}
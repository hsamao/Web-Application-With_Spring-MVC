package com.samao.dymcWeb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hsamao on 10/25/15.
 */

@Controller
public class LoginController {

    @RequestMapping (value = "/login", method = RequestMethod.GET)
    public String showLogin() {
        return "login";
    }
}

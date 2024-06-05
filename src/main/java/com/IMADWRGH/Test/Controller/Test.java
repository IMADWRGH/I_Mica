package com.IMADWRGH.Test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class Test {

    @GetMapping(path = "/test")
    public String test(){
        return "IMAD ASSERNE";
    }
}

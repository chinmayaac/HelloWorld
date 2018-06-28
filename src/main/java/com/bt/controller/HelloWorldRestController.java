package com.bt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 611227452 on 6/28/2018.
 */
@RestController
public class HelloWorldRestController {

    @GetMapping("/getString")
    public String getString(){
        return "Hello World";
    }
}

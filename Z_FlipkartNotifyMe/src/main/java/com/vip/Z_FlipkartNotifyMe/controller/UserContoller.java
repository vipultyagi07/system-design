package com.vip.Z_FlipkartNotifyMe.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserContoller {


    @PostMapping("/notify-me")
    public void addToTheOberserversListForCertainProduct(){


    }
}

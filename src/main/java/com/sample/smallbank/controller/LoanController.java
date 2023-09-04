package com.sample.smallbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/myLoans")
    public String getLoanDetails(){
        return "Data from DB about user's loans";
    }

}

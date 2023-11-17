package com.example.webservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class TaxController {

    @PostMapping("/calculateTax")
    public double calculateTax(@RequestBody double salary) {
        if (salary <= 5000) {
            return 0;
        }
        else if (salary <= 8000) {
            return salary * 0.04;
        }
        else if (salary <= 10000) {
            return salary * 0.05;
        }
        else if (salary <= 16000) {
            return salary * 0.08;
        }
        else if (salary <= 24000) {
            return salary * 0.25;
        }
        else {
            return salary * 0.4;
        }
    }
}
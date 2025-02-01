package com.azure.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/{name}")
    public String echo(@PathVariable String name) {
        return "Hi " + name + ": Your request has been processed successfully";
    }
}

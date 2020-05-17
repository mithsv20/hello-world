package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloService {

    @RequestMapping("/")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/abc")
    public String abc(){
        return "inside abc";
    }

    @RequestMapping("/all")
    public List<Rating> getAllRatings() {
        return Arrays.asList(new Rating("123", 5), new Rating("124", 2), new Rating("125", 4),
                new Rating("126", 3));
    }

}

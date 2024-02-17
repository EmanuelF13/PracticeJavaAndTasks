package org.emanuel.hello.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {


    @GetMapping
    public List<String> greeting() {
        return List.of("Hello Guys!");
    }

}

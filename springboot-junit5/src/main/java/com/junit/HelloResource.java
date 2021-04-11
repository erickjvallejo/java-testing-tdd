package com.junit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello json() {

        return new Hello("Greetings", "Hello World");

    }
}

@AllArgsConstructor
@Getter
@ToString
class Hello {

    private final String name;
    private final String value;


}

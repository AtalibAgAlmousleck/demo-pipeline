package com.atalibdev;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    @GetMapping
    public ResponseEntity<List<DemoApp>> demoPage() {
        return new ResponseEntity<>(List.of(new DemoApp(
                1, "Testing", 200
        )), HttpStatus.OK);
    }

    @GetMapping("/message")
    public String message() {
        return "Message received";
    }
}

package com.develhope.ControllerConGet;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class Controller {
    @GetMapping(path="/saluto/{provincia}")
    public Saluto saluta(@RequestParam String nome,
                         @PathVariable String provincia){
        return new Saluto(nome, provincia);
    }
}

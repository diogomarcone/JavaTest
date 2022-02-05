package com.javatest.JavaTest.controller;

import com.javatest.JavaTest.model.Frete;
import com.javatest.JavaTest.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FreteController {

    @Autowired
    private FreteService service;

    @PostMapping("/addFrete")
    public Frete addFrete(@RequestBody Frete frete){
        return service.saveFrete(frete);
    }
    @PostMapping("/addFretes")
    public List<Frete> addFretes(@RequestBody List<Frete> fretes){
        return service.saveFretes(fretes);
    }
    @GetMapping("/fretes")
    public List<Frete> findAllFretes(){
        return service.getFretes();
    }
    @GetMapping("/frete/{id}")
    public Frete findFreteById(@PathVariable Long id){
        return service. getFreteById(id);
    }
    @GetMapping("/frete/{name}")
    public Frete findFreteByName(@PathVariable String nomeDestinatario){
        return service. getFreteByName(nomeDestinatario);
    }
    @PutMapping("/update")
    public Frete updateFrete(@RequestBody Frete frete){
        return service.updateFrete(frete);
    }
    @DeleteMapping("delete/{id}")
    public String deleteFrete(@PathVariable Long id){
        return service.deleteFrete(id);
    }

}

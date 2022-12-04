package com.example.RestfulCRUD.controller;

import com.example.RestfulCRUD.model.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIService {

    Model model;

    @GetMapping("{id}")
    public Model getId(@PathVariable long id){
        //return new Model(1,"Onur","Bagci",0500521);
        return model;
    }

    @PostMapping
    public String createModelDetails(@RequestBody Model model){
        this.model = model;
        return "Model created succesfuly!";
    }

    @PutMapping
    public String updateModel(@RequestBody Model model){
        this.model = model;
        return "Model updated succesfuly!";
    }

    @DeleteMapping("{id}")
    public String deleteModel(@PathVariable long id){
        this.model = null;
        return "Model deleted succesfuly!";
    }
}

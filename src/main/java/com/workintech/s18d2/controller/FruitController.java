package com.workintech.s18d2.controller;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/fruits")
public class FruitController {
    private final FruitService fruitService;
@Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/")
    public Fruit save(@RequestBody Fruit fruit){
        return fruitService.save(fruit);
    }
    @GetMapping("/")
    public List<Fruit> allFruit(){
    return fruitService.allFruit();
    }

    @GetMapping("/desc")
    public List<Fruit> decPriceFruit() {
        return fruitService.decPriceFruit();
    }
    @PostMapping("/{name}")
    public List<Fruit> searchFruit(@PathVariable("name") String name){
         return  fruitService.searchFruit(name);
    }
    @GetMapping("/{id}")
    public Fruit findById(@PathVariable long id){
    return fruitService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Fruit removeFruit(@PathVariable long id){
    return fruitService.remove(id);
    }

}

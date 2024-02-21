package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.exception.FruitException;
import com.workintech.s18d2.repository.FruitRepository;
import com.workintech.s18d2.util.FruitValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FruitServiceImpl implements FruitService {
    private final FruitRepository fruitRepository;
    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> decPriceFruit() {
      return fruitRepository.decPriceFruit();
        //return null;
    }

    @Override
    public Fruit findById(Long id) {
        FruitValidation.checkId(id);
        Optional<Fruit> fruitOptional=fruitRepository.findById(id);
        if (fruitOptional.isPresent()){
            return fruitOptional.get();
        }
        //TODO error handler ekle
        throw new FruitException("bu id mevcut değil",HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Fruit> growPriceVegetable() {
       return fruitRepository.growPriceFruit();

    }

    @Override
    public Fruit save(Fruit fruit) {
        FruitValidation.checkFruitObject(fruit);
        fruitRepository.save(fruit);
        return fruit;

    }

    @Override
    public List<Fruit> searchFruit(String name) {

        return fruitRepository.searchFruit(name);

    }

    @Override
    public List<Fruit> allFruit() {
        return fruitRepository.allFruit();
    }

    @Override
    public Fruit remove(long id) {
        FruitValidation.checkId(id);
        Optional<Fruit> fruitOptional=fruitRepository.findById(id);
        if (fruitOptional.isPresent()){
            Fruit fruit=fruitOptional.get();
            fruitRepository.delete(fruit);
            return fruit;
        }
        //TODO error handler ekle3
        throw new FruitException("bu id mevcut değil",HttpStatus.NOT_FOUND);
    }
}

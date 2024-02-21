package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FruitService {

  List<Fruit> decPriceFruit();

  Fruit findById(Long id);

  List<Fruit> growPriceVegetable();

  Fruit save(Fruit fruit);

  List<Fruit> searchFruit(String name);

  List<Fruit> allFruit();



  Fruit remove(long id);




}

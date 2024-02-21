package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> decPriceFruit();

    Vegetable findById(Long id);

    List<Vegetable> growPriceVegetable();

    Vegetable save(Vegetable vegetable);

    List<Vegetable> searchFruit(String name);

    Vegetable remove(long id);
}

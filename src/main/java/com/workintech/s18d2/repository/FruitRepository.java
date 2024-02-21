package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

   @Query("SELECT f FROM Fruit f  ORDER BY f.price desc")
    public List<Fruit> decPriceFruit();


   @Query("SELECT f FROM Fruit f ORDER BY f.price ASC")
    public List<Fruit> growPriceFruit();



   @Query("SELECT f FROM Fruit f WHERE f.name ILIKE %:name% ORDER BY f.name ")
    public List<Fruit> searchFruit(String name);


     @Query("SELECT f FROM Fruit f")
     List<Fruit> allFruit();

}

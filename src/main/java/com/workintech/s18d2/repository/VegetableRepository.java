package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable,Long> {
//    @Query("SELECT v FROM Vegetable WHERE v.price ORDER BY v.price DESC")
//    public List<Vegetable> decPriceVegetable();
//
//    @Query("SELECT v FROM Vegetable WHERE v.price ORDER BY v.price ASC")
//    public List<Vegetable> growPriceVegetable();
//
//    @Query("SELECT v FROM Vegetable WHERE v.name LIKE CONTACT('%',:name,'%') ORDER BY v.name ")
//    public List<Fruit> searchVegetable(String name);
}

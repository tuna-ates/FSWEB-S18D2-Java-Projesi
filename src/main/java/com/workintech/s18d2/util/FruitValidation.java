package com.workintech.s18d2.util;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.FruitType;
import com.workintech.s18d2.exception.FruitException;
import org.springframework.http.HttpStatus;

public class FruitValidation {

    public static void checkId(Long id) {
        if(id<0){
        throw new FruitException("id 0 dan küçük olamaz ", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkFruitObject(Fruit fruit) {

        if (fruit.getFruitType()==null){
            throw new FruitException("lütfen fruit type bilgilerini tam giriniz!!",HttpStatus.BAD_REQUEST);
        }
        else if (fruit.getName()==null||fruit.getName().isEmpty()){
            throw new FruitException("lütfen fruit name bilgilerini tam giriniz!!",HttpStatus.BAD_REQUEST);

        }
        else if (fruit.getPrice()<0||fruit.getPrice()==0){
            throw new FruitException("lütfen fruit price bilgilerini 0 dan büyük giriniz!!",HttpStatus.BAD_REQUEST);

        }
    }



}

package com.design.abstractfactory.factory;

import com.design.abstractfactory.interfaces.HotDrink;

public interface AbstractFactory {
    HotDrink create(String drinkType) ;
}
package org.example.DecoratorPattern;

import org.example.DecoratorPattern.BaseClasses.BasePizza;
import org.example.DecoratorPattern.BaseClasses.Margherita;
import org.example.DecoratorPattern.DecoratorClasses.ExtraCheese;
import org.example.DecoratorPattern.DecoratorClasses.Mushroom;

public class DecoratorPatternMain {
    public static void main(String[] args) {

        System.out.println("----------DECORATOR PATTERN DEMO---------------");

        BasePizza margheritaBasePizza = new Margherita();
        System.out.println("Price of margherita base pizza :: " + margheritaBasePizza.cost());

        // base pizza (margherita) with extra cheese
        BasePizza margheritaWithExtraCheese = new ExtraCheese(margheritaBasePizza);
        System.out.println("Price of margherita pizza with extra cheese :: " + margheritaWithExtraCheese.cost());

        // margheritaWithExtraCheese (now becomes base) with mushroom
        BasePizza margheritaWithExtraCheeseAndMushroom = new Mushroom(margheritaWithExtraCheese);
        System.out.println("Price of margherita with extra cheese and mushroom :: " + margheritaWithExtraCheeseAndMushroom.cost());

    }
}
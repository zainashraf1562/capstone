package com.pluralsight.waffleShop.Products.SignatureWaffles;

import com.pluralsight.waffleShop.Products.Waffle;
import com.pluralsight.waffleShop.Toppings.Chocolate;
import com.pluralsight.waffleShop.Toppings.Fruit;
import com.pluralsight.waffleShop.Toppings.Syrup;

public class SpecialWaffle extends Waffle {
    public SpecialWaffle() {
        super("Special","Cinnamon", "medium", true);

        addToppings(new Syrup("Chocolate Syrup",false));
        addToppings(new Fruit("Raspberries",false));
        addToppings(new Fruit("Pineapple",false));
        addToppings(new Chocolate("Hershey","medium",false));
        addToppings(new Chocolate("KitKat","medium",false));

    }
}

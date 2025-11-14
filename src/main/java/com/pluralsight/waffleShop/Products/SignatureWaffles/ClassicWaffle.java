package com.pluralsight.waffleShop.Products.SignatureWaffles;

import com.pluralsight.waffleShop.Products.Waffle;
import com.pluralsight.waffleShop.Toppings.Fruit;
import com.pluralsight.waffleShop.Toppings.Syrup;
import com.pluralsight.waffleShop.Toppings.Topping;

public class ClassicWaffle extends Waffle {

    public ClassicWaffle() {
        super("Classic","Buttermilk", "medium", false);

        addToppings(new Syrup("Maple Syrup",false));
        addToppings(new Fruit("Strawberries",false));
        addToppings(new Fruit("Banana",false));

    }
}

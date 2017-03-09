/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 *
 * @author dmaharjan
 */
public class VegBurger extends Burger {

    @Override
    public float getPrice() {
        return 25.5f;
    }

    @Override
    public String getName() {
        return "Veg Burger";
    }

}

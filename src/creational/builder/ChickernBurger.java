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
public class ChickernBurger extends Burger {

    @Override
    public float getPrice() {
        return 50.6f;
    }

    @Override
    public String getName() {
        return "Chicken Burger";
    }

}

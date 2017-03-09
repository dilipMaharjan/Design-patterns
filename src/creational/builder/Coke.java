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
public class Coke extends ColdDrink {

    @Override
    public float getPrice() {
        return 15.4f;
    }

    @Override
    public String getName() {
        return "Coke";
    }

}

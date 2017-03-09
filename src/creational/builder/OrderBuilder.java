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
public class OrderBuilder {

    public Order orderVeg() {
        Order order = new Order();
        order.addItem(new VegBurger());
        order.addItem(new Coke());
        return order;
    }

    public Order orderChicken() {
        Order order = new Order();
        order.addItem(new ChickernBurger());
        order.addItem(new Sprite());
        return order;
    }
}

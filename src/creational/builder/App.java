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
public class App {

    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();
        System.out.println("-----Veg Item-----");
        Order vegOrder = orderBuilder.orderVeg();
        vegOrder.showOrder();
        System.out.println("Toal cost : " + vegOrder.totalCost());

        System.out.println("-----Chicken Item-----");
        Order chickenOrder = orderBuilder.orderChicken();
        chickenOrder.showOrder();
        System.out.println("Toal cost : " + chickenOrder.totalCost());

    }
}

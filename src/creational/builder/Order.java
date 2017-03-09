/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmaharjan
 */
public class Order {

    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float totalCost() {
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showOrder() {
        for (Item item : itemList) {
            System.out.println("Item : " + item.getName() + " , Packing : " + item.packing().pack() +  ", Price : " + item.getPrice());
        }
    }
}

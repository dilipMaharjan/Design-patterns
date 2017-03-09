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
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Packer();
    }

    @Override
    public abstract float getPrice();

}

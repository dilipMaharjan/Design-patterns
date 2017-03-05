/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractfactory;

/**
 *
 * @author dmaharjan
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}

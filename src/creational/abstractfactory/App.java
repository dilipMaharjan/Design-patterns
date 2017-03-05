/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory.abstractfactory;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.FactoryProducer;

/**
 *
 * @author dmaharjan
 */
public class App {

    public static void main(String[] args) {
        //get shape
        System.out.println("Shapes");
        AbstractFactory abstractFactoryShape = FactoryProducer.getFactory("shape");
        abstractFactoryShape.getShape("circle").draw();
        abstractFactoryShape.getShape("square").draw();
        abstractFactoryShape.getShape("rectangle").draw();
        System.out.println("\nColors");
        //fill color
        AbstractFactory abstractFactoryColor = FactoryProducer.getFactory("color");
        abstractFactoryColor.getColor("red").fill();
        abstractFactoryColor.getColor("blue").fill();
        abstractFactoryColor.getColor("orange").fill();

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

/**
 *
 * @author dmaharjan
 */
public class ShapeFactory {

    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton;

/**
 *
 * @author dmaharjan
 */
public class Ball {

    private static Ball ballInstance = null;

    public static Ball getBallInstance() {
        if (ballInstance == null) {
            ballInstance = new Ball();
        }
        return ballInstance;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

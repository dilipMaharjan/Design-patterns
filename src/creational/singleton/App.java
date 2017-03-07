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
public class App {

    public static void main(String[] args) {
        Ball ball = Ball.getBallInstance();
        ball.displayMessage("Hello singleton");
        ball.displayMessage("Hello singleton1");
        ball.displayMessage("Hello singleton2");
        Ball ball1 = Ball.getBallInstance();
        if (ball.equals(ball1)) {
            System.out.println("Same object");
        }
    }
}

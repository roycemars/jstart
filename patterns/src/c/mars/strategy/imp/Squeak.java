package c.mars.strategy.imp;

import c.mars.strategy.abs.QuackBehavior;

/**
 * Created by Constantine Mars on 7/27/15.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeaking");
    }
}

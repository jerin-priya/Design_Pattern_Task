
package com.mycompany.abstractfactorydesignpattern;

public class Level2DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score) {
        if(score > 2000) return new PersistentDebrisField();
        else return new StaticDebrisField();
    }
}
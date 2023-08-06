
package com.mycompany.abstractfactorydesignpattern;

public class Level1DebrisFieldFactory extends DebrisFieldFactory {
    @Override
    public Obstacle createObstacle(int score){
        if(score > 1500) return new DynamicDebrisField();
        else return new StaticDebrisField();
    }
}



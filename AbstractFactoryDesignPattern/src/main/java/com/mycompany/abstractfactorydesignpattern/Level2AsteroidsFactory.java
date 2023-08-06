package com.mycompany.abstractfactorydesignpattern;

public class Level2AsteroidsFactory extends AsteroidsFactory {
    @Override
    public Obstacle createObstacle(int score){
        if(score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
    
}

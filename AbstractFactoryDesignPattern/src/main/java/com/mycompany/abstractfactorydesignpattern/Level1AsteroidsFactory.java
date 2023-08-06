package com.mycompany.abstractfactorydesignpattern;

public class Level1AsteroidsFactory extends AsteroidsFactory {
    @Override
    public Obstacle createObstacle(int score){
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}


package com.mycompany.abstractfactorydesignpattern;

public class Level1BlackHolesfactory extends BlackHolesFactory {
    @Override
    public Obstacle createObstacle(int score){
        if(score > 3500) return new Medium_BlackHoles();
        else return new Small_BlackHoles();
    }
    
}

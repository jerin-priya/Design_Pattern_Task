
package com.mycompany.abstractfactorydesignpattern;

public class Level2BlackHolesFactory extends BlackHolesFactory {
    @Override
    public Obstacle createObstacle(int score){
        if(score > 4000) return new Large_BlackHoles();
        else return new Medium_BlackHoles();
    }
    
}

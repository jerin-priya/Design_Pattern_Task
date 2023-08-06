
package com.mycompany.abstractfactorydesignpattern;

public class Level1SolarFlaresFactory extends SolarFlaresFactory {
    @Override
    public Obstacle createObstacle(int score){
        if(score > 2500) return new Small_SolarFlares();
        else return new Medium_SolarFlares();
    }
    
}


package com.mycompany.abstractfactorydesignpattern;


public class Level2SolarFlaresfactory extends SolarFlaresFactory {
    @Override
    public Obstacle createObstacle(int score){
        if(score > 3000) return new Medium_SolarFlares();
        else return new Small_SolarFlares();
    }
    
    
}

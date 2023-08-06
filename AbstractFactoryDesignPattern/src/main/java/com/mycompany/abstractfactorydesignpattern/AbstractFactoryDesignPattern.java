package com.mycompany.abstractfactorydesignpattern;

public class AbstractFactoryDesignPattern {

    public static void main(String[] args) {
        int level=(int)(Math.random()*3)+1;
        
        ObstacleFactory obstaclefactory;
        
        //Asteroids
        if(level==1) obstaclefactory = new Level1AsteroidsFactory();
        else obstaclefactory = new Level2AsteroidsFactory();
        
        int score=(int)(Math.random()*2000);
        
        Obstacle obstacle = obstaclefactory. createObstacle(score);
        obstacle.show();
        
        //DebrisField
        if(level==1) obstaclefactory = new Level1DebrisFieldFactory();
        else obstaclefactory = new Level2DebrisFieldFactory();
        
        obstacle = obstaclefactory. createObstacle(score);
        obstacle.show();
        
        //Solar flares
        if(level==1) obstaclefactory = new Level1AsteroidsFactory();
        else obstaclefactory = new Level2SolarFlaresfactory();
        
        obstacle = obstaclefactory. createObstacle(score);
        obstacle.show();
        
        //Black Holes
        
        if(level==1) obstaclefactory = new Level1BlackHolesfactory();
        else obstaclefactory = new Level2BlackHolesFactory();
        
        obstacle = obstaclefactory. createObstacle(score);
        obstacle.show();
        
        
        
    }
}

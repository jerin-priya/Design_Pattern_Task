
package com.mycompany.builderdesignpattern;

public class Burger {
    private final double totalcost;
    private final int meat;
    private final int cheese;
    private final int letus;

    private Burger(BurgerBuilder builder) {
        this.totalcost = builder.getCost();
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.letus = builder.letus;
    }

    // getters for all fields


    public double getCost() {
        return totalcost;
    }
    
     public int numOfMeat() {
        return meat;
    }


    public int numOfCheese() {
        return cheese;
    }

    public int numOfLetus() {
        return letus;
    }

    public static class BurgerBuilder {
        
        private int meat = 0;
        private int cheese = 0;
        private int letus = 0;
        private final int meat_price = 40;
        private final int cheese_price = 25;
        private final int letus_price = 15;
        
        public BurgerBuilder(){}

        public double getCost(){
            return meat * meat_price + cheese * cheese_price + letus * letus_price;
        }
        
        
          public BurgerBuilder meat(int meat) {
            this.meat += meat;
            return this;
        }


        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese;
            return this;
        }

        public BurgerBuilder letus(int letus) {
            this.letus += letus;
            return this;
        }

      
        public Burger build() {
            return new Burger(this);
        }
    }

}

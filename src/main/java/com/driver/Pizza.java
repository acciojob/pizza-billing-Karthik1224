package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Integer bill;

    private Integer cheese;
    private Integer paperbag;

    private Integer toppings;

    protected boolean extraCheese;
    protected boolean extraToppings;
    private boolean bag;

    //private boolean billGenerator;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
         if(isVeg == true)
         {
             price = 300;
             toppings = 70;
             bill = price;
         }
         else
         {
             price = 400;
             toppings = 120;
             bill = price;
         }
         cheese = 80;
         paperbag = 20;
         extraCheese=false;
         extraToppings=false;
         bag=false;
         //billGenerator=false;

    }

    public int getPrice()
    {
        return this.price;

    }

    public void addExtraCheese() {
        // your code goes here
       if(extraCheese==false)
       {
           bill += cheese;
           extraCheese = true;
       }
    }

    public void addExtraToppings(){
        // your code goes here
       if(extraToppings == false)
       {
           bill += toppings;
           extraToppings = true;
       }

    }

    public void addTakeaway(){
        // your code goes here
        if(bag==false)
        {
            bill += paperbag;
            bag = true;
        }

    }

    public String getBill(){
        // your code goes here
        StringBuilder ans = new StringBuilder();

          ans.append("Base Price Of The Pizza: ").append(price).append("\n");
          if (extraCheese == true) {
              ans.append("Extra Cheese Added: ").append(80).append("\n");
          }
          if (extraToppings == true) {
              int toppings = isVeg ? 70 : 120;
              ans.append("Extra Toppings Added: ").append(toppings).append("\n");
          }
          if (bag == true) {
              ans.append("Paperbag Added: ").append(20).append("\n");
          }
          ans.append("Total Price: ").append(bill).append("\n");

     return ans.toString();


    }
}

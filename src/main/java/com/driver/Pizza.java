package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Integer bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
         if(isVeg == true)
         {
             price = 300;
             bill = 300;
         }
         else
         {
             price = 400;
             bill = 400;
         }
       //System.out.println("Base Price Of The Pizza: "+price);
    }

    public int getPrice()
    {
        return this.price;

    }

    public void addExtraCheese(){
        // your code goes here
          if(isVeg==true)
          {
              bill += 80;
          }
          else
          {
              bill += 80;
          }
        //System.out.println("Extra Cheese Added: "+80);
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true)
        {
            bill += 70;
            //System.out.println("Extra Toppings Added: "+70);
        }
        else
        {
            bill += 120;
            //System.out.println("Extra Toppings Added: "+120);
        }

    }

    public void addTakeaway(){
        // your code goes here
        bill += 20;
        //System.out.println("Paperbag Added: "+20);
    }

    public String getBill(){
        // your code goes here
        return String.valueOf(bill);
    }
}

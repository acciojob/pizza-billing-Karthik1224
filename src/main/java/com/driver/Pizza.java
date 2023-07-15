package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Integer bill;

    protected boolean extraCheese;
    protected boolean extraToppings;
    private boolean bag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
         if(isVeg == true)
         {
             price = 300;
             bill = price;
         }
         else
         {
             price = 400;
             bill = price;
         }
         extraCheese=false;
         extraToppings=false;
         bag=false;

    }

    public int getPrice()
    {
        return this.price;

    }

    public void addExtraCheese() {
        // your code goes here
        bill += 80;
        extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true)
        {
            bill += 70;

        }
        else
        {
            bill += 120;

        }

        extraToppings = true;

    }

    public void addTakeaway(){
        // your code goes here
        bill += 20;
        bag = true;

    }

    public String getBill(){
        // your code goes here
      StringBuilder ans = new StringBuilder();
      ans.append("Base Price Of The Pizza: ").append(price).append("\n");
      if(extraCheese==true)
      {
          ans.append("Extra Cheese Added: ").append(80).append("\n");
      }
     if(extraToppings==true)
     {
         int toppings = isVeg? 70 : 120;
         ans.append("Extra Toppings Added: ").append(toppings).append("\n");
     }
     if(bag == true)
     {
         ans.append("Paperbag Added: ").append(20).append("\n");
     }
     ans.append("Total Price: ").append(bill).append("\n");
     return ans.toString();


    }
}

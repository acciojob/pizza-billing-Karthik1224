package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Integer totalPrice;

    private Integer cheese;
    private Integer paperbag;

    private Integer toppings;

    private String bill;
    protected boolean extraCheese;
    protected boolean extraToppings;
    private boolean bag;

    private boolean billGenerator;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
         if(isVeg == true)
         {
             price = 300;
             toppings = 70;
             totalPrice = price;
         }
         else
         {
             price = 400;
             toppings = 120;
             totalPrice = price;
         }
         cheese = 80;
         paperbag = 20;
         extraCheese=false;
         extraToppings=false;
         bag=false;
         billGenerator=false;
        this.bill=this.bill+"Base Price Of The Pizza: "+price+"\n";

    }

    public int getPrice()
    {
        return this.price;

    }

    public void addExtraCheese() {
        // your code goes here
       if(extraCheese==false)
       {
           this.bill=this.bill+"Extra Cheese Added: "+cheese+"\n";
           extraCheese = true;
           totalPrice += cheese;
       }
    }

    public void addExtraToppings(){
        // your code goes here
       if(extraToppings == false)
       {
           this.bill=this.bill+"Extra Toppings Added: "+toppings+"\n";
           totalPrice += toppings;
           extraToppings = true;
       }

    }

    public void addTakeaway(){
        // your code goes here
        if(bag==false)
        {
            this.bill=this.bill+"Paperbag Added: "+paperbag+"\n";
            totalPrice += paperbag;
            bag = true;
        }

    }

    public String getBill(){
        // your code goes here
        if(billGenerator==false)
        {
            billGenerator = true;
            this.bill = this.bill + "Total Price: " + totalPrice +"\n";
        }
       return bill;

    }
}

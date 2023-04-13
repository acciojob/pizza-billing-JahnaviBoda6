package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraToppings;
    private int takeAway;
    public boolean isDeluxe=false;


    public void setDeluxe(boolean isDeluxe) {
        this.isDeluxe = isDeluxe;
    }
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price=300;
        }
        else{
            price=400;
        }
    }
    public Pizza(Boolean isVeg, Boolean isDeluxe){
        this.isVeg = isVeg;
        if(isVeg){
            price=300;
        }
        else{
            price=400;
        }
        if(isDeluxe){
            addExtraCheese();
            addExtraToppings();
        }
    }

    public int getPrice(){
        return price+extraToppings+extraCheese+takeAway;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese = 80;
    }

    public void addExtraToppings(){
        // your code goes here veg-->70, non veg-->120
        if(isVeg) extraToppings = 70;
        else extraToppings = 120;
    }

    public void addTakeaway(){
        // your code goes here
        // bag=20
            takeAway = 20;
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price of the Pizza: "+price+"/n";
        if(extraCheese!=0){
            bill+= "Extra Cheese Added: "+extraCheese+"/n";
        }
        if(extraToppings!=0) bill+="Extra Toppings Added: "+extraToppings+"/n";
        if(takeAway!=0) bill+="Paperbag Added: "+takeAway+"/n";
        bill += "Total Price: "+ (price+extraToppings+extraCheese+takeAway) +"/n";
        return this.bill;
    }
}

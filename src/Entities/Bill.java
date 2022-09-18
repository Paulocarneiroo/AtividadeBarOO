package Entities;

public class Bill {
    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    int beerPrice = 5;
    int sodaPrice = 3;
    int barbPrice = 7;

    public Bill(){

    }

    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public double cover(){
        double couvert;
        if(feeding() > 30.0){
            couvert = 0.0;
        }
        else{
            couvert = 4.0;
        }
        return couvert;
    }

    public double ticket(char gender){
        double priceTicket = 0.0;
        if (gender == 'm' || gender == 'M'){
         priceTicket = 10.0;
        } else if (gender == 'f' || gender == 'F') {
            priceTicket = 8.0;
        }
        return priceTicket;
    }

    public double feeding(){
        return (beer*beerPrice + barbecue*barbPrice + softDrink*sodaPrice);
    }

    public double total(){
        return cover() + ticket(gender) + feeding();
    }
}

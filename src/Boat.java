
import java.io.*;
public class Boat implements Serializable{
    private static enum TypesBoat {SAILING, POWER};
    private static final int MAX_LENGTH = 100;
    private static final double MAX_PURCHASE_PRICE = 1000000000;



    String boatType;
    String name;
    int yearMade;
    String model;
    int length;
    double price;
    double expenses;


    //Default Constructor
    public Boat(){

        String boatType = "";
        String name = "";
        int yearMade = 0;
        String model = "";
        int length = 0;
        double price = 0.0;
        double expenses = 0.0;

    }

    // Constructor with parameters
    public Boat(String boatType, String name, int yearMade, String model, int length, double price, double expenses){
        this();
        this.boatType = boatType;
        this.name = name;
        this.yearMade = yearMade;
        this.model = model;
        this.length = length;
        this.price = price;
        this.expenses = expenses;

    }

    //Print Boat object
    public String toString(){
        return(String.format("%s $%.2f",boatType, name, yearMade, model,length, price, expenses));

    }

    // Get Data
    public String getName(){
        return(name);
    }

    public int getYearMade(){
        return(yearMade);
    }

    public String getModel(){
        return(model);
    }

    public int getLength(){
        return(length);
    }

    public String getBoatType(){
        return(boatType);
    }

    public double getPrice(){
        return(price);
    }

    public double getExpenses(){
        return(expenses);
    }

    public void setExpenses(){
        this.expenses = expenses;
    }
}
